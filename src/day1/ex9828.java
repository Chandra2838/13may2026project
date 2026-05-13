package day1;

import java.util.Scanner;

public class ex9828 {

	public static void main(String[] args) {
		
	int num = 1;
	
	for (int i =1 ; i<=4; i++) {
		
		for(int j=1 ; j<=i ;j++) {
			
			if(num%2==0) {
				System.out.print("0");
			}else {
				System.out.print("1");
			}
			num++;
		}
		System.out.println();
	}

	}

}
