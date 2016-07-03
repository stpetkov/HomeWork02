package task16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		float radius = sc.nextFloat();
		System.out.println("P = " + (2 * Math.PI * radius));
		System.out.println("S = " + (Math.PI * radius * radius));
		sc.close();
	}

}
