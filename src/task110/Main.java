package task110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		int height = sc.nextInt();
		System.out.println("S = (side*height)/2 = " + (side * height) / 2);
		sc.close();
	}

}
