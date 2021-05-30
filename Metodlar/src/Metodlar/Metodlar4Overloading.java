package Metodlar;

public class Metodlar4Overloading {
	public static void skorlar(String a, int b) {
		System.out.println(a + " isimli oyuncunun " + " skoru " + b);
		
	}
	public static void skorlar(String a) {
		System.out.println("skorsuz oyuncunun ismi " + a);
	}
	public static void skorlar(int b) {
		System.out.println("isimsiz oyuncunun skoru "+ b);
	}
	public static void main(String[]args) {
		skorlar("Omer", 10);
		skorlar("Gokay");
		skorlar(20);
	}

}
