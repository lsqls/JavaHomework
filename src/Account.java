import java.util.Date;

public class Account {
    private int id = 0;
    private double balance=0;
    static private double annualInterestRate=0;
    private Date dateCreated;

    public Account() {
        dateCreated=new Date();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getMonthlyInterest(){
        return annualInterestRate/1200;
    }
    public void withDraw(double withdrawal){
        balance-=withdrawal;
    }

    public void deposit(double deposit){
        balance+=deposit;
    }

    public static void main(String[] args) {
        Account account=new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println(account.balance+" "+Account.getMonthlyInterest()+" "+account.getDateCreated());
    }
}
