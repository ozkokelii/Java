package Donguler;

import java.util.Scanner;

public class DongulerProje1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int bakiye = 100;
		String islemler = "1.i�lem : Bakiye ��renme\n"+
		"2.i�lem : Para �ekme\n"+
				"3.i�lem : Para yat�rma\n"+
		"��kmak i�in 0 a bas�n...";
		System.out.println(islemler);
		int islem = scanner.nextInt();
		while(islem == 1) {
			System.out.println("Bakiyeniz  = "+ bakiye);
			if(islem == 1) {
				break;
			}
			
		}
		while(islem == 2) {
			System.out.println("�ekmek istedi�iniz tutar� giriniz : ");
			int cektutar = scanner.nextInt();
			bakiye = bakiye - cektutar;
			System.out.println("�ekimden sonraki bakiyeniz  = "+ bakiye);
			if(islem == 2) {
				break;
			}
		}
		while(islem == 3) {
			System.out.println("Yat�rmak istedi�iniz tutar� giriniz : ");
			int yattutar = scanner.nextInt();
			bakiye = bakiye+yattutar;
			System.out.println("Yat�rd�ktan sonraki bakiye = " +bakiye);
			if(islem == 3) {
				break;
			}
		}
		while(islem == 0) {
			System.out.println("��k�yorsun");
			if(islem == 0) {
				break;
			}
		}
		while(islem != 0 && islem != 1 && islem != 2 && islem != 3) {
			System.out.println("Yanl�� tu�lama... ");
			if(islem != 0 && islem != 1 && islem != 2 && islem != 3) {
				break;
			}
		}
	}

}
