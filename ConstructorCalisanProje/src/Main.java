import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Çalýþanlar Programýna Hoþgeldiniz...");
		
		System.out.println("++++++++++++++++++++++++++++");
		
		System.out.println("1. Yazýlýmcý Ýþlemleri...\n" + "2. Yönetici Ýþlemleri...\n" + "Çýkmak için q ya basýnýz...\n");
		
		System.out.println("++++++++++++++++++++++++++++");
		
		while(true) {
			
			System.out.print("Ýþlem Seçiniz : ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan Çýkýyorsunuz... ");
				break;
			}
			else if(islem.equals("1")) {
				
				Yazilimci yazilimci = new Yazilimci("Ömer", "Özkökeli", 7154, "Java, Dart, C.");
				
				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("Yazýlýmcý Ýþlemlerine HG");
				
				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("1. Format At Ýþlemleri...\n" + "2. Bilgileri Göster Ýþlemleri...\n" + "Çýkmak için q ya basýnýz...\n");
				
				System.out.println("++++++++++++++++++++++++++++");
				
				while(true) {
					
					System.out.print("Ýþlem Seçiniz : ");
					String y_islem = scanner.nextLine();
					
					if(y_islem.equals("q")) {
						System.out.println("Yazýlýmcý iþlemlerinden Çýkýyorsunuz... ");
						break;
					}
					else if(y_islem.equals("1")) {
						
						System.out.print("Ýþletim Sistemi Seçiniz : ");
						String isletim_sistemi = scanner.nextLine();
						yazilimci.formatAt(isletim_sistemi);
						
					}
					else if(y_islem.equals("2")) {
						
						yazilimci.bilgileriGoster();
					}
					else {
						System.out.println("Yanlýþ iþlem seçtiniz");
					}
				}
				
			}
			else if(islem.equals("2")) {
				
				Yonetici yonetici = new Yonetici("Abim", "Numan Özkökeli", 1781, 20);
				
				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("Yönetici Ýþlemlerine HG");

				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("1. Zam Yap Ýþlemleri...\n" + "2. Bilgileri Göster Ýþlemleri...\n" + "Çýkmak için q ya basýnýz...\n");
				
				System.out.println("++++++++++++++++++++++++++++");

				while(true) {
					
					System.out.print("Ýþlem Seçiniz : ");
					String yonetici_islem = scanner.nextLine();
					
					if(yonetici_islem.equals("q")) {
						System.out.println("Yönetici iþlemlerinden Çýkýyorsunuz... ");
						break;
					}
					else if(yonetici_islem.equals("1")) {
						System.out.println("Zam miktarý giriniz : ");
						int zamMiktari = scanner.nextInt();
						scanner.nextLine();
						yonetici.zamYap(zamMiktari);
						
					}
					else if(yonetici_islem.equals("2")) {
						
						yonetici.bilgileriGoster();
					}
					else {
						System.out.println("Yanlýþ iþlem seçtiniz");
					}
				}
				
			}
			else {
				System.out.println("Yanlýþ iþlem seçtiniz");

			}
		}

	}
}
