package Metodlar;

public class Metodlar3Return {
	/*public static int toplam(int a, int b, int c) {
		//System.out.print(a+b+c);
		return (a+b+c);
	}*/
	public static int ikicarp(int a) {
		System.out.println("Girilen sayý = "+ a);
		return a*2;
	}
	public static int ikitopla(int a) {
		return a+2;
	}
	public static int dortcarp(int a) {
		return a*4;
	}
	public static void main(String[]args) {
		//System.out.print("Çýktý ::: "+ toplam(1,3,5));
		System.out.print("Metot çýktýýs :::::::::: " + dortcarp(ikitopla(ikicarp(4))));
	}
}
