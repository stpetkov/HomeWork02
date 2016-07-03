package task18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oddOReven = sc.nextInt();
		if (oddOReven % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.print("Odd");
		}
		sc.close();
	}

}
