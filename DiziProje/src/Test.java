
import java.util.Scanner;


public class Test {
    
    private static Kart[][] kartlar = new Kart[4][4];
    
    
    public static void main(String[] args) {
        
        kartlar[0][0] = new Kart('E');
        kartlar[0][0] = new Kart('A');
        kartlar[0][0] = new Kart('B');
        kartlar[0][0] = new Kart('G');
        kartlar[0][0] = new Kart('A');
        kartlar[0][0] = new Kart('D');
        kartlar[0][0] = new Kart('H');
        kartlar[0][0] = new Kart('F');
        kartlar[0][0] = new Kart('C');
        kartlar[0][0] = new Kart('D');
        kartlar[0][0] = new Kart('H');
        kartlar[0][0] = new Kart('E');
        kartlar[0][0] = new Kart('G');
        kartlar[0][0] = new Kart('B');
        kartlar[0][0] = new Kart('C');
        
        //oyunTahtasi();
        while(oyunBittiMi() == false){
            oyunTahtasi();
            tahminEt();
            
        }
        
    }
    public static void tahminEt(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Birinci tahmin(i ve j değerlerini bir boşlukla girin ) : ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        
        System.out.println("İkinci tahmin(i ve j değerlerini bir boşlukla girin ) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            kartlar[i2][j2].setTahmin(true);
        }
        else{
            kartlar[i1][j1].setTahmin(false);
        }
    }
    
    public static boolean oyunBittiMi(){
        for(int i =0; i<4;i++){
            for(int j = 0; j<4; j++){
                if(kartlar[i][j].isTahmin() == false){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    public static void oyunTahtasi(){
        
        for(int i =0;i<4;i++){
            System.out.println("________________________");
            for(int j =0;j<4;j++){
                if(kartlar[i][j].isTahmin() == true){
                    System.out.println("|" + kartlar[i][j].getDeger() + "|");
                    
                }else{
                    System.out.println("| |");
                }
                System.out.println("________________________");
            }
        }
        
    }
    
    
}
