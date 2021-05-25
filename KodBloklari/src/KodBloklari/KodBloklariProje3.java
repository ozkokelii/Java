package KodBloklari;

import java.util.Scanner;

public class KodBloklariProje3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("**********************");
		System.out.print("\n1.ÝÞLEM TOPLAMA"+ "\n2.ÝÞLEM ÇIKARMA"+ "\n3.ÝÞLEM ÇARPMA"+ "\n4.ÝÞLEM BÖLME" );
		System.out.print("\n**********************");
		System.out.print("\nÝþleminizi seçiniz : ");
		String islem = scanner.nextLine();
		int a;
		int b;
		
		switch(islem) {
		case "1" : 
			System.out.print("Birinci sayý : ");
			a = scanner.nextInt();
			System.out.print("Ýkinci sayý : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a+b) );
			break;
		case "2" : 
			System.out.print("Birinci sayý : ");
			a = scanner.nextInt();
			System.out.print("Ýkinci sayý : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a-b) );
			break;
		case "3" : 
			System.out.print("Birinci sayý : ");
			a = scanner.nextInt();
			System.out.print("Ýkinci sayý : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a*b) );
			break;
		case "4" : 
			System.out.print("Birinci sayý : ");
			a = scanner.nextInt();
			System.out.print("Ýkinci sayý : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a/b) );
			break;
			
		}
	}

}
