public class ViceDean extends Leader{
    public ViceDean(String name){
        super(name);
    }
    public void handleRequest(LeaveRequest request){
        if(request.getBucks() <=8000){
            System.out.println("副院长:"+name + "审批"+ request.getName()+
                    "的采购为"+ request.getBucks() + "元");
        }else{
            if(this.successor !=null){
                this.successor.handleRequest(request);
            }
        }
    }

}
