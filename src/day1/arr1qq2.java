package day1;

public class arr1qq2 {

	public static void main(String[] args) {
		
		
		int arr1[]= {56,23,78,90,45};
		
		for(int i =0 ; i<arr1.length;i++) {
			
			for(int j= i+1;j<arr1.length;j++) {
				
				if(arr1[i]>arr1[j]) {
					
					int temp = arr1[i];
					
					arr1[i]=arr1[j];
					
					arr1[j]=temp;
				}
			}
		}
		
		for(int  f= 0 ; f<arr1.length; f++) {
			
			System.out.println(arr1[f]);
		}
		
	}

}
