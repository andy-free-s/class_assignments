public class Director extends Leader{
    public Director(String name){
        super(name);
    }
    public void handleRequest(LeaveRequest request){
        if(request.getBucks() <= 5000){
                System.out.println("主任:" + name + "审批" + request.getName() +
                    "的采购为" + request.getBucks() + "元");
        }else{
            if(this.successor != null){
                this.successor.handleRequest(request);
            }
        }
    }

}
