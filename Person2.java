package phonebook2;

import java.util.Comparator;

import phonebook2.Address2;

public class Person2 implements Comparable<Person2>  {
//public class Person implements Comparable<Person>  {
	private String lastName;
	private String firstName;
	private String telephone;
	private Address2 address = new Address2();
		
	public Person2() {
	}
	
	public Person2(String lastName, String firstName, String telephone, Address2 address) {
			this.lastName = lastName;
			this.firstName = firstName;
			this.telephone = telephone;
			this.address = address;
		}
	
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Address2 getAddress() {
		return this.address;
	}
	public void setAddress(Address2 address) {
		this.address = address;
	}
		

		@Override
		public String toString() {
			return  firstName + " " + lastName + ", " 
					+ "(" + telephone.substring(0,3) 
					+ ")" + telephone.substring(3,6) 
					+ "-" + telephone.substring(6) 
					+  ", address=" + address;
		}

		@Override
		public int compareTo(Person2 o) {
			return this.lastName.compareTo(o.lastName);
		}
		
}
