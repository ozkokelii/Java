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
		System.out.println("Faktoriyelini almak istedi�iniz say�y� giriniz : ");
		int sayi = scanner.nextInt();
		while(sayi>0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Sonu� = "+ faktoriyel);*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rakamlar�n�n toplam�n�n istedi�iniz say�y� giriniz : ");
		int i = scanner.nextInt();
		int toplam = 0;
		do {
			toplam += i % 10;
			i = i/10;
			System.out.println("Say� : "+i);
		}while(i >0);
		System.out.println("Sonu� = "+toplam);
	}

}
