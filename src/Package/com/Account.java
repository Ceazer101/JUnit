package Package.com;

public class Account {

    private int accountNumber;
    private String userID;
    private int deposit;

    public Account(int accountNumber, String userID, int deposit){
        this.accountNumber = accountNumber;
        this.userID = userID;
        this.deposit = deposit;
    }

    public Account(int accountNumber, String userID){
        this.accountNumber = accountNumber;
        this.userID = userID;
        this.deposit = 0;
    }

    public int insert(int money){

        return deposit +  money;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getUserID() {
        return userID;
    }

    public int getDeposit() {
        return deposit;
    }

    @Override
    public String toString() {
        return "accountNumber=" + accountNumber +
                ", userID='" + userID + '\'' +
                ", deposit=" + deposit;
    }
}
