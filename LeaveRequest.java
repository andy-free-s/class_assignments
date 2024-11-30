public class LeaveRequest {
    private String Name;
    private int Bucks;

    public LeaveRequest(String Name,int Bucks){
        this.Name = Name;
        this.Bucks = Bucks;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setBucks(int Bucks){
        this.Bucks = Bucks;
    }
    public String getName(){
        return (this.Name);
    }
    public int getBucks(){
        return (this.Bucks);
    }
}
