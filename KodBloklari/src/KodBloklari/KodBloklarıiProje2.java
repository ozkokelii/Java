package KodBloklari;

import java.util.Scanner;

public class KodBloklar�iProje2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilonuzu giriniz : ");
		double kilo = scanner.nextDouble();
		
		System.out.print("Boyunuzu girin : ");
		double boy = scanner.nextDouble();
		
		double bki = kilo / (boy * boy);
		//System.out.print("Boy kilo endeksiniz = "+ bki);
		
		if(bki < 18.5) {
			System.out.print("Boy kilo endeksinzi = " + bki + "\t ZAYIFSINIZ");
		}else if(bki >= 18.5 && bki < 25) {
			System.out.print("Boy kilo endeksiniz = " + bki + " NORMALS�N�Z");
		}else if(bki >= 25 && bki < 30) {
			System.out.print("Boy kilo endeksiniz = " + bki + "\t A�IRI K�LOLUSUNUZ");
		}else {
			System.out.print("Boy kilo endeksiniz = " + bki + "\t OBEZS�N�Z");
		}
	}

}
