package day1;

public class switchcase {

	public static void main(String[] args) {
		
		// if weh ave multiple condition and any one of them is true then we use switch case 
		// in switch float , boolean and  conditional statemenets are nor allowed 
		
		// in switch case we are able to use  string char and number value only 
		
		int day = 8; 
		
		
		switch("monday") {
		
		case "monday" -> System.out.println("rice");
		case "tuesday" -> System.out.println("mrice");
		case "wednesy" -> System.out.println("trice");
		case "thusday" -> System.out.println("thrice");
		case "saturday" -> System.out.println("strice");
		case "sunday" -> System.out.println("surice");
		default-> System.out.println("invalid");
		}
		

	}

}
