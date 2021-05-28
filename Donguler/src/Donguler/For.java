package Donguler;

import java.util.Scanner;

public class For {
	public static void main(String[]args) {
		/*for(int i = 1; i<10; i++) {
			System.out.println("i = "+ i);
		} 
		for(int i = 0; i<5; i++) {
			System.out.println("Omer");
		}
		int i=0;
		int j=0;
		for(;i<5  && j<10; i++,j++) {
			System.out.println("i = "+ i);
			System.out.println("j = "+ j);
		}*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayý giriniz  = ");
		
		int faktoriyel = 1;
		
		int sayi = scanner.nextInt();
		
		
		for(int i = 1; i<=sayi;i++) {
			
			faktoriyel *= i;
			
			System.out.println("Faktoriyel = "+ faktoriyel +"i = "+ i);
		}
		System.out.println("Fatoriyel = "+ faktoriyel);
	}

}
