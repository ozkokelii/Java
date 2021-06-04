
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String secim = "1. Kare\n"+"2.Ucgen\n"+"3.Daire"+"q. Çıkış";
        
        while(true){
            System.out.println("ALAN HESAPLAMA HG");
            System.out.println("------------------");
            System.out.println(secim);
            System.out.print("Hesaplama seçiniz : ");
            secim = scanner.nextLine();
            
            Sekil sekil = null;
            
            if(secim.equals("q")){
                System.out.println("Çıktınız...");
                break;
            }else if(secim.equals("1")){
                System.out.print("Karenin kenarını giriniz : ");
                int kenar  = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare("Kare1", kenar);
                
                sekil.alanHesapla();
            }else if(secim.equals("2")){
                System.out.print("Birinci kenarı giriniz : ");
                int a = scanner.nextInt();
                System.out.print("İkinci kenarı giriniz : ");
                int b = scanner.nextInt();
                System.out.print("Üçüncü kenarı giriniz : ");
                int c = scanner.nextInt();
                
                sekil = new Ucgen(a,b,c,"Uçgen1");
                
                sekil.alanHesapla();
            }else if(secim.equals("3")){
                System.out.print("Yarıçap giriniz  : ");
                int r = scanner.nextInt();
                
                sekil = new Daire("Daire1", r);
                
                sekil.alanHesapla();
            }else{
                System.out.println("Sadece 1-2-3-q tuşları tuşlanabilir");
                continue;
            }
        }
    }
    
}
