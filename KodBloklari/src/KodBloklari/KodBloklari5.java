package KodBloklari;

import java.util.Scanner;

public class KodBloklari5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Yaþýnýzý giriniz : ");
		int yas = scanner.nextInt();
		
		if(yas <= 15) {
			
			System.out.print("Çocuksunuz");
		}else if(yas <= 30 ) {
			
			System.out.print("Gençsiniz");
		}else if(yas <= 45) {
			
			System.out.print("Orta yaþlýsýnýz");
		}else {
			
			System.out.print("Mezar beðen artýk... ");
		}
	}
}
