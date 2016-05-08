import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 task
		Scanner sc=new Scanner(System.in);
		System.out.print("Lenght (a) : ");
		float a=sc.nextFloat();
		System.out.print("Latitude (b) : ");
		float b=sc.nextFloat();
		System.out.println("S = a*b = "+(a*b));
		// 2 task
		int c=5;
		int d=8;
		System.out.println("c = "+c+" d ="+d);
		int f=c;
		c=d;
		d=f;
		System.out.println("c = "+c+" d ="+d);
		// 3 task
		String firstName=sc.nextLine();		
		String lastName=sc.nextLine();
		char sex=sc.next().charAt(0);
		short years=sc.nextShort();		
		long egn=sc.nextLong();
		long number=sc.nextLong();
		System.out.println((firstName+" "+lastName)+" is "
		+years+" years old. | sex: "+sex+" | EGN : "+egn+
		" | Phone number: "+number);
		// 4 task
		String book="Harry Potter";
		System.out.print("I will read the '"+book+"' book collection.");
		// 5 task
		int q=sc.nextInt();
		int w=sc.nextInt();
		int e=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(" The sum of the numbers is : "+(q+w+e+r));
		// 6 task
		System.out.print("Enter radius : ");
		float radius=sc.nextFloat();
		System.out.println("P = "+(2*Math.PI*radius));
		System.out.println("S = "+(Math.PI*radius*radius));
		// 7 task
		int numberR=sc.nextInt();
		boolean division=(numberR%5==0 && numberR%7==0);
		System.out.println(division);
		// 8 task
		int oddOReven=sc.nextInt();
		if(oddOReven%2==0) System.out.println("Even");
		else System.out.print("Odd");
		// 9 task
		int y=sc.nextInt();
		int u=sc.nextInt();
		System.out.println(y%u);
		System.out.println(u%y);
		// 10 task
		int side=sc.nextInt();
		int height=sc.nextInt();
		System.out.println("S = (side*height)/2 = "+(side*height)/2);
		
	}

}
