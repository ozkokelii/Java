
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("MATFİZPROBHG");
        
        String islemler = "İşlemler \n"+
                "1.Daire alanı\n"+
                "2.Üçgen Çevresi\n"+
                "3.Vektörel çarpım\n"+
                "Çıkış q";
        
        while (true) {   
            System.out.println(islemler);
            System.out.println("İşlem seç");
            System.out.println("**************");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }else if(islem.equals("1")){
                System.out.println("Yarıçap giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Program.Matematik.ucgenAlan(yaricap);
            }else if(islem.equals("2")){
                System.out.println("1.kenar gir");
                int kenar1 = scanner.nextInt();
                System.out.println("2.kenar gir");
                int kenar2 = scanner.nextInt();
                System.out.println("3.kenar gir");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Program.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            }else if(islem.equals("3")){
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");
                Program.Fizik.icCarpim(vec1, vec2);
            }else{
                System.out.println("GEçersiz işlem ");
            }
        }
    }
    
}
