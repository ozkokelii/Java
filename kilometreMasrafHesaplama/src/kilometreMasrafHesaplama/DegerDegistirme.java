package kilometreMasrafHesaplama;

import java.util.Scanner;

public class DegerDegistirme {
	public static void main(String[]args) {
		Scanner scanner  = new Scanner(System.in);
		
		int birinci_sayi;
		int ikinci_sayi;
		
		System.out.println("Birinci say�y� giriniz : ");
		birinci_sayi = scanner.nextInt();
		
		System.out.println("�kinci say�y� giriniz : ");
		ikinci_sayi = scanner.nextInt();
		
		System.out.println("De�i�tirilmeden �nce .....");
		System.out.println("Birinci say� : "+ birinci_sayi + "\n�kinci say� : "+ ikinci_sayi);
		
		int gecici = birinci_sayi;
		birinci_sayi = ikinci_sayi;
		ikinci_sayi = gecici;
		System.out.println("De�i�tirildikten sonra .....");
		System.out.println("Birinci say� : "+ birinci_sayi + "\n�kinci say� : "+ gecici);
		
		
	}

}
