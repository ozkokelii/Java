package Donguler;

import java.util.Scanner;

public class DongulerProje3 {
	public static void main(String[]args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int giris_hakki = 3;
		 
		 String sys_id = "Omer";
		 String sys_ps = "1234";
		 
		 System.out.println("************");
		 System.out.println("Kullan�c� giri� sayfas�");
		 System.out.println("************");
		 
		 while(true) {
			 System.out.print("Kullan�c� ad� giriniz : ");
			 String id = scanner.nextLine();
			 System.out.print("Parola giriniz : ");
			 String ps = scanner.nextLine();
			 if(id.equals(sys_id) && ps.equals(ps)) {
				 System.out.println("Ho�geldiniz... "+ id);
				 break;
			 }
			 else if(id.equals(sys_id) && !ps.equals(sys_ps)) {
				 System.out.println("Parolay� yanl�� girdiniz");
				 giris_hakki -= 1;
				 System.out.println("Giri� hakk� �ans�n�z : "+giris_hakki);
			 }
			 else if(!id.equals(sys_id) && ps.equals(sys_ps)) {
				 System.out.println("Kullan�c� ad�n� yanl�� girdiniz");
				 giris_hakki -= 1;
				 System.out.println("Giri� hakk� �ans�n�z : "+giris_hakki);
			 }
			 else if(!id.equals(sys_id) && !ps.equals(sys_ps)) {
				 System.out.println("Kullan�c� ad� ve Parolay� yanl�� girdiniz");
				 giris_hakki -= 1;
				 System.out.println("Giri� hakk� �ans�n�z : "+giris_hakki);
			 }
			 if(giris_hakki == 0){
				 System.out.println("Giri� hakk�n�z� doldurdunuz hesab�n�z bloke edildi");
				 break;
			 }
		 }
	}

}
