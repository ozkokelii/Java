import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Beyblade Program�na HG...");
		System.out.println("��k�� i�in q ya bas�n�z...");
		
		
		while(true) {
			System.out.println("Hangi Beyblade �retmek istersiniz ? ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor....");
				break;
			}
			else{
				BeybladeFabrikas� fabrika = new BeybladeFabrikas�();
				
				Beyblade beyblade = fabrika.beybladeUret(islem);
				
						if(beyblade == null) {
							System.out.println("L�tfen ge�erli bir beyblade se�iniz ... ");
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
