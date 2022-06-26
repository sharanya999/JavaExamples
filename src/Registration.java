
public class Registration {
	
	// body of the function
	public void userRegistration(String firstName, String lastName, long phoneNumber, String email) { //input parameter
		//store the values into database
		String name = firstName+" "+lastName;
		System.out.println("welcome");  //print and wait in the same line
		System.out.println("to");
	    System.out.println("chandra"+5);
		
		
	
	}
	
	
	
		
	public static void main(String[] args) {
		
		Registration user1 = new Registration();
		user1.userRegistration("sekhar reddy","chandra",9535689048L,"chandrasekhar.cs@gmail.com");
		Registration user2 = new Registration();
		//user2.userRegistration("saravan", "kumar", 111111L, "skumar@gmail.com");  //values or arguements
		Car creta = new Car();
		//creta.gear(5);
				
		
	}

}
