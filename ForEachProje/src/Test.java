
import java.util.Scanner;


public class Test {
    private static Scanner scanner = new Scanner(System.in);
    private static Sarkicilar sarkicilar = new Sarkicilar();
    
    public static void goruntule(){
        sarkicilar.sarkiclari_bastir();;
    }
    public static void ekle(){
        System.out.println("Eklemek istediğini şarkıcı ismi : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void guncelle(){
        System.out.println("GÜncellemek istediğiniz pozisyon(1-2-3 vb )");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
    }
    public static void sil(){
        System.out.println("Silmek istediğiniz pozisyon (1-2-3 vb )");
        
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    public static void ara(){
        System.out.println("Aramak istediğini şarkıcı");
        
        String isim = scanner.nextLine();
        
        sarkicilar.sarkici_bul(isim); 
    }
    
    public static void islemleriBastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık...");
        
    }
    public static void main(String[] args) {
        
        System.out.println("\t Şarkıcılar Uygulamasına HG");
        
        islemleriBastir();
        
        boolean cikis = false;
        
        int islem;
        
        while(!cikis){
            
            System.out.print("Bir işlem seçiniz : ");
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch(islem){
                case 0 : 
                    islemleriBastir();
                    break;
                case 1 :
                    goruntule();
                    break;
                case 2 : 
                    ekle();
                    break;
                case 3 : 
                    guncelle();
                    break;
                case 4 : 
                    sil();
                    break;
                case 5 : 
                    ara();
                    break;
                case 6 :
                    cikis = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
                    
            }
        }
        
    }
    
}
