package section7;

/**
 * Created by manishgiri on 5/11/17.
 */
public class L39Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // constructors
    /*public L39Account() {
        System.out.println("Default constructor called.");
    }*/

    public L39Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Parameterized constructor called.");;
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        }

    }

    public void withdraw(double amount) {
        if(balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully. Balance = $" + getBalance());
        }
        else {

            System.out.println("Insufficient funds, only $" + getBalance() + " available.");
        }
    }

    public static void main(String[] args) {
        //L39Account account1 = new L39Account();
        L39Account account1 = new L39Account("666", 0, "John Doe", "johndoe@gmail.com", "555-5555");
        account1.deposit(100);
        account1.withdraw(50);
    }
}
