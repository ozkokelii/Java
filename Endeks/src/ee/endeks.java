package ee;

import java.util.Scanner;

public class endeks {
	public static void main(String[] args) {
		//Beden kitlesi = Kilo/boy(m)*boy(m)
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Kilonuzu giriniz : " );
		int kilo = scanner.nextInt();
		System.out.println("Boyunuzu giriniz(1.72 gibi) : " );
		int boy = scanner.nextInt();
		
		int endeks = kilo / (boy * boy);

		System.out.println("Endeksiniz = " + endeks);

		
	}

}
