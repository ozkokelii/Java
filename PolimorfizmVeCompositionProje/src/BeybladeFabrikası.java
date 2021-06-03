
public class BeybladeFabrikasý {
	
	public Beyblade beybladeUret(String beyblade_turu) {
		
		if(beyblade_turu.equals("Dragon")) {
			return new Dragon("Takao" , 800, 300, "Mavi Ejderya", "Kutsal canavarla konuþma");
			
		}
		else if(beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai", 600, 200, "Kýrmýzý Anka kuþu");
			
		}
		else if(beyblade_turu.equals("Drayga")) {
			return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
		}
		else if(beyblade_turu.equals("Draciel")) {
			return new Draciel("Max", 400, 1000, "Kara Kamplumbaða");
		}
		else {
			return null;
		}
		
	}

}
