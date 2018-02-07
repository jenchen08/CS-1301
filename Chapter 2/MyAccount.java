//********************************************************************
//  MyAccount.java       
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

// Import Decimal format for output
import java.text.DecimalFormat;
// Import scanner for current date when input
import java.util.Date;

//Blueprint for Account
public class MyAccount {
	// ****************************
	// Declarations
	// declaring each variable
	// for the account
	// *************************
	private String name = null;
	private long accountNumber = 0;
	private double originalBalance = 0;
	private double currentBalance = 0;
	private double totalDeposits = 0;
	private double totalWithdrawals = 0;
	private Date dateCreated = null;

	// -----------------------------------------------------------------
	// 1. Sets up the account by defining default values for the
	// account.
	// -----------------------------------------------------------------
	// Method for default account
	public MyAccount() {
		// assigned each variable to default
		name = "Unknown";
		accountNumber = 99999;
		originalBalance = 0;
		currentBalance = 0;
		dateCreated = new Date();
	} // end of default account method

	// -----------------------------------------------------------------
	// 2. Sets up the account by defining its owner, account number,
	// and initial balance.
	// -----------------------------------------------------------------
	// Method for setting up the account
	// declared new variables for name, number, and balance
	public MyAccount(String name, long number, double balance) {
		// this is assigned to John Smith
		this.name = name;
		// each account has an account number assigned to them
		accountNumber = number;
		// what amount they started with
		originalBalance = balance;
		// what balance they came out with
		// based of deposits and withdrawals
		currentBalance = balance;
		// and the date
		dateCreated = new Date();
	}

	// -----------------------------------------------------------------
	// 3. getName: returns the name.
	// -----------------------------------------------------------------
	// method to get the name from tester
	public String getName() {
		return name;
	} // end of getName

	// -----------------------------------------------------------------
	// 4. getAccountNumber: returns the account number.
	// -----------------------------------------------------------------
	// method to get account number from tester
	public long getAccountNumber() {
		return accountNumber;
	} // end of get account number

	// -----------------------------------------------------------------
	// 5. Returns the current balance of the account.
	// -----------------------------------------------------------------
	// method to get current balance from the tester
	public double getBalance() {
		return currentBalance;
	} // end of get current balance

	// -----------------------------------------------------------------
	// 6. Updates name
	// -----------------------------------------------------------------
	// adding Kira Jones to second account method
	public void setName(String newName) {
		name = newName;
	} // end of updating name method

	// -----------------------------------------------------------------
	// 7. Updates account number
	// -----------------------------------------------------------------
	// adding Kira Jones's account number to second account method
	public void setAccountNumber(long newAccountNumber) {
		accountNumber = newAccountNumber;
	} // end of updating account method

	// -----------------------------------------------------------------
	// 8. Deposits the specified amount into the account. Returns the
	// new balance.
	// -----------------------------------------------------------------
	// deposit method
	public double deposit(double amount) {
		// add deposit to balance
		totalDeposits += amount;
		currentBalance += amount;
		return amount;
	} // end of deposit method

	// -----------------------------------------------------------------
	// 9. Withdraws the specified amount from the account and return the new
	// balance.
	// -----------------------------------------------------------------
	// withdraw method
	public double withdraw(double amount) {
		// subtract amount from balance
		totalWithdrawals += amount;
		currentBalance -= amount;
		return amount;
	} // end of withdraw method

	// -----------------------------------------------------------------
	// 10. Returns a one-line description of the account as a string.
	// -----------------------------------------------------------------
	// toString Method
	public String toString() {
		// ******************************************************
		// used for adding decimal places and $ to the balances,
		// withdrawals, and deposits
		// *******************************************************
		DecimalFormat df = new DecimalFormat("$###,##0.00");
		// ****************************************************
		// returns name, account number, original balance,
		// total deposits, total withdraws, current balance
		// and the current date
		// *****************************************************
		String account = "\n\tName:                \t" + name + 
                       "\n\tAccount Number:      \t" + accountNumber + 
                       "\n\tOriginal Balance:    \t" + df.format(originalBalance) + 
                       "\n\tTotal Deposits:      \t" + df.format(totalDeposits) + 
                       "\n\tTotal Withdrawals:   \t" + df.format(totalWithdrawals) + 
                       "\n\tCurrent Balance:     \t" + df.format(currentBalance) + 
                       "\n\tDate Created:        \t" + dateCreated;

      return account;
	} // end of toString Method
} // end of class

