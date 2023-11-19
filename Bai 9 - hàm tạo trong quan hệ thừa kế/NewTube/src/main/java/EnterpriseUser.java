public class EnterpriseUser extends User {
    private String company;
    private int temporaryValue;

    public EnterpriseUser() {
        System.out.println("Init Enterprise User");
    }

    public EnterpriseUser(int parentTemp, int myTemp) {
        super.temporaryValue = parentTemp;
        this.temporaryValue = myTemp;
    }

    public EnterpriseUser(String email, String password, String nickname, String company) {
        super(email, password, nickname);
        this.company = company;
    }

    public void printEnterpriseUserInfo() {
        super.printUserInfo();
        System.out.println("- company : " + this.company);
    }

    public void printTemporaryValues() {
        System.out.println("Parent's temp value is " + super.temporaryValue);
        System.out.println("My temp value is " + this.temporaryValue);
    }
}
