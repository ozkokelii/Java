
public class Yonetici extends Calisan{
	
	private int sorumlu_kisi;
	
	public Yonetici(String ad, String soyad, int id, int sorumlu_kisi) {
		super(ad, soyad, id);
		this.sorumlu_kisi = sorumlu_kisi;
	}
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Sorumlu olduðu kiþi sayýsý : " + sorumlu_kisi);
		
		
	}
	
	public void zamYap(int zamMiktari) {
		
		System.out.println(getAd() + " çalýþanlara " + zamMiktari + "kadar zam yapýyor" );
	}

	

}

