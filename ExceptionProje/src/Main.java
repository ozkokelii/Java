
public class Main {
    public static void main(String[] args) throws InterruptedException, HarcException, VizeException {
        
        
        System.out.println("Havalimanına HG..");
        
        String sartlar = "Yurtdışı çıkış kurallar\n"
        +"Siyasi yasağınızın olmaması lazım \n"
        +"15 TL harcı yatımanız lazım\n"
        +"Gideceğiniz ülkenin vizesi lazım";
        
        String mesaj = "Şartların hepsine uyulmalı";
        
        while(true){
            System.out.println("***********");
            System.out.println(sartlar);
            System.out.println("***********");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.YurtDisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("Yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.SiyasiYasakKontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("Vize kontrol ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.VizeDurumuKontrol();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("İşlemler tamam sg hadi");
            break;
            
        }
        
    }

    public Main() {
    }
    
}
