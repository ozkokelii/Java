package KodBloklari;

import java.util.Scanner;

public class KodBloklariProje4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. vize notunuzu giriniz : ");
		int vize1 = scanner.nextInt();
		System.out.print("2. vize notunuzu giriniz : ");
		int vize2 = scanner.nextInt();
		System.out.print("Final notunuzu giriniz  : ");
		int finalnot = scanner.nextInt();
		System.out.print("Ortalamanýzý giriniz : ");
		double ortalama = scanner.nextDouble();
		
		double toplamnot = (vize1*3/10.0)+(vize2*3/10.0)+(finalnot*4/10.0);
		
		if(toplamnot<40) {
			System.out.print("DD aldýnýz...");
			if(ortalama<2.5) {
				System.out.print("\nDD ALDINIZ VE BU DERSÝ TEKRARDAN ALABÝLÝRSÝNÝZ...");
			}
		}else if(toplamnot>=40 && toplamnot<60) {
			System.out.print("CC aldýnýz..");
		}else if(toplamnot>=60 && toplamnot<80) {
			System.out.print("BB aldýnýz...");
		}else {
			System.out.print("AA aldýnýz...");
		}
	}

}
