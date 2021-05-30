import java.util.Scanner;

public class main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ÝDMAN PROGRAMINA HOÞGELDÝNÝZ...");
		
		String idmanlar = "....Geçerli hareketler....\n"+
		"...Burpee...\n"+"...Pushup...\n"+"...Situp...\n"+"...Squat....";
		System.out.println(idmanlar);
		System.out.println("...Bir idman oluþturun...");
		System.out.print("Burpee sayýsý : ");
		int burpee = scanner.nextInt();
		System.out.print("Pushup sayýsý : ");
		int pushup = scanner.nextInt();
		System.out.print("Situp sayýsý : ");
		int situp = scanner.nextInt();
		System.out.print("Squat sayýsý : ");
		int squat = scanner.nextInt();
		
		scanner.nextLine();
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.print("Ýdmanýnýz baþlýyor...");
		
		while(idman.IdmanBittiMi()==false) {
			
			System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
			String tur = scanner.nextLine();
			System.out.print("Bu hareketten kaç tane yapacaksýn amýnakoduðum : ");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}
		System.out.print("IDMAN BAÞARIYLA BÝTTÝ ÞÝMDÝ SÝKTÝR GÝT HADÝ.|.");
		
	}
	

}
