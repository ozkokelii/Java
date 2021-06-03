import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Beyblade Programýna HG...");
		System.out.println("Çýkýþ için q ya basýnýz...");
		
		
		while(true) {
			System.out.println("Hangi Beyblade üretmek istersiniz ? ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor....");
				break;
			}
			else{
				BeybladeFabrikasý fabrika = new BeybladeFabrikasý();
				
				Beyblade beyblade = fabrika.beybladeUret(islem);
				
						if(beyblade == null) {
							System.out.println("Lütfen geçerli bir beyblade seçiniz ... ");
						}
						else {
							beyblade.bilgileriGoster();
							beyblade.kutsalCanavarOrtayaCikar();
							beyblade.saldir();
						}
				
			}
		}
	}

}
