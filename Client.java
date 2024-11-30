public class Client {
    public static void main(String[] args) {
        // 加载采购审批流程
        Leader purchaseChain = XMLUtilLeader.getApprovalChain("src/purchase_config.xml");
        LeaveRequest purchaseRequest = new LeaveRequest("张三", 7000, "purchase");
        purchaseChain.handleRequest(purchaseRequest);

        // 加载批假审批流程
        Leader leaveChain = XMLUtilLeader.getApprovalChain("src/leave_config.xml");
        LeaveRequest leaveRequest = new LeaveRequest("李四", 5, "leave");
        leaveChain.handleRequest(leaveRequest);
    }
}
