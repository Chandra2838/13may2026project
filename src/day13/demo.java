package day13;


public class demo {
	
	// method is a specific block of code who is responsible to perform a specfic task  when we 
	//call it 
	
	
	// no parameter no return 
	// with parameter with return 
	
	// with parameter no return 
	
	// no parameter with return 
	
	// 1: no parameter no return 
	static void intro() {
		
		System.out.println("my name is chandrashekhar");
		
		System.out.println("i am a automation tester");
		
		System.out.println("I am 29 year old ");
		
		System.out.println();
		
	}
	
	//2  with parameter no return 
   static void intro2(String name , String designation , int age) {
		
		System.out.println("my name is " + name);
		
		System.out.println("i am a " + designation);
		
		System.out.println("I am " + age +" 29 year old ");
		
		System.out.println();
		
		return;
	}

   
   // 3 no parameter with return 
   
   static String intro3() {
		
		System.out.println("my name is chandrashekhar");
		
		System.out.println("i am a automation tester");
		
		System.out.println("I am 29 year old ");
		
		System.out.println();
		
		return "execution complete";
		
	}
   
   //4with parameter with return 
   
   static String intro4(String name , String designation , int age) {
		
		System.out.println("my name is " + name);
		
		System.out.println("i am a " + designation);
		
		System.out.println("I am " + age +" 29 year old ");
		
		System.out.println();
		
		return "execution complete";
	}
	

	public static void main(String[] args) {
		
		intro();
		
		intro2("deepali" , "APi tester" , 29);
		
		intro2("abhi" , "test planner" , 29);
		
		System.out.println(intro3());
		
		intro3();
		
		System.out.println(intro4("chandra" ,"manual tester" , 29));
		
	}

}
