
public class Yonetici extends Calisan{
	
	private int sorumlu_kisi;
	
	public Yonetici(String ad, String soyad, int id, int sorumlu_kisi) {
		super(ad, soyad, id);
		this.sorumlu_kisi = sorumlu_kisi;
	}
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Sorumlu oldu�u ki�i say�s� : " + sorumlu_kisi);
		
		
	}
	
	public void zamYap(int zamMiktari) {
		
		System.out.println(getAd() + " �al��anlara " + zamMiktari + "kadar zam yap�yor" );
	}

	

}

