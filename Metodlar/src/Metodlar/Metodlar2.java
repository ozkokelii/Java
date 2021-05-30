package Metodlar;

public class Metodlar2 {
	public static void toplam(int a, int b, int c) {
		System.out.println("Toplamlar : " + (a+b+c));
	}
	public static void selam(String isim) {
		
		System.out.println("Selam " + isim);
	
	}
	public static void main(String []args ) {
		selam("omer");
		toplam(1,3,2);
	}

}
