
public class main {
    public static void main(String[] args) {
        // Object Oriented(Nesne Y�nelimli ) ATM Program�
        
        // Login Class'� Kullan�c� Giri�ini Kontrol Edecek.
        
        // Hesap Class'� Hesap ��lemlerini Yapacak.
        
        // ATM ise atmmizi �al��t�racak.
        
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Mustafa Murat","12345", 2000);
        
        atm.calis(hesap);
        System.out.println("Programdan ��k�l�yor...");
        
        
        
        
    }
 
}
