package Metodlar;

import java.util.Scanner;

public class MetodlarProje2 {
	public static int cikarma(int a, int b) {
		return (a-b);
	}
	public static double bolme(int a, int b) {
		return((double) a/b);
	}
	public static int toplama(int a, int b, int c) {
		return(a+b+c);
	}
	public static int toplama(int a, int b) {
		return(a+b);
	}
	public static int carpma(int a, int b, int c) {
		return(a*b*c);
	}
	public static int carpma(int a, int b) {
		return(a*b);
	}
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String islemler = ("1.iþlem toplama\n"+"2.iþlem çýkarma\n"+"3.iþlem bölme\n"+"4.iþlem çarpma\n"+"Çýkmak için q ya basýnýz");
		System.out.println("*****************");
		System.out.println(islemler);
		System.out.println("*****************");
		
		while(true) {
			System.out.print("Ýþlem seçiniz : " );
			String secim = scanner.nextLine();
			
			if(secim.equals("q")) {
				System.out.println("Programdan çýkýlýyor");
				break;
			}
			else if(secim.equals("1")) {
				
				System.out.print("Kaç deðer gireceksiniz (max 3 min 2 girilebilir) : ");
				
				int kacsayi = scanner.nextInt();
				
				if(kacsayi == 2) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.println("2 sayýnýn toplama sonucu  :: " + toplama(a, b));
				}else if(kacsayi == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.print("c : ");
					int c = scanner.nextInt();
					System.out.println("3 sayýnýn toplama sonucu  :: " + toplama(a, b, c));
				}else {
					System.out.println("Buna uygun iþlemimiz yoktur......");
				}
				break;
			}
			else if(secim.equals("2")) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();
				System.out.println("Çýkarma sonucu : "+ cikarma(a,b));
				break;
			}
			else if(secim.equals("3")) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();
				System.out.println("Çýkarma sonucu : "+ bolme(a,b));
				break;
			}
			else if(secim.equals("4")) {
				
				System.out.print("Kaç deðer gireceksiniz (max 3 min 2 girilebilir) : ");
				
				int kacsayi = scanner.nextInt();
				
				if(kacsayi == 2) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.println("2 sayýnýn çarpým sonucu  :: " + carpma(a, b));
				}else if(kacsayi == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.print("c : ");
					int c = scanner.nextInt();
					System.out.println("3 sayýnýn çarpým sonucu  :: " + carpma(a, b, c));
				}else {
					System.out.println("Buna uygun iþlemimiz yoktur......");
				}
				break;
			}
		}
		
		
		
	}

}
