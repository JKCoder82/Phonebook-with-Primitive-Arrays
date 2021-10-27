package phoneBookPrimPackage;

// The getters/setters for the person class which combine with address information...
// however, the phone number is what links mostly to a specific person.

public class Person {
	
	
	private String firstName;
	private String lastName;
	private String name;
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	
	public Person() {}

	public Person(String streetAddress, String city, String state, int zipCode, String name) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.name = name;
	}
	public void printPerson() {

		System.out.println("Owner: "+ name +"\nAddress: "+ streetAddress +", "+ city +", "+ state +" "+ zipCode);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		String[] arr = name.split(" ");
		return firstName = arr[0];
	}

	public String getLastName() {
		String[] arr = name.split(" ");
		return lastName = arr[arr.length - 1];
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
}


