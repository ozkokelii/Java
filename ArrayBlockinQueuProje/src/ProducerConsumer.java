
import com.sun.jdi.Value;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
        
        Random random = new Random();
        
        BlockingQueue<Integer> queu = new ArrayBlockingQueue<Integer>(10);
        
    public void produce(){
            
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    
                    Integer value = random.nextInt(100);
                    
                    queu.put(value);
                
                    System.out.println("Produce üretiliyor : " + value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    public void consume(){
        
        while (true) {            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Integer value = queu.take();
                
                System.out.println("Consumer tüketiyor : " + value);
                
                System.out.println("Queue size : " + queu.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
}
