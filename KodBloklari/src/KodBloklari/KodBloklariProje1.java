package KodBloklari;

import java.util.Scanner;

public class KodBloklariProje1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. say�y� giriniz :");
		int sayi1 = scanner.nextInt();
		System.out.print("2. say�y� giriniz :");
		int sayi2 = scanner.nextInt();
		System.out.print("3. say�y� giriniz :");
		int sayi3 = scanner.nextInt();
		
		if(sayi1 > sayi2 && sayi1 > sayi3) {
			
			System.out.print("En b�y�k 1. girdi�iniz say�d�r"+ sayi1);
		}else if(sayi2 > sayi1 && sayi2 > sayi3) {
			
			System.out.print("En b�y�k 2. girdi�iniz say�d�r"+ sayi2);
		}else {
			
			System.out.print("En b�y�k 3. girdi�iniz say�d�r = "+ sayi3);
		}
		
	}

}
