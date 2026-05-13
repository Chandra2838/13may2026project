package day1;


class parentxy{
	
	void add(int a , double b) {
		
		System.out.println(a+b);
		
		System.out.println("method1");
	}
	
	void add(double a ,int b){
		
		System.out.println(a+b);
		
		System.out.println("method2");
	}
}


	
public class oppss {

	public static void main(String[] args) {
		
		// how to call the object 
		
		
	
		
		parentxy pp = new parentxy();
		
		pp.add(3, 7.9);
		
		pp.add(3.4, 0);
		
	}

}
