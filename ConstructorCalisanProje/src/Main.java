import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�al��anlar Program�na Ho�geldiniz...");
		
		System.out.println("++++++++++++++++++++++++++++");
		
		System.out.println("1. Yaz�l�mc� ��lemleri...\n" + "2. Y�netici ��lemleri...\n" + "��kmak i�in q ya bas�n�z...\n");
		
		System.out.println("++++++++++++++++++++++++++++");
		
		while(true) {
			
			System.out.print("��lem Se�iniz : ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�yorsunuz... ");
				break;
			}
			else if(islem.equals("1")) {
				
				Yazilimci yazilimci = new Yazilimci("�mer", "�zk�keli", 7154, "Java, Dart, C.");
				
				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("Yaz�l�mc� ��lemlerine HG");
				
				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("1. Format At ��lemleri...\n" + "2. Bilgileri G�ster ��lemleri...\n" + "��kmak i�in q ya bas�n�z...\n");
				
				System.out.println("++++++++++++++++++++++++++++");
				
				while(true) {
					
					System.out.print("��lem Se�iniz : ");
					String y_islem = scanner.nextLine();
					
					if(y_islem.equals("q")) {
						System.out.println("Yaz�l�mc� i�lemlerinden ��k�yorsunuz... ");
						break;
					}
					else if(y_islem.equals("1")) {
						
						System.out.print("��letim Sistemi Se�iniz : ");
						String isletim_sistemi = scanner.nextLine();
						yazilimci.formatAt(isletim_sistemi);
						
					}
					else if(y_islem.equals("2")) {
						
						yazilimci.bilgileriGoster();
					}
					else {
						System.out.println("Yanl�� i�lem se�tiniz");
					}
				}
				
			}
			else if(islem.equals("2")) {
				
				Yonetici yonetici = new Yonetici("Abim", "Numan �zk�keli", 1781, 20);
				
				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("Y�netici ��lemlerine HG");

				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println("1. Zam Yap ��lemleri...\n" + "2. Bilgileri G�ster ��lemleri...\n" + "��kmak i�in q ya bas�n�z...\n");
				
				System.out.println("++++++++++++++++++++++++++++");

				while(true) {
					
					System.out.print("��lem Se�iniz : ");
					String yonetici_islem = scanner.nextLine();
					
					if(yonetici_islem.equals("q")) {
						System.out.println("Y�netici i�lemlerinden ��k�yorsunuz... ");
						break;
					}
					else if(yonetici_islem.equals("1")) {
						System.out.println("Zam miktar� giriniz : ");
						int zamMiktari = scanner.nextInt();
						scanner.nextLine();
						yonetici.zamYap(zamMiktari);
						
					}
					else if(yonetici_islem.equals("2")) {
						
						yonetici.bilgileriGoster();
					}
					else {
						System.out.println("Yanl�� i�lem se�tiniz");
					}
				}
				
			}
			else {
				System.out.println("Yanl�� i�lem se�tiniz");

			}
		}

	}
}
