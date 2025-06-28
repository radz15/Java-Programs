// Step -2 create class
// Abstraction is used using "abstract"

abstract class BankAccount{
private String AccountHolderName ; // private helps hides your data
private double Balance ;

    // Step -3 create constructor - initializes the object
    public BankAccount(String AccountHolderName, double Balance){
        //"this" keyword refers to the object
        this.AccountHolderName = AccountHolderName;
        this.Balance = Balance;
    }
    public abstract void displyDetails();

    // Step -4 encapsulation
    // get and set functions are applied 
    // "get" - set your values
    // "set" - to get all info and return the value

    public String getAccountHolderName(){
        return AccountHolderName; // when using "get" we return the value
    }
    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName = AccountHolderName; // when using "set" we refer to the current object 
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double Balance){
        this.Balance = Balance;
    }

    // deposit code
    public void deposit(double amount){
        if(amount>0)
        {
            Balance += amount;
            System.out.println("Deposit Amount: "+ amount);
        }
        else{
            System.out.println("Desposit properly!!");
        }
    }

    // withdraw code
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance)
        {
            Balance -= amount;
            System.out.println("Withdraw amount: "+ amount);
        }
        else
        {
            System.out.println("Invalid Amount: ");
        }
    }
}

// Inheritence
class savingsAccount extends BankAccount{
    public savingsAccount(String AccountHolderName, double Balance){
        super(AccountHolderName, Balance);
    }
    @Override
    public void displyDetails(){
        System.out.println("Account Holder Name: "+ getAccountHolderName());
        System.out.println("Account Balance: "+ getBalance());
    }
}
// Step -1 main function
public class oops {
    public static void main (String[] args){
        // Create a new account
        BankAccount savings = new savingsAccount("Radhika", 2000.00);

        savings.displyDetails();

        savings.deposit(2000.00);
        savings.withdraw(500.00);

        savings.displyDetails();
    }    
}