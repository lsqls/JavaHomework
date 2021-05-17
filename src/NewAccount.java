import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class NewAccount extends Account{
    String name;
    ArrayList<Transaction> transactions;
    public NewAccount( String name,int id, double balance) {
        super(id, balance);
        this.name = name;
        transactions=new ArrayList<>();
    }

    @Override
    public void withDraw(double withdrawal) {
        super.withDraw(withdrawal);
        Transaction transaction=new Transaction('W',withdrawal,getBalance(),"取款");
        transaction.setDate(new Date());
        transactions.add(transaction);

    }

    @Override
    public void deposit(double deposit) {
        super.deposit(deposit);
        Transaction transaction=new Transaction('D',deposit,getBalance(),"存款");
        transaction.setDate(new Date());
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public static void main(String[] args) {
        NewAccount.setAnnualInterestRate(1.5);
        NewAccount newAccount=new NewAccount("George",1122,1000);
        newAccount.deposit(30);
        newAccount.deposit(40);
        newAccount.deposit(50);
        newAccount.withDraw(5);
        newAccount.withDraw(4);
        newAccount.withDraw(3);
        System.out.println(newAccount.getName()+" "+NewAccount.getAnnualInterestRate()+" "+newAccount.getBalance());
        for(Transaction transaction:newAccount.getTransactions()){
            System.out.println(transaction);
        }


    }
}

class Transaction implements Serializable {
    Date date;
    char type;//W/D
    double amount;
    double balance;
    String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
