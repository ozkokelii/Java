package Donguler;

import java.util.Scanner;

public class DongulerProje3 {
	public static void main(String[]args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int giris_hakki = 3;
		 
		 String sys_id = "Omer";
		 String sys_ps = "1234";
		 
		 System.out.println("************");
		 System.out.println("Kullanýcý giriþ sayfasý");
		 System.out.println("************");
		 
		 while(true) {
			 System.out.print("Kullanýcý adý giriniz : ");
			 String id = scanner.nextLine();
			 System.out.print("Parola giriniz : ");
			 String ps = scanner.nextLine();
			 if(id.equals(sys_id) && ps.equals(ps)) {
				 System.out.println("Hoþgeldiniz... "+ id);
				 break;
			 }
			 else if(id.equals(sys_id) && !ps.equals(sys_ps)) {
				 System.out.println("Parolayý yanlýþ girdiniz");
				 giris_hakki -= 1;
				 System.out.println("Giriþ hakký þansýnýz : "+giris_hakki);
			 }
			 else if(!id.equals(sys_id) && ps.equals(sys_ps)) {
				 System.out.println("Kullanýcý adýný yanlýþ girdiniz");
				 giris_hakki -= 1;
				 System.out.println("Giriþ hakký þansýnýz : "+giris_hakki);
			 }
			 else if(!id.equals(sys_id) && !ps.equals(sys_ps)) {
				 System.out.println("Kullanýcý adý ve Parolayý yanlýþ girdiniz");
				 giris_hakki -= 1;
				 System.out.println("Giriþ hakký þansýnýz : "+giris_hakki);
			 }
			 if(giris_hakki == 0){
				 System.out.println("Giriþ hakkýnýzý doldurdunuz hesabýnýz bloke edildi");
				 break;
			 }
		 }
	}

}
