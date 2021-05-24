package kilometreMasrafHesaplama;

import java.util.Scanner;

public class HipotenusHesaplama {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci kenarýn uzunluðunu giriniz : ");
		int a = scanner.nextInt();
		System.out.print("Ýkinci kenarýn uzunluðunu giriniz : ");
		int b = scanner.nextInt();
		
		double h = Math.sqrt(a * a + b * b); 
		
		System.out.println("Hipotenüsünüz : "+ h);
	}

}
