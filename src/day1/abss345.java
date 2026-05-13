package day1;

// when we try to hide some implementation 

interface one{

	// in interface we only have the abstract methods
 void mathodabs();
	
	
}



class two implements one{
// when we extends any abstract class so first we need to decalre the body of abstract method 	
	
	
	public void mathodabs() {
		
		System.out.println("abstract method ");
	}
}





public class abss345 {

	public static void main(String[] args) {
		
	 two t= new two();
	 
	 t.mathodabs();
	 t.method1();

	}

}
