
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static String harfnotuHesapla(String isim, int vize1, int vize2, int finalnot){
        
        String cikti = "";
        
        double toplamNot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if(toplamNot >= 90){
            cikti = isim + " bu dersten AA aldı...";
        }else if(toplamNot >= 85){
            cikti = isim + " bu dersten BA aldı...";
        }else if(toplamNot >= 80){
            cikti = isim + " bu dersten BB aldı...";
        }else if(toplamNot >= 75){
            cikti = isim + " bu dersten BC aldı...";
        }else if(toplamNot >= 70){
            cikti = isim + " bu dersten CC aldı...";
        }else if(toplamNot >= 65){
            cikti = isim + " bu dersten DC aldı...";
        }else if(toplamNot >= 60){
            cikti = isim + " bu dersten DD aldı...";
        }else if(toplamNot >= 55){
            cikti = isim + " bu dersten FD aldı...";
        }else{
            cikti = isim + " bu dersten FF aldı...";
        }
        return cikti;
}
    
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
                FileWriter writer = new FileWriter("harfnotları.txt")){
            
            while(scanner.hasNextLine()){
                String ogrenciBilgileri = scanner.nextLine();
                
                String [] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnot = Integer.valueOf(ogrenciArray[3]);
                
                String cikti = harfnotuHesapla(ogrenciArray[0], vize1, vize2, finalnot);
                writer.write(cikti + "\n");
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
