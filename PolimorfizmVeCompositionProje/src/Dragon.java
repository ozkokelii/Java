
public class Dragon extends Beyblade{
	
	private String kutsalCanavar;
	private String gizliYetenek;

	public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusHizi, saldiriGucu);
		// TODO Auto-generated constructor stub
		this.gizliYetenek = gizliYetenek;
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalCanavar +  " ý ortaya çýkýyor..." );
		System.out.println(getBeybladeci() + " ýn saldýrýsý : Hayalet Saldýrýsý...");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();

		System.out.println("Kutsal Canavar Adý : " + kutsalCanavar);
		System.out.println("Gizli Yeteneði : " + gizliYetenek);
	}
	

}
