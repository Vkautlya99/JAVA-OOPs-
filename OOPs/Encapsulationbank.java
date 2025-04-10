public class Encapsulationbank {
    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.setAccountNumber("123456789");
        bankDetails.setAccountHolderName("John Doe");   
        bankDetails.setBalance(1000.00);
        System.out.println("Account Number: " + bankDetails.getAccountNumber());

        System.out.println("Account Holder Name: " + bankDetails.getAccountHolderName());
        System.out.println("Account Balance: " + bankDetails.getBalance());
        System.out.println("Account Balance: " + bankDetails.getBalance());
        System.out.println("Account Balance: " + bankDetails.getBalance());
    }
}


// Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
class BankDetails{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}



