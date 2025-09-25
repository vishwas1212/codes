package olddsamixcodes.demo;

import java.util.ArrayList;
import java.util.List;

public class CloneableImpl {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Good");
		
		CloneableAddress address=new CloneableAddress(1, "India", "Nalanda", 801301);
		
		
		CloneablePerson person1=new CloneablePerson(1, "Ramraja", 170000L, address, list);
		
		try {
			Object object=person1.clone();
			CloneablePerson person2=(CloneablePerson) object;
			person2.setName("ShreeRam");
			person2.getAddress().setCity("Bihar");
			
			System.out.println("Original Object");
			System.out.println(person1);
			System.out.println("Cloned Object");
			System.out.println(person2);
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
