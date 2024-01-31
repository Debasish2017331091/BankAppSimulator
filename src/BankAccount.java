import java.time.LocalDate;;

public class BankAccount {
	private String name;
    private int number;
    private LocalDate creationDate;
    private double balance;
    private AccountType type;
    private static int account_number=20240001;
    
    public enum AccountType {
        CURRENT, SAVING, SALARY
    }
    
    BankAccount(String name, AccountType type, int amount ) {
		if (type == null) {
	        System.out.println("Given Account Type is not Valid!");
	        return;
	    }
    	this.name = name;
    	this.type = type;
    	this.balance = amount;
    	this.number = account_number;
    	this.creationDate = LocalDate.now();
    	account_number +=1 ;
    	System.out.println("Succesfuly Created the account");
    }
    
    public String getName() {
		return this.name;
	}
    
    public int getNumber() {
		return this.number;
	}
    
    public double getBalance() {
		return this.balance;
	}
    
    public AccountType getType() {
		return this.type;
	}
    
    public LocalDate getCreationDate() {
		return this.creationDate;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    
    public void deposit(double amount){
		this.balance += amount;
		System.out.println("Deposit Successful");
	}
    
    public void withdraw(double amount){
    	if(this.balance - amount < 0) {
    		System.out.println("Unsuccessfull, not enough balance!");
    		return;
    	}
    	if(this.balance < 1000) {
    		System.out.println("Your current balance is less than 1000, you must have minimum balance of 1000");
    		return;
    	}
		this.balance -= amount;
		System.out.println("Withdraw Successful");
	}
    
    public void showAccount() {
    	System.out.println("Account Number: "+this.getNumber()+
    			", Account Name: '"+this.getName()+"', Account Type: "+this.getType()+
    			", Balance: "+this.getBalance()+", Created at: "+this.getCreationDate());
    }
    
}
