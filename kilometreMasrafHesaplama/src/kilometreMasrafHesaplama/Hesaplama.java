package kilometreMasrafHesaplama;

import java.util.Scanner;

public class Hesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilometrede ka� kuru� yak�yor : ");
		double kurus = scanner.nextDouble();
		
		System.out.print("Ka� kilometre gittiniz : ");
		int km = scanner.nextInt();
		
		System.out.print("Toplam masraf�n�z : "+ (kurus*km) +"tl'dir" );
	}

}
