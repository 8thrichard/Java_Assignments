// Class used to create Account objects
public class Account {
	
	// this is a class level field - share across all accounts
	public static int lastNumber = 0;
	
	// instance level fields - unique per account
	// a field can also be called attribute or property
	private int number;
	private String firstName;
	private String lastName;
	private double balance;
	
	// default constructor that will return a unique account object 
	public Account() {
		System.out.println("Default constructor");
		
		this.number = ++Account.lastNumber;
		this.balance = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
	} // end of default

	// overload constructor that allows setting the object's fields
	public Account(String firstName, String lastName, double balance) {
		this(); // call the default constructor
		
		// can not run this before calling default constructor
		System.out.println("Overload constructor");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	} // end of overload constructor

	/** 
	 * Allows getting the account number
	 * @return the account number
	 */

	public int getNumber() {
		return number;
	}

/**
 * Allows getting the account owners name
 * @return the account owner's name
 */

	public String getFirstName() {
		return firstName;
	}

	/**
	 * Allows changing the account owners first name if not blank
	 * @param firstName the account owners first name
	 */
	public void setFirstName(String firstName) {
		if (firstName == "")
			System.out.println("First name cannot be empty");
		else
			this.firstName = firstName;
	}

	public String getLastName() {
		if (lastName == "");
			System.out.println("Last name can not be empty");
		else
			return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Allows getting the account balance
	 * @return the account balance
	 */
	public double getBalance() {
	
		return balance;
	}

	/**
	 * Allows depositing money into the account but only greater than zero
	 * @param balance amount to desposit
	 */

	public void deposit(double amount) {\
		if (amount <= 0)
			System.out.println("Amount must be greater than zero, You deposited [" + amount +"]");
		else
			this.balance = balance;
	}
	
	
} // end of Account class
