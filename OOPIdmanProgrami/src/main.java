import java.util.Scanner;

public class main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�DMAN PROGRAMINA HO�GELD�N�Z...");
		
		String idmanlar = "....Ge�erli hareketler....\n"+
		"...Burpee...\n"+"...Pushup...\n"+"...Situp...\n"+"...Squat....";
		System.out.println(idmanlar);
		System.out.println("...Bir idman olu�turun...");
		System.out.print("Burpee say�s� : ");
		int burpee = scanner.nextInt();
		System.out.print("Pushup say�s� : ");
		int pushup = scanner.nextInt();
		System.out.print("Situp say�s� : ");
		int situp = scanner.nextInt();
		System.out.print("Squat say�s� : ");
		int squat = scanner.nextInt();
		
		scanner.nextLine();
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.print("�dman�n�z ba�l�yor...");
		
		while(idman.IdmanBittiMi()==false) {
			
			System.out.print("Hareket T�r�(Burpee,Pushup,Situp,Squat) : ");
			String tur = scanner.nextLine();
			System.out.print("Bu hareketten ka� tane yapacaks�n am�nakodu�um : ");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}
		System.out.print("IDMAN BA�ARIYLA B�TT� ��MD� S�KT�R G�T HAD�.|.");
		
	}
	

}
