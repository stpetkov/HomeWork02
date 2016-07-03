package task13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		char sex = sc.next().charAt(0);
		short years = sc.nextShort();
		long egn = sc.nextLong();
		long number = sc.nextLong();
		System.out.println((firstName + " " + lastName) + " is " + years + " years old. | sex: " + sex + " | EGN : "
				+ egn + " | Phone number: " + number);
		sc.close();

	}

}
