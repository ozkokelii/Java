
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
		System.out.println(getBeybladeci() + " " + kutsalCanavar +  " � ortaya ��k�yor..." );
		System.out.println(getBeybladeci() + " �n sald�r�s� : Hayalet Sald�r�s�...");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();

		System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
		System.out.println("Gizli Yetene�i : " + gizliYetenek);
	}
	

}
