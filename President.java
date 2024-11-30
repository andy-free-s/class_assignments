public class President extends Leader{
    public President(String name){
        super(name);
    }
    public void handleRequest(LeaveRequest request){
        if(request.getBucks() > 30000){
            System.out.println("校长:" + name+"审批" + request.getName() +
                    "的采购为" + request.getBucks() + "元");
        }
    }
}
