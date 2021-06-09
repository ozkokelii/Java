
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Kumandaya HG");
        
        Scanner scanner  = new Scanner(System.in);

        String islemler = "İşlemler.. \n"+
        "1. Kanalları Göster \n"+
        "2. Kanal Ekle \n"+
        "3. Kanal Sil\n"+
        "4. Kanal Sayısını Göster \n"+
        "Çıkış için q ya bas...";

        Kumanda kumanda = new Kumanda();

        while(true){

            System.out.println("******************");
            System.out.println(islemler);
            System.out.println("******************");

            System.out.print("İşlem Seçiniz : ");

            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Çıkış yaptınız...");
                break;
            }
            else if(islem.equals("1")){

                kanallariGoster(kumanda);

            }
            else if(islem.equals("2")){
                
                System.out.println("Eklenecek kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalEkle(kanal_ismi);

            }
            else if(islem.equals("3")){

                System.out.println("Silinecek kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalSil(kanal_ismi);
            }
            else if(islem.equals("4")){

                System.out.println("Kanal sayısı : " + kumanda.kanalSayisi());

            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }
        
        
    }
    public static void kanallariGoster(Kumanda kumanda){

        if(kumanda.kanalSayisi()==0){
            System.out.println("Hiç kanal bulunmamakta...");
        }else{
            for(String kanal : kumanda){
                System.out.println("Kanal : " + kanal);
            }
        }

    }
    
}
