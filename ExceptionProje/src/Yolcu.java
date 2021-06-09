
import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor...");
    }
}

class VizeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Vizeni bulunmamaktadır...");
    }
}

class HarcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Harcınız yatırılmamış...");
    }
    
    
}

public class Yolcu {
    
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

    
    public void YurtDisiHarciKontrol() throws HarcException {
        
        if(this.harc<15){
            
            throw new HarcException();
            
        }else{
            System.out.println("Harç tamam");
        }
        
    }

    
    public void SiyasiYasakKontrol() throws SiyasiException {
        
        if(this.siyasiYasak == true){
            
            throw new SiyasiException();
            
        }else{
            System.out.println("Yasak yok çıkabilirsin");
        }
        
    }

    
    public void VizeDurumuKontrol() throws VizeException {
        
        if(this.vizeDurumu == true){
            
            System.out.println("Vizen var çıkabilirsin");
            
        }else{
            
            throw new VizeException();
        }
    }
    
}
