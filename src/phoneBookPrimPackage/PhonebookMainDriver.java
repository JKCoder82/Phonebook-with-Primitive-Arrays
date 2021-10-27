
/*
 * Phonebook project
Write a program to simulate the actions of a phonebook. (s) 
Your program should be able to :
•	Add new entries 
•	Search for an existing entry
•	Search by first name *
•	Search by last name *
•	Search by full name *note name is not unique therefore the result should be an array of Person Objects.
•	Search by telephone number
•	Search by city or state
•	Delete a record for a given telephone number
•	Update a record for a given telephone number
•	Show all records in asc order *note you will need to research sorting on an array.
•	An option to exit the program 
Your program should operate on the console. It should display all the choices when the program loads. Eg 1. Add new record2. Delete a recordEtc.. where 1 representing the action for adding a record and 2 representing the actionfor deleting a record.
Your program should run until the user selects the exit option. 
Your program should have a minimum of 2 classes a Person class, an Address  class.

Test case :
John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
Note: Test cases should work when copy and paste into the console as one entry (as is).
           ONLY ARRAYS ARE ALLOWED, NO ARRAYLIST.
 
Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.

Optional add additional features to your program, for storing cell, home, work and fax numbers. 
Also features for storing events like birthday, anniversary, email… etc 
 * 
 */


package phoneBookPrimPackage;


import java.util.*;


public class PhonebookMainDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		container tempStash = new container(); // No databases, SQL, or files 
		// are being used to actually save inputted data. All input is only 'saved'
		// for the duration that this program is in run-mode. 
		
		Person person1 = new Person(); // Can add a new person... there's a "Class Person"
		// file .... in a separate file.
		
		// While this lab asked us to use a Address Class, it seemed fitting to use
		// a Phone Number Class instead since the 'phone number' is the prime 
		// identifier and that which is primarily used to identify a specific
		// individual. 
		PhoneNumbers num1 = new PhoneNumbers("6366435698"); 
		num1.addPerson("114 Market St", "St. Louis", "MO", 63403, "John Doe");
		tempStash.addEntry(num1); 
		
		PhoneNumbers num2 = new PhoneNumbers("8475390126"); 
		num2.addPerson("324 Main St", "St Charles", "MO", 63303, "John E Doe");
		tempStash.addEntry(num2);
		
		PhoneNumbers num3 = new PhoneNumbers("5628592375");
		num3.addPerson("574 Pole ave", "St. Peters", "MO", 63333, "John Michael West Doe");
		tempStash.addEntry(num3); 
			
		System.out.println("***PHONE DIRECTORY IN JAVA CODE***");
		System.out.println("");
		
		// Do-While Loop with a Switch case to accept user input so various requested
		// output can be returned. 
		
		int menuOptions;
	do {
		menuOptions = 0;
		System.out.println("Please select an option below:");
		System.out.println("");
		System.out.println("1. Add a new entry: ");
		System.out.println("2. Search directory by first name: ");
		System.out.println("3. Search directory by last name: ");
		System.out.println("4. Search directory by full name: ");
		System.out.println("5. Search directory by phone number: ");
		System.out.println("6. Search directory by state to return all directly listings: ");
		System.out.println("7. Delete an entry by entering a phone number: ");
		System.out.println("8. Update a phone number for a given directory listing: ");
		System.out.println("9. Sort all listings in Ascending order: ");
		System.out.println("10. Exit the program.");
		System.out.println("");
		System.out.println("******************************************");
		
		menuOptions = input.nextInt();
		input.nextLine();
		switch (menuOptions){
		
		case 1:
			System.out.println("Please enter your Full Name: ");
			String name = input.nextLine();

			System.out.println("Please enter your Street Address: ");
			String streetAddr = input.nextLine();

			System.out.println("Please enter your City: ");
			String city = input.nextLine();

			System.out.println("Please enter your State: ");
			String state = input.nextLine();

			System.out.println("Please enter your Zip Code: ");
			int zipCode = Integer.parseInt(input.next());
			input.nextLine();

			System.out.println("Please enter your phone number with no white spaces or dashes: ");
			String phone = input.next();
			input.nextLine();
			PhoneNumbers num4 = new PhoneNumbers(phone); 
			num4.addPerson(streetAddr, city, state, zipCode, name);
			tempStash.addEntry(num4);
			nextOption();
			menuOptions = 0;
			break;
			
		case 2:
			System.out.println("Please enter First Name: ");
			String searchValue = input.next();
			input.nextLine();
			person1.setName(searchValue);
			tempStash.searchFirstName(searchValue);
			nextOption();
			menuOptions = 0;
			break;
			
		case 3:
			System.out.println("Please enter Last Name: ");
			searchValue = input.next();
			input.nextLine();
			person1.setName(searchValue);
			tempStash.searchLastName(searchValue);
			nextOption();
			menuOptions = 0;
			break;
			
		case 4:
			System.out.println("Please enter Full name: ");
			searchValue = input.nextLine();
			person1.setName(searchValue);
			tempStash.fullSearch(searchValue);
			nextOption();
			menuOptions = 0;
			break;
			
		case 5:
			PhoneNumbers num5 = new PhoneNumbers(); 
			System.out.println("Please enter Phone number: ");
			searchValue = input.nextLine();
			num5.setThePhone(searchValue);
			tempStash.numberSearch(searchValue);
			nextOption();
			menuOptions = 0;
			break;
			
		case 6: 
			System.out.println("Please enter the State: ");
			searchValue = input.nextLine();
			person1.setState(searchValue);
			tempStash.searchLocation(searchValue);
			nextOption();
			menuOptions = 0;
			break;
			
		case 7:
			PhoneNumbers num6 = new PhoneNumbers(); 
			System.out.println("Delete a phone number: ");
			searchValue = input.nextLine();
			num6.setThePhone(searchValue);
			tempStash.deleteEntry(searchValue);
			nextOption();
			menuOptions = 0;
			break;
			
		case 8:
			System.out.println("Please enter a number to update: ");	
			String options = input.next(); 
			int index = tempStash.phoneNumberUpdate(options);
			input.nextLine();
			System.out.println("Please input your Name: ");
			name = input.nextLine();
			System.out.println("Please input your Address: ");
			streetAddr = input.nextLine();
			System.out.println("Please input your City: ");
			city = input.nextLine();
			System.out.println("Please input your State: ");
			state = input.nextLine();
			System.out.println("Please input your Zip Code: ");
			zipCode = Integer.parseInt(input.next());
			input.nextLine();
			System.out.println("Please input your new phone number with no spaces or characters: ");
			phone = input.next();
			input.nextLine();
			PhoneNumbers num7 = new PhoneNumbers(phone); 
			num7.addPerson(streetAddr, city, state, zipCode, name); 			
			tempStash.contained[index] = num7; 
			num7.printPhoneNumber(); // This code allows the return of newly entered names/numbers.
			menuOptions = 0;
			nextOption();
			
		case 9:
			System.out.println("The following Phone Numbers are assorted by numerical value of the phone numbers from the lowest to the highest value: ");
			System.out.println("");
			tempStash.ascendingOrder();
			tempStash.printPhoneNumber();
			menuOptions = 0;
			nextOption();
			break;
			
		case 10:
			System.exit(0);
			break;
		}
		
	} while (menuOptions == 0);

		input.close();
	}
		
	public static void nextOption() {
		System.out.println("Press 'Enter', select another number from the above menu, then select 'Enter' again: ");
		try {
			System.in.read();
		} catch (Exception e) {}
	}
}





	

