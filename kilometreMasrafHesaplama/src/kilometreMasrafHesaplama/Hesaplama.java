package kilometreMasrafHesaplama;

import java.util.Scanner;

public class Hesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilometrede kaç kuruþ yakýyor : ");
		double kurus = scanner.nextDouble();
		
		System.out.print("Kaç kilometre gittiniz : ");
		int km = scanner.nextInt();
		
		System.out.print("Toplam masrafýnýz : "+ (kurus*km) +"tl'dir" );
	}

}
