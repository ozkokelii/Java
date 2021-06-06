
import java.util.Scanner;


public class Vec {
    
    private int i;
    private int j;
    private int k;
    private String isim;
    
    
    public Vec(String isim){
        this.isim = isim;
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println(isim + "Vektörün i j ve k dğerlerini girin pls...");
        this.i = scanner.nextInt();
        System.out.println("j değeri");
        this.j = scanner.nextInt();
        System.out.println("k değeri");
        this.k = scanner.nextInt();
        
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
