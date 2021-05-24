package KodBloklari;

import java.util.Scanner;

public class KodBloklari6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayý giriniz : ");
		int sayi = scanner.nextInt();
		
		switch(sayi) {
		case 1:
			System.out.print("1. sayýyý seçtiniz");
			break;
		case 2:
			System.out.print("2. sayýyý seçtiniz");
			break;
		case 3:
			System.out.print("3. sayýyý seçtiniz");
			break;
		case 4:
			System.out.print("4. sayýyý seçtiniz");
			break;
			default:
				System.out.print("Sayýmýz bitti...");
		}
	}	

}
