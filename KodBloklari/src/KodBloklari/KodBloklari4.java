package KodBloklari;

import java.util.Scanner;

public class KodBloklari4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen yaþýnýzý giriniz : ");
		
		int yas = scanner.nextInt();
		
		if(yas < 18) {
			
			System.out.println("Siktir git büyü gel");
		}else {
			
			System.out.println("Mekana girebilirsiniz");
		}
		
	}

}
