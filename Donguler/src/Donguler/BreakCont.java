package Donguler;

public class BreakCont {
	public static void main(String []args) {
		for(int i = 0; i<10; i++) {
			if(i == 3 || i == 5) {
				continue;
			}
			System.out.println("i = "+ i);
		}
		int x = 0;
		while(x<10) {
			if(x==1||x==4) {
				x++;
				continue;
			}
			System.out.println("x = "+x);
			x++; 	
		}
	}

}
