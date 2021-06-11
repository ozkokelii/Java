
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        FileOutputStream fos = null;
        
        try {  
        fos = new FileOutputStream("dosya.txt",true); //true eklendiği zaman eskisinden bir şey değişmez eski olanların yanına ekler
        
        //byte [] array = {11,22,33,44,55,66,77,88,99};
        //fos.write(array);
        
        String isim = "     Omer ozkokeli ";
        
        byte [] isim_array  = isim.getBytes();
        
        fos.write(isim_array);
        
        } catch (FileNotFoundException e) {
            System.out.println("nouyorasdfa");
        } catch (IOException ex) {
            System.out.println("Dosya kapatılırken falan fıstık oldu...");
        }
        
        finally{
            
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken falan fıstık oldu...");
            }
        }
    }
    
    
}
