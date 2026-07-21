package OopsPrinciples.Encapsulation;

public class Recharge {
    private String MobileNum;
    private String OperatorName;
    private int RechargeAmt;

    public String getMobilenum() {
        return MobileNum;
    }

    public void setMobilenum(String MobileNum) {
        if (MobileNum.length() == 10) {
            this.MobileNum = MobileNum;
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }

    public String getOpeName() {
        return OperatorName;
    }

    public void setOpeName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    public int getRechargeamt() {
        return RechargeAmt;
    }

    public void setRechargeamt(int RechargeAmt) {
        if (RechargeAmt >= 10) {
            this.RechargeAmt = RechargeAmt;
        } else {
            System.out.println("Recharge Amount should be at least 10");
        }
    }
}