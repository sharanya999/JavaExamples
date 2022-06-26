public class Human {
		   void teaching(String name){
		   
		 System.out.println(name+"is teaching");  
	   }
	   
	   void listening(String name) {
		   System.out.println(name+"Listening");
	   }

	public static void main(String[] args) {
		Human chandra = new Human();  //create object
		chandra.teaching("Chandra");
		Human hari = new Human();
		hari.listening("Hari");
		Human shankar = new Human();
		shankar.listening("Shankar");
	}

}
