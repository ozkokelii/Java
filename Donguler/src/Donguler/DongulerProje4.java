package Donguler;

import java.util.Scanner;

public class DongulerProje4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double faizOrani = 0.06;
		System.out.println("Bankaya ho�geldiniz\n" + "Faiz oran�m�z : " + faizOrani);
		int anapara,vade;
		System.out.print("Yat�rmak istedi�iniz para : " );
		anapara = scanner.nextInt();
		System.out.print("Ka� y�l vadede kalacak : ");
		vade = scanner.nextInt();
		
		double toplampara = anapara;
		
		for(int i = 1; i<=vade; i++) {
			
			toplampara = (toplampara*faizOrani) + toplampara;
			System.out.println(i + ".\tY�l�n sonunda toplam paran�z : " + toplampara);
		}
	}

}
