package Metodlar;

import java.util.Scanner;

public class Metodlar1 {
	public static void selam() {
		System.out.println("metod");
	}
	public static void fakt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Fakt alýnacak sayýyý giriniz : ");
		int sayi = scanner.nextInt();
		
		int fakt = 1;
		while(sayi >0) {
			
			fakt *= sayi;
			sayi--;
			
		}
		System.out.print("FAKT SONUUC ::::" + fakt);
	}
	public static void main(String[]args) {
		selam();
		fakt();
	}

}
