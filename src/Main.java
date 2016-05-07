import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 задача
		Scanner sc=new Scanner(System.in);
		System.out.print("Въведи дължина (a) : ");
		float a=sc.nextFloat();
		System.out.print("Въведи ширина (b) : ");
		float b=sc.nextFloat();
		System.out.println("S = a*b = "+(a*b));
		// 2 задача
		int c=5;
		int d=8;
		System.out.println("c = "+c+" d ="+d);
		int f=c;
		c=d;
		d=f;
		System.out.println("c = "+c+" d ="+d);
		// 3 задача
		String firstName=sc.nextLine();		
		String lastName=sc.nextLine();
		char sex=sc.next().charAt(0);
		short years=sc.nextShort();		
		long egn=sc.nextLong();
		long number=sc.nextLong();
		System.out.println((firstName+" "+lastName)+" на "
		+years+" години. | пол: "+sex+" | ЕГН : "+egn+
		" | Телефонен номер: "+number);
		// 4 задача
		String book="Harry Potter";
		System.out.print("I will read the '"+book+"' book collection.");
		// 5 задача
		int q=sc.nextInt();
		int w=sc.nextInt();
		int e=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(" Сумата на числата е : "+(q+w+e+r));
		// 6 задача
		System.out.print("Въведи радиус : ");
		float radius=sc.nextFloat();
		System.out.println("P = "+(2*Math.PI*radius));
		System.out.println("S = "+(Math.PI*radius*radius));
		// 7 задача
		boolean division=true;
		int numberR=sc.nextInt();
		if(numberR%5==0 && numberR%7==0) division=true;
		else division=false;
		System.out.println(division);
		// 8 задача
		int oddOReven=sc.nextInt();
		if(oddOReven%2==0) System.out.println("Even");
		else System.out.print("Odd");
		// 9 задача
		int y=sc.nextInt();
		int u=sc.nextInt();
		System.out.println(y%u);
		System.out.println(u%y);
		// задача 10
		int side=sc.nextInt();
		int height=sc.nextInt();
		System.out.println("S = (side*height)/2 = "+(side*height)/2);
		
	}

}
