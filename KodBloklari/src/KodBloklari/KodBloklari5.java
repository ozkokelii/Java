package KodBloklari;

import java.util.Scanner;

public class KodBloklari5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ya��n�z� giriniz : ");
		int yas = scanner.nextInt();
		
		if(yas <= 15) {
			
			System.out.print("�ocuksunuz");
		}else if(yas <= 30 ) {
			
			System.out.print("Gen�siniz");
		}else if(yas <= 45) {
			
			System.out.print("Orta ya�l�s�n�z");
		}else {
			
			System.out.print("Mezar be�en art�k... ");
		}
	}
}
