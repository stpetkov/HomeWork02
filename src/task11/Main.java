package task11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lenght (a) : ");
		float a = sc.nextFloat();
		System.out.print("Latitude (b) : ");
		float b = sc.nextFloat();
		System.out.println("S = a*b = " + (a * b));
		sc.close();
	}

}
