
package phoneBookPrimPackage;

// I refer to this as a 'container', but it is really a driver file with only primitive 
// arrays which enable this program to add/delete data, as well as search for 
// information. There is no database, nor are there any files for which this 
// program will write information to. Any information entered is only stored while
// the program is in run mode. 

public class container {
	PhoneNumbers[] contained = new PhoneNumbers[0];

	public void addEntry(PhoneNumbers newPhoneNumbers) {
		PhoneNumbers temp[] = new PhoneNumbers[contained.length + 1];
		for (int i = 0; i < contained.length; i++) {
			temp[i] = contained[i];
		}
		temp[temp.length - 1] = newPhoneNumbers;
		contained = temp;
	}
	
	public void deleteEntry(String input) {
		PhoneNumbers temp[] = new PhoneNumbers[contained.length - 1];
	//int count = 0;
	 int k = 0;
		for (int i = 0; i < contained.length; i++) {
			if (contained[i].getThePhone().equals(input)) {
				continue;
			}
			temp[k++] = contained[i];
		}
		contained = temp;

	}
	
	public void printPhoneNumber() {
		int k = 0;
		for (int i = 0; i < contained.length; i++) {
			k++;
			System.out.print(k +".)");
			contained[i].printPhoneNumber();
		}
	}

	public void searchLastName(String input) {
		boolean check = false;
		for (int i = 0; i < contained.length; i++) {
			if (contained[i].getPerson().getLastName().toLowerCase().equals(input.toLowerCase())) {
				contained[i].printPhoneNumber();
				check = true;
			} else {
			}
		}
		if (!check) {
			;
			System.out.println("Invalid searh result");
		}
	}

	public void searchFirstName(String input) {
		boolean check = false;
		for (int i = 0; i < contained.length; i++) {
			if (contained[i].getPerson().getFirstName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				contained[i].printPhoneNumber();
			} else {
			}
		}
		if (!check) {
			System.out.println("Invalid searh result");
		}
	}
	public void fullSearch(String input) {
		boolean check = false;
		for (int i = 0; i < contained.length; i++) {
			if (contained[i].getPerson().getName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				contained[i].printPhoneNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid full name");
		}
	}
	public void numberSearch (String input) {
		boolean check = false;
		for (int i = 0; i < contained.length; i++) {
				if (contained[i].getThePhone().equals(input)) {
						check = true; 
						contained[i].printPhoneNumber();
					}
				}
		
		if (!check) {
			System.out.println("Invalid number");
		}
	}
	
	public void searchLocation(String input) {
		boolean check = false;
		for (int i = 0; i < contained.length; i++) {
			if (!contained[i].getPerson().getState().toLowerCase().equals(input.toLowerCase())) {
			} else {
				check = true;
				contained[i].printPhoneNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid searh result");
		}
	}

	public void ascendingOrder() {
		for (int i = 0; i < contained.length; i++) {
			for (int j = i + 1; j < contained.length; j++) {
				if(contained[i].getPerson().getLastName().compareTo(contained[j].getPerson().getLastName()) > 0) {
					PhoneNumbers tempPhoneNumber = contained[i];
					contained[i] = contained[j];
					contained[j] = tempPhoneNumber;
				}

			}

		}

	}
	
	public int phoneNumberUpdate (String input) {
		boolean check = false;
		int index = 0;
		for (int i = 0; i < contained.length; i++) {
			if (contained[i].getThePhone().equals(input)) {
				check = true;
				index = i;
				contained[i].printPhoneNumber();				
			}
		}
		if (!check) {
			System.out.println("Invalid number");
		}
		return index;
	}
		
}  




