/*
Bank Assignment

Console application: 
A registered user can login with their username and password								
An unregistered user can register by creating a username and password 
A superuser can view, create, update, and delete all users.
A user can view their own existing accounts and balances. 
A user can create an account.
A user can delete an account if it is empty.
A user can add to or withdraw from an account. 
A user can execute multiple deposits or withdrawals in a session. 											Done
A user can logout. 																												Done
Use sequences to generate USER_ID and BANK_ACCOUNT_ID. 
Provide validation messages through the console for all user actions. 									Done
Use the DAO design pattern. 																								Done
Store database connection information in a properties file. 													Done/ did using environment variables

Required technologies: 
PL/SQL with at least one stored procedure, JDBC with prepared and callable statements,
Scanner for user input.																										Done

Bonus: 
A user's transactions are recorded.
A user may view transaction history. 
JUnit tests on DAO methods
 */

package Application;

import java.util.Scanner;

import DAO.BankDAO;
import DAO.BankDAOImpl;

public class App {
	public static void main(String[] args) {

		BankDAO bd = new BankDAOImpl();

		Scanner scanner = new Scanner(System.in);
		int choice;

		System.out.println("Hello welcome to the bank what would you like to do?");
		System.out.println("1. Login");
		System.out.println("2. Create new account");
		System.out.println("3. Exit");

		do {
			System.out.println("Selection: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				login();

			case 2:
				createAccount();

			}
		} while (choice != 3);
		scanner.close();
		System.out.println("Thank you!");
		System.exit(0);
	}

	static void createAccount() {

		Scanner scanner = new Scanner(System.in);
		String usrn;
		String pswd;

		System.out.println("Hello Welcome to your new bank");
		System.out.println("Don't use spaces for the USERNAME or PASSWORD!");

		System.out.println("Create a Username: ");
		usrn = scanner.next();

		System.out.println("Create a Password: ");
		pswd = scanner.next();
		scanner.close();
	// call create from services
		
	}

	static void deposit() // should allow client to deposit money into account
	{

		Scanner scanner = new Scanner(System.in);
		double money;

		do {
			System.out.println("How much would you like to deposit?");
			money = scanner.nextDouble();

		} while (money < 0);
		scanner.close();
		// call update service from services
	}

	static void withdraw() // should allow client to withdraw money they have in account and throw
							// exception when they don't have enough
	{
		{

			Scanner scanner = new Scanner(System.in);
			double money;

			do {
				System.out.println("How much would you like to withdraw?");
				money = scanner.nextDouble();

			} while (money < 0);

			// add option to delete when if funds in account hit zero using delete from service
			
			scanner.close();
		}
		// call update service from services
	}

	static void SU() { // A superuser can view, create, update, and delete all users.
		System.out.println("Hello Admin");

		Scanner scanner = new Scanner(System.in);
		char choice;

		System.out.println("1. View Users");
		System.out.println("2. Create User");
		System.out.println("3. Update User");
		System.out.println("4. Delete All Users");
		System.out.println("5. Exit");

		do {
			System.out.println("Selection: ");
			choice = scanner.next().charAt(0);

			switch (choice) {
			case 1:
				// View Users
			case 2:
				createAccount();
			case 3:
				// update user call update from service
			case 4:
				// Delete users call delete from the service

			}
		} while (choice != 5);
		System.exit(0);
		scanner.close();

	}

	static void login() // should validate entry within SQL and if the user name / password is wrong it
	// should be able to handle that
	{
		Scanner scanner = new Scanner(System.in);
		String usrn;
		String pswd;

		System.out.print("Username: ");
		usrn = scanner.next();

		System.out.print("Password: ");
		pswd = scanner.next();

		try { // test against username make sure it is unique and pass in sql

		} catch (Exception e) {
// unsucessful login
			System.out.println("Failed Login");
		}

// successful login
		char choice;

		System.out.println("Successful login!\n\n");
		System.out.println("Here are your accounts:\n");
// Pull from the data base all account under this users ID and display them
		System.out.println("\n");
		System.out.println("What would you like to do");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Logout");

		do {
			System.out.println("Selection: ");
			choice = scanner.next().charAt(0);

			switch (choice) {
			case 1:
				deposit();

			case 2:
				withdraw();

			}
		} while (choice != 3); // terminate connection
		scanner.close();
		System.exit(0);
	}

}