package phoneBookPrimPackage;

// The getters/setters for the phone number class. 

public class PhoneNumbers {

	private String thePhone;
	private Person person;

	public PhoneNumbers() {

	}
	
	public PhoneNumbers(String thePhone) {
		this.thePhone = thePhone; 
	}
	
	public void addPerson(String streetAddress, String city, String state, int zipCode, String name) {
		Person temp = new Person(streetAddress, city, state, zipCode, name);
		this.person = temp;
	}
	public Person getPerson() {
		return person;
	}
	
	public String getThePhone() {
		return thePhone;
	}
	public void setThePhone(String thePhone) {
		this.thePhone = thePhone;
	}
	public void printPhoneNumber() {
		person.printPerson();
		java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
    String[] phoneNumArr={thePhone.substring(0, 3),
    		thePhone.substring(3,6),
    		thePhone.substring(6)};
    
    System.out.println("Phone Number: "+ phoneMsgFmt.format(phoneNumArr));
    System.out.println("");
	System.out.println("******************************************"); 
	}
	
} 




