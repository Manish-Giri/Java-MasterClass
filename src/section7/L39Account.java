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
        L39Account account1 = new L39Account();
        account1.deposit(100);
        account1.withdraw(50);
    }
}
