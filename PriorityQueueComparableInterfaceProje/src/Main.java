
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        
        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
        
        acilServis.offer(new Hasta("Ömer", "Baş Ağrısı"));
        acilServis.offer(new Hasta("Kazım", "Yanık"));
        acilServis.offer(new Hasta("Keirm", "Apandist"));
        acilServis.offer(new Hasta("Ali", "Apandist"));
        acilServis.offer(new Hasta("Veli", "Yanık"));
        acilServis.offer(new Hasta("Merve", "Yanık"));
        
        int i = 1;
        
        while (acilServis.isEmpty() != true) {            
            System.out.println("*----------------*");
            System.out.println(i + ".sırada");
            System.out.println(acilServis.poll());
            System.out.println("*-----------------*");
            i++;
        }
    }
    
}
