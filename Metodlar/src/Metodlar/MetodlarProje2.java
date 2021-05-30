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
		String islemler = ("1.i�lem toplama\n"+"2.i�lem ��karma\n"+"3.i�lem b�lme\n"+"4.i�lem �arpma\n"+"��kmak i�in q ya bas�n�z");
		System.out.println("*****************");
		System.out.println(islemler);
		System.out.println("*****************");
		
		while(true) {
			System.out.print("��lem se�iniz : " );
			String secim = scanner.nextLine();
			
			if(secim.equals("q")) {
				System.out.println("Programdan ��k�l�yor");
				break;
			}
			else if(secim.equals("1")) {
				
				System.out.print("Ka� de�er gireceksiniz (max 3 min 2 girilebilir) : ");
				
				int kacsayi = scanner.nextInt();
				
				if(kacsayi == 2) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.println("2 say�n�n toplama sonucu  :: " + toplama(a, b));
				}else if(kacsayi == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.print("c : ");
					int c = scanner.nextInt();
					System.out.println("3 say�n�n toplama sonucu  :: " + toplama(a, b, c));
				}else {
					System.out.println("Buna uygun i�lemimiz yoktur......");
				}
				break;
			}
			else if(secim.equals("2")) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();
				System.out.println("��karma sonucu : "+ cikarma(a,b));
				break;
			}
			else if(secim.equals("3")) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();
				System.out.println("��karma sonucu : "+ bolme(a,b));
				break;
			}
			else if(secim.equals("4")) {
				
				System.out.print("Ka� de�er gireceksiniz (max 3 min 2 girilebilir) : ");
				
				int kacsayi = scanner.nextInt();
				
				if(kacsayi == 2) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.println("2 say�n�n �arp�m sonucu  :: " + carpma(a, b));
				}else if(kacsayi == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					System.out.print("c : ");
					int c = scanner.nextInt();
					System.out.println("3 say�n�n �arp�m sonucu  :: " + carpma(a, b, c));
				}else {
					System.out.println("Buna uygun i�lemimiz yoktur......");
				}
				break;
			}
		}
		
		
		
	}

}
