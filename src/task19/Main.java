package task19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int u = sc.nextInt();
		System.out.println(y % u);
		System.out.println(u % y);
		sc.close();
	}

}
