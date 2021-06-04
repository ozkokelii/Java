
public class Daire extends Sekil{
    
    private int r;

    public Daire(String isim,  int r) {
        super(isim);
        this.r = r;
    }

    @Override
    public void alanHesapla() {
        
        System.out.println(getIsim() + "in alanı " + (Math.PI * r*r));
    }
    
    
    
}
