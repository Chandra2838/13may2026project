package day1;

public class strriiii {

	public static void main(String[] args) {
		
		String  st1 = "My,Name,Is,Chnadra,Shekhar";
		
		// how to print length of the string
		System.out.println(st1.length());
		
		
		// how to print any specifi character in string
		
		System.out.println(st1.charAt(3));
		
		// traverse the string 
		
		for(int i =0 ; i<st1.length();i++) {
			
			System.out.println(st1.charAt(i));
			
		}
		
		
		System.out.println(st1.toUpperCase());
		
		System.out.println(st1.toLowerCase());
		
		String Str2 = st1.substring(8);
		
		System.out.println(Str2);
		
		String st3 =st1.substring(3, 18);
		
		System.out.println(st3);
		
		String name = "chandra";
		
		String name2= "shekhar";
		
		System.out.println(name.equals(name2));
		
		System.out.println(name.equalsIgnoreCase(name2));
		
		
		System.out.println(name.concat(" ").concat(name2));
		
		System.out.println(name + " " + name2);
		
		String arr1[] = st1.split(",");
		
		for(int i =0 ; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1.length);

	}

}
// reverse the string 
//"i am automation tester"
//
//
//"tester automation i am "
