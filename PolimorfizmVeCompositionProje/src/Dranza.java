
public class Dranza extends Beyblade {
	

	private String kutsalCanavar;
	
	public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalCanavar +  " � ortaya ��k�yor..." );
		System.out.println(getBeybladeci() + " �n sald�r�s� : Alev K�l�c�...");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		
		System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
		
		
	}
	
	
	
	

}
