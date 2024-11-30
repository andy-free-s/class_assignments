public class Client {
    public static void main(String arg[]){
        Leader objDirector,objDean,objVicePresident,objPresident;
        objDirector = new Director("王明主任");
        objDean = new Dean("赵强院长");
        objVicePresident = new VicePresident("李波副校长");
        objPresident = new President("肖红校长");


        objDirector.setSuccessor(objDean);
        objDean.setSuccessor(objVicePresident);
        objVicePresident.setSuccessor(objPresident);

        LeaveRequest lr1 = new LeaveRequest("张三",40000);
        objDirector.handleRequest(lr1);
    }
}
