
public class Account {
	
	private String hesapNo;
	private double bakiye;
	private String isim;
	
	private String email;
	
	private String TelefonNo;
	
	public Account(String isim, String email, String TelefonNo) {
		
		this.isim = isim;
		this.email = email;
		this.TelefonNo = TelefonNo;
		
	}
	
	public Account() {
		
		/*this.hesapNo = "Bilgi Yok";
		this.bakiye = 00.0;
		this.isim = "Bilgi Yok";
		this.email = "Bilgi Yok";
		this.TelefonNo = "Bilgi Yok";*/
		
		this("Bilgi Yok",00.0,"Bilgi Yok","Bilgi Yok","Bilgi Yok");
	}
	public Account(String hesapNo, double bakiye, String isim,String email,String TelefonNo) {
		
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.TelefonNo = TelefonNo;
	}
	
	public void paraYatir(double miktar) {
		
		bakiye += miktar;
		
		System.out.println("Yeni Bakiye = " + bakiye);
	}
	
	public void paraCekme(double miktar) {
		
		if(miktar>1500) {
			System.out.println("Bir günde 1500'den fazla para çekemezsin");
		}
		if(bakiye - miktar < 0) {
			System.out.println("Yeterli bakiyeniz yok..." + bakiye);
		}
		else {
			bakiye -= miktar;
			System.out.println("Yeni bakiye = "+ bakiye);
		}
	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonNo() {
		return TelefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		TelefonNo = telefonNo;
	}
}
