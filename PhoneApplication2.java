package phonebook2;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PhoneApplication2 {

private static Scanner input;

	public static int displayMenu() {
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
		int choice = input.nextInt();
		return choice;
	}
		
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int choice =0;
		ArrayList<Person2> people = new ArrayList<Person2>();

	do {	
		System.out.println();
		int newChoice = displayMenu();
		choice = newChoice;
		System.out.println("Selected: " + choice);
		switch(choice) {
		case 1: 
			Person2 p = new Person2();
			input.nextLine();
			
			System.out.println("Enter First Name:");
			p.setFirstName(input.nextLine());

			System.out.println("Enter Last Name:");
			p.setLastName(input.nextLine());
			
			System.out.println("Enter Telephone Number:");
			p.setTelephone(input.nextLine());
			
			System.out.println("Enter Street");
	        p.getAddress().setStreet(input.nextLine());

	        System.out.println("Enter City");
	        p.getAddress().setCity(input.nextLine());
	            
	        System.out.println("Enter State");
	        p.getAddress().setState(input.nextLine());

	        System.out.println("Enter Zip Code");
	        p.getAddress().setZip(input.nextLine());
	        
			//people.getPeople().add(p);
			people.add(p);
			System.out.println("Successfully ADDED " + p);
			break;
		case 2:
			//delete a record by matching phone number
			System.out.println("to delete a record: ");
			input.nextLine();
			System.out.println("Enter Last Name of record to delete: ");
			String deleteLastName = input.nextLine();
			int ind = -1;
			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getLastName().equals(deleteLastName)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to delete(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {
						System.out.println("Enter new phone number: "); 
						people.remove(i);
						//people.get(i).setTelephone(input.nextLine());
						System.out.println("Deleted Successfully " + people.get(i));
					}
				}
			}
/*	//  delete a record by find last name		
			System.out.println("Enter Last Name of record to delete: ");
			String deleteLastName = input.nextLine();
			int ind = -1;
			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getLastName().equals(deleteLastName)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to delete(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {
						System.out.println("Enter new phone number: "); 
						people.remove(i);
						//people.get(i).setTelephone(input.nextLine());
						System.out.println("Deleted Successfully " + people.get(i));
					}
				}
			}
*/			
			
			break;
			
		case 3:
			input.nextLine();
			System.out.println("to update a record");
/* update a record by finding the matching last name
			System.out.println("Enter Last Name of record to change: ");
			String lastname = input.nextLine();
			int index = -1;
			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getLastName().equals(lastname)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to change the phone number for(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {

						System.out.println("Enter new phone number: "); 
						people.get(i).setTelephone(input.nextLine());
						System.out.println("Updated telephone for: " + people.get(i));
					}
				}
			}
*/
			//update a record by finding the matching phone number
			System.out.println("Enter phone number of record to change: ");
			String phone = input.nextLine();
			int index = -1;
			for (int i=0; i<people.size(); i++) {
				if(people.get(i).getTelephone().equals(phone)) {
					System.out.println(people.get(i)); 
					System.out.println("Is this the person you want to change the phone number for(yes/no)? ");
					String yesNo = input.nextLine();
					yesNo = yesNo.toLowerCase();
					System.out.println(yesNo);
					if (yesNo.contentEquals("yes") || yesNo.contentEquals("y"))  {

						System.out.println("Enter new phone number: "); 
						people.get(i).setTelephone(input.nextLine());
						System.out.println("Updated telephone for: " + people.get(i));
					}
				}
			}
			break;
			
		case 4:
			System.out.println("Listing all records");
			Collections.sort(people);

			for (int i=0; i<people.size(); i++) {
				System.out.println(people.get(i));
			}
			break;
		case 5:
			input.nextLine();
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
		case 6: 
			input.nextLine();
			System.out.println("Enter First Name to Search for: ");
			String fname = input.nextLine();
			for (Person2 person : people) {
				if(person.getFirstName().equals(fname)) {
					System.out.println(person); 
				}
			}
			break;
		case 7:
			input.nextLine();
			System.out.println("Enter Last Name to Search for: ");
			String lname = input.nextLine();
			for (Person2 person : people) {
				if(person.getLastName().equals(lname)) {
					System.out.println(person); 
				}
			}
			break;
		case 8:
			input.nextLine();
			System.out.println("Enter Telephone to Search for: ");
			String PersonPhone = input.nextLine();
			for (Person2 person : people) {
				if(person.getTelephone().equals(PersonPhone)) {
					System.out.println(person); 
				}
			}
			break;
		case 9:
			input.nextLine();
			System.out.println("Enter City to Search for: ");
			String city = input.nextLine();
			for (Person2 person : people) {
				if(person.getAddress().getCity().equals(city)) {
					System.out.println(person); 
				}
			}
			break;
		case 10:
			input.nextLine();
			System.out.println("Enter State to Search for: ");
			String state = input.nextLine();
			for (Person2 person : people) {
				if(person.getAddress().getState().equals(state)) {
					System.out.println(person); 
				}
			}
			break;
		case 11:
			System.out.println("Bye");
			break;
		}
	} while (choice <= 1 || choice <10);
	}	
	


}
