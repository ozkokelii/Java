package Donguler;

import java.util.Scanner;

public class WhileDo {
	public static void main(String[]args) {
		/*int i = 0;
		while(i<5) {
			System.out.println("i = " + i);
			i++;
		}*/
		/*Scanner scanner = new Scanner(System.in);
		int faktoriyel = 1;
		System.out.println("Faktoriyelini almak istediðiniz sayýyý giriniz : ");
		int sayi = scanner.nextInt();
		while(sayi>0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Sonuç = "+ faktoriyel);*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rakamlarýnýn toplamýnýn istediðiniz sayýyý giriniz : ");
		int i = scanner.nextInt();
		int toplam = 0;
		do {
			toplam += i % 10;
			i = i/10;
			System.out.println("Sayý : "+i);
		}while(i >0);
		System.out.println("Sonuç = "+toplam);
	}

}
