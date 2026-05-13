package day1;


 class encap {

	private int age;// able to use it in same class
	
	
	public void setname(int age) {
		
		if(age>=18) {
		this.age = age;// with the help of this keyword we indicate the global variable 
	}
	}
	
	public int getname() {
			return age;
	}
}

public class accsesmodi {

	public static void main(String[] args) {
		

		encap ec = new encap();
		
		ec.setname(6);
		
		System.out.println(ec.getname());		
	}

}
