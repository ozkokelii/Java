package KodBloklari;

import java.util.Scanner;

public class KodBloklari6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Say� giriniz : ");
		int sayi = scanner.nextInt();
		
		switch(sayi) {
		case 1:
			System.out.print("1. say�y� se�tiniz");
			break;
		case 2:
			System.out.print("2. say�y� se�tiniz");
			break;
		case 3:
			System.out.print("3. say�y� se�tiniz");
			break;
		case 4:
			System.out.print("4. say�y� se�tiniz");
			break;
			default:
				System.out.print("Say�m�z bitti...");
		}
	}	

}
