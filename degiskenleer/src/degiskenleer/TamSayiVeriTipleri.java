package degiskenleer;

public class TamSayiVeriTipleri {
	public static void main(String[]args) {
		// de�er almadaki b�y�kl�k s�ralamalar� �u �ekilde 
		//byte --> short --> int --> long
		byte a = 4;
		System.out.println("byte max de�eri : "+ Byte.MAX_VALUE);
		System.out.println("byte min de�eri : "+ Byte.MIN_VALUE);
		short b = 2;
		System.out.println("short max de�eri : "+ Short.MAX_VALUE);
		System.out.println("short max de�eri : "+ Short.MIN_VALUE);
		int c = 8;
		System.out.println("integer max de�eri : " + Integer.MAX_VALUE);
		System.out.println("integer min de�eri : "+ Integer.MIN_VALUE);
		long toplam = a + b + c;
		System.out.println("long max de�eri : "+ Long.MAX_VALUE);
		System.out.println("long max de�eri : "+ Long.MIN_VALUE);
		System.out.println("kar���k toplam : "+ toplam );
		
	}

}
