import java.time.LocalDate;;

public class BankAccount {
	private String name;
    private int number;
    private LocalDate creationDate;
    private double balance;
    private int type;
    private static int account_number=20240001;
    
    BankAccount(String name, int type ) {
    	if( type<1 || type>3 ) {
    		System.out.println("Given Account Type is not Valid!");
    		return;
    	}
    	this.name = name;
    	this.number = account_number;
    	account_number +=1 ;
    	this.creationDate = LocalDate.now();
    	this.balance = 1000;
    	this.type = type;
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
    
    public String getType() {
		if(this.type==1) {
			return "current account";
		}else if(this.type==2) {
			return "saving account";
		}else {
			return "salary account";
		}
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
		return;
	}
    
    public void withdraw(double amount){
    	if(this.balance<amount) {
    		System.out.println("Unsuccessfull, not enough balance!");
    		return;
    	}
		this.balance -= amount;
		System.out.println("Withdraw Successful");
		return;
	}
    
    public void showAccount() {
    	System.out.println("Account Number: "+this.getNumber()+
    			" Account Name: "+this.getName()+" Account Type: "+this.getType()+
    			" Balance: "+this.getBalance()+" Created at: "+this.getCreationDate());
    }
    
}
