import java.util.Scanner;

public class BankingApp {
	
	public static void printInstruction() {
		System.out.println("Enter any number from 1-8 to interact");
        System.out.println("1 (create account), 2 (display all accounts), "
        		+ "3 (update an account), 4 (delete an account), 5 (deposit), "
        		+ "6 (withdraw), 7 (searching an account, 8 (Exit)");
        System.out.println("Enter your choice: ");
	}

	public static void main(String[] args) {
       
		int choice;
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(); 
        do {
        	printInstruction();
			choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("Creating a new account");
                    System.out.println("Enter account name: ");
                    String name = scanner.next();
                    System.out.println("Enter account type (1 for current, 2 for saving, 3 for salary): ");
                    int type = scanner.nextInt();
                    bank.createAccount(name, type);
                    break;
                    
                case 2:
                	System.out.println("Displaying all accounts");
                	bank.displayAllAccounts();
                    break;
                    
                case 3:
                	System.out.println("Updating an account");
                    System.out.println("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.println("Enter new account name: ");
                    String newName = scanner.next();
                    bank.updateAccount(accountNumber, newName);
                    break;
                    
                case 4:
                	System.out.println("Deleting an account");
                	System.out.println("Enter account number: ");
                    int accountNumberDelete = scanner.nextInt();
                    bank.deleteAccount(accountNumberDelete);
                    break;
                    
                case 5:
                	System.out.println("Depositing an amount into your account");
                    System.out.println("Enter account number: ");
                    int accountNumberDeposit = scanner.nextInt();
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.depositAmount(accountNumberDeposit, depositAmount);
                    break;
                    
                case 6:
                	System.out.println("Withdrawing an amount from your account");
                    System.out.println("Enter account number: ");
                    int accountNumberWithdraw = scanner.nextInt();
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdrawAmount(accountNumberWithdraw, withdrawalAmount);
                    break;
                case 7:
                	System.out.println("Searching for an account");
                    System.out.println("Enter the account number: ");
                    int accountNumberSearch = scanner.nextInt();
                    bank.searchAccount(accountNumberSearch);
                    break;
            }
        } while (choice != 8);
        System.out.println("Exiting ....");
        System.out.println("App closed");
    }
}
