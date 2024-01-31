import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;
    
    public Bank() {
        this.accounts = new ArrayList<>();
    }
    
    // create account
    public void createAccount(String name, int type) {
        BankAccount newAccount = new BankAccount(name, type);
        if (newAccount.getNumber() != 0) {
            accounts.add(newAccount);
        } else {
            System.out.println("Account creation failed. Invalid account type.");
        }
    }
    
    // update account
    public void updateAccount(int accountNumber, String name) {
    	 for (BankAccount account : accounts) {
             if (account.getNumber() == accountNumber) {
                 account.setName(name);
                 System.out.println("Account name updated successfully!");
                 return;
             }
         }
         System.out.println("Account not found. Update failed.");
    }
    
    // delete account
    public void deleteAccount(int accountNumber) {
    	 for (BankAccount account : accounts) {
             if (account.getNumber() == accountNumber) {
                 accounts.remove(account);
                 System.out.println("Account deleted successfully!");
                 return;
             }
         }
         System.out.println("Account not found. Deletion failed.");
    }
    
    // show the account of given accountNumber
    public void searchAccount(int accountNumber) {
    	for (BankAccount account : accounts) {
            if (account.getNumber() == accountNumber) {
                account.showAccount();
                return;
            }
        }
        System.out.println("Account not found.");
    }
    
    // display all bank account
    public void displayAllAccounts() {
    	for (BankAccount account : accounts) {
            account.showAccount();
        }
    }
    
    // deposit
    public void depositAmount(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found. Deposit failed.");
    }
    
    // withdraw
    public void withdrawAmount(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getNumber() == accountNumber) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found. Withdrawal failed.");
    }
}
