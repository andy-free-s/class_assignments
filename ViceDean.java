public class ViceDean extends Leader {
    public ViceDean(String title, int approvalLimit) {
        super(title, approvalLimit);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getAmountOrDays() <= approvalLimit) {
            System.out.println(title + "审批" + request.getName() +
                    "的" + request.getType() + "为" + request.getAmountOrDays() +
                    (request.getType().equals("purchase") ? "元" : "天"));
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}