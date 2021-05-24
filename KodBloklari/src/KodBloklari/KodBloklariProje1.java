package KodBloklari;

import java.util.Scanner;

public class KodBloklariProje1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. sayýyý giriniz :");
		int sayi1 = scanner.nextInt();
		System.out.print("2. sayýyý giriniz :");
		int sayi2 = scanner.nextInt();
		System.out.print("3. sayýyý giriniz :");
		int sayi3 = scanner.nextInt();
		
		if(sayi1 > sayi2 && sayi1 > sayi3) {
			
			System.out.print("En büyük 1. girdiðiniz sayýdýr"+ sayi1);
		}else if(sayi2 > sayi1 && sayi2 > sayi3) {
			
			System.out.print("En büyük 2. girdiðiniz sayýdýr"+ sayi2);
		}else {
			
			System.out.print("En büyük 3. girdiðiniz sayýdýr = "+ sayi3);
		}
		
	}

}
