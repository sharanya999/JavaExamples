
public class Car {  // class acts as a template which will be used to create objects of its type
	
	void start(){
		System.out.println("Car has started");
	}
	
	void gear(int gearNo) {  //input parameter
		System.out.println("gear no->"+gearNo);
	}
	

	public static void main(String[] args) {
		//type of the object is not but a class
		Car maruthiBreeza = new Car();
		Car creta = new Car();
		maruthiBreeza.start();
		maruthiBreeza.gear(2);  //object calling gear method
		maruthiBreeza.gear(3);
		maruthiBreeza.gear(4);  // values. while calling methods
		
		

	}

}


