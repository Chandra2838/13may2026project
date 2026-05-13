package day1;

class parent678{
	
	void add(int a , int b) {
		
		System.out.println(a+b);
	}
	

	void add(double c , int d) {
		
		System.out.println(c+d);
	}

		void add(int a , int b , int c) {
			
			System.out.println(a+b+c);
		}
		
		void add(int a ,int b ,double c) {
			System.out.println(a+b+c);
		}


}


public class polyyy8484 {

	public static void main(String[] args) {
		
		
		parent678 pr = new parent678();
		
		pr.add(2, 5);
		pr.add(5.6, 9);
		pr.add(6, 9);
		
	}

}
