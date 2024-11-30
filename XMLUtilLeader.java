import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilLeader {
    public static Leader getApprovalChain(String configFileName) {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File(configFileName));

            NodeList leaderNodes = doc.getElementsByTagName("leader");
            Leader previous = null;
            Leader head = null;

            for (int i = 0; i < leaderNodes.getLength(); i++) {
                String className = leaderNodes.item(i).getAttributes().getNamedItem("class").getNodeValue();
                String limit = leaderNodes.item(i).getTextContent().trim();
                int approvalLimit = Integer.parseInt(limit);
                String title = leaderNodes.item(i).getAttributes().getNamedItem("title").getNodeValue(); // 获取职称

                Class<?> clazz = Class.forName(className);
                Leader current = (Leader) clazz.getDeclaredConstructor(String.class, int.class)
                        .newInstance(title, approvalLimit);

                if (head == null) {
                    head = current;
                }
                if (previous != null) {
                    previous.setSuccessor(current);
                }
                previous = current;
            }

            return head;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
