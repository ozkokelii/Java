package Donguler;

import java.util.Scanner;

public class DongulerProje4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double faizOrani = 0.06;
		System.out.println("Bankaya hoþgeldiniz\n" + "Faiz oranýmýz : " + faizOrani);
		int anapara,vade;
		System.out.print("Yatýrmak istediðiniz para : " );
		anapara = scanner.nextInt();
		System.out.print("Kaç yýl vadede kalacak : ");
		vade = scanner.nextInt();
		
		double toplampara = anapara;
		
		for(int i = 1; i<=vade; i++) {
			
			toplampara = (toplampara*faizOrani) + toplampara;
			System.out.println(i + ".\tYýlýn sonunda toplam paranýz : " + toplampara);
		}
	}

}
