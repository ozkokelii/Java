
public class Test {
	public static void main(String[] args) {
		
		Araba araba1 = new Araba();
		
	
		/*araba1.renk = "Kýrmýzý";
		araba1.kapilar = 4;
		araba1.tekerlekler = 4;
		araba1.motor = "16V";
		araba1.model = "Honda";
		
		System.out.println(araba1.model);
		*/
		
		araba1.setModel("Honda");
		
		System.out.println("Arabanýn modeli = "+ araba1.getModel());
		
		araba1.setKapilar(-4);
		
		
	}

}
