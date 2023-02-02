package CipherSchoolCourse2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CF2 {
	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<String>();
		
		states.add("California");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arkansas");
		states.add("LosAngelas");
		
		System.out.println("ArrayList: "+states);
		
		//Accessing Elements using .get() method
		
		String s = states.get(2);
		System.out.println("I got "+s);
		
		//Writing Loop for this
		
//		System.out.println("ArrayList Size "+states.size());
//		
//		for(int i = 0;i<states.size();i++) {
//			System.out.println( states.get(i) );
		
		//Update Elements using .set() Method
		
		states.set(2, "Texas");
		System.out.println("After Updation We got : "+ states);
		
		// Removing Elements using .remove Method
		
				String t = states.remove(3);
				System.out.println("State Removed is "+ t);
				System.out.println("ArrayList After Deletion "+states);
				
				//Let us sort the list using .sort() Method
				
				states.sort(Comparator.naturalOrder()); //A-Z
				
				System.out.println("ArrayList After Sorting "+states);
				//.contains() Method
				System.out.println("Is NewYork There ? "+states.contains("newyork"));
		}

	}