package KodBloklari;

import java.util.Scanner;

public class KodBloklariProje3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("**********************");
		System.out.print("\n1.��LEM TOPLAMA"+ "\n2.��LEM �IKARMA"+ "\n3.��LEM �ARPMA"+ "\n4.��LEM B�LME" );
		System.out.print("\n**********************");
		System.out.print("\n��leminizi se�iniz : ");
		String islem = scanner.nextLine();
		int a;
		int b;
		
		switch(islem) {
		case "1" : 
			System.out.print("Birinci say� : ");
			a = scanner.nextInt();
			System.out.print("�kinci say� : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a+b) );
			break;
		case "2" : 
			System.out.print("Birinci say� : ");
			a = scanner.nextInt();
			System.out.print("�kinci say� : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a-b) );
			break;
		case "3" : 
			System.out.print("Birinci say� : ");
			a = scanner.nextInt();
			System.out.print("�kinci say� : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a*b) );
			break;
		case "4" : 
			System.out.print("Birinci say� : ");
			a = scanner.nextInt();
			System.out.print("�kinci say� : ");
			b = scanner.nextInt();
			System.out.print("Sonucunuz = "+ (a/b) );
			break;
			
		}
	}

}
