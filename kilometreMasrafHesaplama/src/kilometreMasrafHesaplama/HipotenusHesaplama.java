package kilometreMasrafHesaplama;

import java.util.Scanner;

public class HipotenusHesaplama {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci kenar�n uzunlu�unu giriniz : ");
		int a = scanner.nextInt();
		System.out.print("�kinci kenar�n uzunlu�unu giriniz : ");
		int b = scanner.nextInt();
		
		double h = Math.sqrt(a * a + b * b); 
		
		System.out.println("Hipoten�s�n�z : "+ h);
	}

}
