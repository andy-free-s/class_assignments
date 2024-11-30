public abstract class Leader {
    protected String title; // 新增职称属性
    protected int approvalLimit;
    protected Leader successor;

    public Leader(String title, int approvalLimit) {
        this.title = title;
        this.approvalLimit = approvalLimit;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveRequest request);
}