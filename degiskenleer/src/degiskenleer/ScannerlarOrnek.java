package degiskenleer;

import java.util.Scanner;

public class ScannerlarOrnek {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);//line=string için int=int double=double char=char 
		
		/*if(scanner.hasNextInt()) {
			
			int sayi = scanner.nextInt();

			System.out.println("Sayýnýz : " + sayi);
		}else {
			
			System.out.println("Lütfen sayý giriniz ");
		}*/
		
		int sayi1 = scanner.nextInt();
		int sayi2 = scanner.nextInt();
		int sayi3 = scanner.nextInt();
		
		String isim = scanner.nextLine();
		
		System.out.println("1. = " + sayi1 + "2. = " + sayi2 + "3. = " + sayi3 );
		scanner.nextLine();
		System.out.println("isim : " + isim);
		
		
	}

}
