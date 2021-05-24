package degiskenleer;

public class TamSayiVeriTipleri {
	public static void main(String[]args) {
		// deðer almadaki büyüklük sýralamalarý þu þekilde 
		//byte --> short --> int --> long
		byte a = 4;
		System.out.println("byte max deðeri : "+ Byte.MAX_VALUE);
		System.out.println("byte min deðeri : "+ Byte.MIN_VALUE);
		short b = 2;
		System.out.println("short max deðeri : "+ Short.MAX_VALUE);
		System.out.println("short max deðeri : "+ Short.MIN_VALUE);
		int c = 8;
		System.out.println("integer max deðeri : " + Integer.MAX_VALUE);
		System.out.println("integer min deðeri : "+ Integer.MIN_VALUE);
		long toplam = a + b + c;
		System.out.println("long max deðeri : "+ Long.MAX_VALUE);
		System.out.println("long max deðeri : "+ Long.MIN_VALUE);
		System.out.println("karýþýk toplam : "+ toplam );
		
	}

}
