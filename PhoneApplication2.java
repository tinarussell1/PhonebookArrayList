package phonebook2;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PhoneApplication2 {

private static Scanner input;
		
	public static void main(String[] args) {
		input = new Scanner(System.in);
		String choice ="0";
		ArrayList<Person2> people = new ArrayList<Person2>();

	do {	
		System.out.println();
		choice = displayMenu();
		String phoneNumber ="";
		System.out.println("Selected: " + choice);
		switch(choice) {
		case "1": 
			Person2 p = new Person2();
			
			System.out.println("Enter First Name:");
			p.setFirstName(input.nextLine());

			System.out.println("Enter Last Name:");
			p.setLastName(input.nextLine());
			
			//check phone number length of 10 before saving
			System.out.println("Enter 10-digit Telephone Number:");
			phoneNumber = checkPhoneLength(input.nextLine());
			p.setTelephone(phoneNumber);
			
			System.out.println("Enter Street");
	        p.getAddress().setStreet(input.nextLine());

	        System.out.println("Enter City");
	        p.getAddress().setCity(input.nextLine());
	            
	        System.out.println("Enter State");
	        p.getAddress().setState(input.nextLine());

	        System.out.println("Enter Zip Code");
	        p.getAddress().setZip(input.nextLine());

			people.add(p);
			System.out.println("Successfully ADDED " + p);
			break;
		case "2":

			//delete a record by matching phone number
			System.out.println("to delete a record: ");

 			//  delete a record by find phone number	
			System.out.println("Enter Phone Number of record to delete: ");
			phoneNumber = input.nextLine();
			if (people.size()<1) {
				System.out.println("No one with that number");
			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getTelephone().equals(phoneNumber)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to delete(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {
						people.remove(i);
						System.out.println("Deleted Successfully");
					} else {
						System.out.println("No one with that number");
					}
				} else {
					System.out.println("No one with that number");
				}
			}

			}
/*
			//  delete a record by find last name		
			System.out.println("Enter Last Name of record to delete: ");
			String lastNameOfPersonToDelete = input.nextLine();
			if (people.size()<1) {
				System.out.println("No one with that name");
			}
			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getLastName().equals(lastNameOfPersonToDelete)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to delete(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {
						people.remove(i);
						System.out.println("Deleted Successfully");
					}
				} else {
					System.out.println("No one with that name");
				}
			}	
*/
			break;
			
		case "3":
			System.out.println("to update a record");
/*
			// update a record by finding the matching last name
			System.out.println("Enter Last Name of record to change: ");
			String lastname = input.nextLine();

			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getLastName().equals(lastname)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to change the phone number for(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {

						System.out.println("Enter new phone number: "); 
						phoneNumber = checkPhoneLength(input.nextLine());
						people.get(i).setTelephone(phoneNumber);
						System.out.println("Updated telephone for: " + people.get(i));
					}
				} else {
					System.out.println("No one with that name");
				}
			}
			if (people.size()<1) {
				System.out.println("No one with that name");
			}
*/
			//update a record by finding the matching phone number
			System.out.println("Enter phone number of record to change: ");
			phoneNumber = input.nextLine();

			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getTelephone().equals(phoneNumber)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to change the phone number for(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {

						System.out.println("Enter new phone number: "); 
						phoneNumber = checkPhoneLength(input.nextLine());
						people.get(i).setTelephone(phoneNumber);
						System.out.println("Updated telephone for: " + people.get(i));
					}
				} else {
					System.out.println("No one with that name");
				}
			}
			if (people.size()<1) {
				System.out.println("No one with that number");
			}	

			break;
			
		case "4":
			System.out.println("Listing all records");
			Collections.sort(people);

			for (int i=0; i<people.size(); i++) {
				System.out.println(people.get(i));
			}
			break;
		case "5":
			System.out.println("Enter Full Name to Search for: ");
			String name = input.nextLine();
			String concatenateName = "";
			for (int i=0; i<people.size(); i++) {
				concatenateName =people.get(i).getFirstName() + " " + people.get(i).getLastName();
				if(concatenateName.equals(name)) {
					System.out.println(people.get(i)); 
				}
			}
			break;
		case "6": 
			System.out.println("Enter First Name to Search for: ");
			String fname = input.nextLine();
			for (Person2 person : people) {
				if(person.getFirstName().equals(fname)) {
					System.out.println(person); 
				}
			}
			break;
		case "7":
			System.out.println("Enter Last Name to Search for: ");
			String lname = input.nextLine();
			for (Person2 person : people) {
				if(person.getLastName().equals(lname)) {
					System.out.println(person); 
				}
			}
			break;
		case "8":
			System.out.println("Enter Telephone to Search(Numbers Only): ");
			phoneNumber = input.nextLine();
			for (Person2 person : people) {
				if(person.getTelephone().equals(phoneNumber)) {
					System.out.println(person); 
				} else {
					System.out.println("No one with that number"); 
				}
			}
			if (people.size()<1) {
				System.out.println("No one with that number");
			}
			break;
		case "9":
			System.out.println("Enter City to Search for: ");
			String city = input.nextLine();
			for (Person2 person : people) {
				if(person.getAddress().getCity().equals(city)) {
					System.out.println(person); 
				}
			}
			break;
		case "10":
			System.out.println("Enter State to Search for: ");
			String state = input.nextLine();
			for (Person2 person : people) {
				if(person.getAddress().getState().equals(state)) {
					System.out.println(person); 
				}
			}
			break;
		case "11":
			System.out.println("Bye");
			break;
		default:
			System.out.println("ERROR: Enter a number 1 through 11");
			break;
		}	
	} while (!choice.equals("11"));
	}	
	
	public static String displayMenu() {
		input = new Scanner(System.in);
		
		System.out.println("What would you like to do: ");
		System.out.println("1. Add a record");
		System.out.println("2. Delete a record");
		System.out.println("3. Update a telephone number");
		System.out.println("4. List all records");
		System.out.println("5. Search by Full Name");
		System.out.println("6. Search by First Name");
		System.out.println("7. Search by Last Name");
		System.out.println("8. Search by Telephone Number");
		System.out.println("9. Search by City");
		System.out.println("10.Search by State");
		//System.out.println("11.Return to Menu");
		System.out.println("11.Exit");
		System.out.println();
		
		//Break this later
		String choice = input.nextLine();
		return choice;
	}
	
	public static String checkPhoneLength(String phn) {
		boolean phoneGood = false;
		do {
			if (phn.length() == 10) {
				phoneGood = true;
			} else {
				System.out.println("ERROR bad phone number: ("
						+ phn.substring(0,3) + ")" 
						+ phn.substring(3,6) + "-" 
						+ phn.substring(6)   );
			System.out.println("Please RE-enter 10-digit Telephone Number");
			phn = input.nextLine();
			}
		} while (phoneGood == false);
		
		return phn;
	}

}
