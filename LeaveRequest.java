public class LeaveRequest {
    private String name;
    private int amountOrDays; // 可表示金额或天数
    private String type;      // 类型: "purchase" 或 "leave"

    public LeaveRequest(String name, int amountOrDays, String type) {
        this.name = name;
        this.amountOrDays = amountOrDays;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAmountOrDays() {
        return amountOrDays;
    }

    public String getType() {
        return type;
    }
}
