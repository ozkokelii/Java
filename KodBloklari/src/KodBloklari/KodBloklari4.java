package KodBloklari;

import java.util.Scanner;

public class KodBloklari4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("L�tfen ya��n�z� giriniz : ");
		
		int yas = scanner.nextInt();
		
		if(yas < 18) {
			
			System.out.println("Siktir git b�y� gel");
		}else {
			
			System.out.println("Mekana girebilirsiniz");
		}
		
	}

}
