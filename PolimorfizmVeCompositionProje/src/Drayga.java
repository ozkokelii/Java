
public class Drayga  extends Beyblade{
	
	private String kutsalCanavar;
	
	public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalCanavar +  " � ortaya ��k�yor..." );
		System.out.println(getBeybladeci() + " �n sald�r�s� : Kaplan Pen�esi...");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
	}
		

	

}
