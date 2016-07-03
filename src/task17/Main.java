package task17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberR = sc.nextInt();
		boolean division = (numberR % 5 == 0 && numberR % 7 == 0);
		System.out.println(division);
		sc.close();
	}

}
