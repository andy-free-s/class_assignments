public class Dean extends Leader{
    public Dean(String name){
        super(name);
    }
    public void handleRequest(LeaveRequest request){
        if(request.getBucks() <= 10000){
            System.out.println("院长:" + name + "审批" + request.getName() +
                    "的采购为" + request.getBucks()+"元");
        }
        else{
            if(this.successor != null){
                this.successor.handleRequest(request);
            }
        }
    }
}
