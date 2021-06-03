
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Yatırdığını harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Herhangi bir siyasi yasağınız var mı ");
        String cevap = scanner.nextLine();
        
        if(cevap.equals("evet")){
            this.siyasiYasak = true;
        }else{
            this.siyasiYasak = false;
        }
        
        System.out.println("Vizeniz bulunuyor mu ");
        
        String cevap2 = scanner.nextLine();
        
        if(cevap2.equals("evet")){
            this.vizeDurumu = true;
        }else{
            this.vizeDurumu = false;
        }
        
        
    }

    @Override
    public boolean YurtDisiHarciKontrol() {
        
        if(this.harc<15){
            System.out.println("Harcı tam yatır");
            return false;
        }else{
            System.out.println("Harç tamam");
            return true;
        }
        
    }

    @Override
    public boolean SiyasiYasakKontrol() {
        
        if(this.siyasiYasak == true){
            System.out.println("Yasak var çıkaman");
            return false;
        }else{
            System.out.println("Yasak yok çıkabilirsin");
            return true;
        }
        
    }

    @Override
    public boolean VizeDurumuKontrol() {
        
        if(this.vizeDurumu == true){
            System.out.println("Vizen yok çıkaman ");
            return true;
        }else{
            System.out.println("Vizen var çıkabilirsin");
            return false;
        }
    }
    
}
