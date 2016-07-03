package task12;

public class Main {

	public static void main(String[] args) {
		int c = 5;
		int d = 8;
		System.out.println("c = " + c + " d =" + d);
		int f = c;
		c = d;
		d = f;
		System.out.println("c = " + c + " d =" + d);
	}

}
