package Donguler;

import java.util.Scanner;

public class DongulerProje1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int bakiye = 100;
		String islemler = "1.iþlem : Bakiye Öðrenme\n"+
		"2.iþlem : Para çekme\n"+
				"3.iþlem : Para yatýrma\n"+
		"Çýkmak için 0 a basýn...";
		System.out.println(islemler);
		int islem = scanner.nextInt();
		while(islem == 1) {
			System.out.println("Bakiyeniz  = "+ bakiye);
			if(islem == 1) {
				break;
			}
			
		}
		while(islem == 2) {
			System.out.println("Çekmek istediðiniz tutarý giriniz : ");
			int cektutar = scanner.nextInt();
			bakiye = bakiye - cektutar;
			System.out.println("Çekimden sonraki bakiyeniz  = "+ bakiye);
			if(islem == 2) {
				break;
			}
		}
		while(islem == 3) {
			System.out.println("Yatýrmak istediðiniz tutarý giriniz : ");
			int yattutar = scanner.nextInt();
			bakiye = bakiye+yattutar;
			System.out.println("Yatýrdýktan sonraki bakiye = " +bakiye);
			if(islem == 3) {
				break;
			}
		}
		while(islem == 0) {
			System.out.println("Çýkýyorsun");
			if(islem == 0) {
				break;
			}
		}
		while(islem != 0 && islem != 1 && islem != 2 && islem != 3) {
			System.out.println("Yanlýþ tuþlama... ");
			if(islem != 0 && islem != 1 && islem != 2 && islem != 3) {
				break;
			}
		}
	}

}
