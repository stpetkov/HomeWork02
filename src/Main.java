import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 ������
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ������� (a) : ");
		float a=sc.nextFloat();
		System.out.print("������ ������ (b) : ");
		float b=sc.nextFloat();
		System.out.println("S = a*b = "+(a*b));
		// 2 ������
		int c=5;
		int d=8;
		System.out.println("c = "+c+" d ="+d);
		int f=c;
		c=d;
		d=f;
		System.out.println("c = "+c+" d ="+d);
		// 3 ������
		String firstName=sc.nextLine();		
		String lastName=sc.nextLine();
		char sex=sc.next().charAt(0);
		short years=sc.nextShort();		
		long egn=sc.nextLong();
		long number=sc.nextLong();
		System.out.println((firstName+" "+lastName)+" �� "
		+years+" ������. | ���: "+sex+" | ��� : "+egn+
		" | ��������� �����: "+number);
		// 4 ������
		String book="Harry Potter";
		System.out.print("I will read the '"+book+"' book collection.");
		// 5 ������
		int q=sc.nextInt();
		int w=sc.nextInt();
		int e=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(" ������ �� ������� � : "+(q+w+e+r));
		// 6 ������
		System.out.print("������ ������ : ");
		float radius=sc.nextFloat();
		System.out.println("P = "+(2*Math.PI*radius));
		System.out.println("S = "+(Math.PI*radius*radius));
		// 7 ������
		boolean division=true;
		int numberR=sc.nextInt();
		if(numberR%5==0 && numberR%7==0) division=true;
		else division=false;
		System.out.println(division);
		// 8 ������
		int oddOReven=sc.nextInt();
		if(oddOReven%2==0) System.out.println("Even");
		else System.out.print("Odd");
		// 9 ������
		int y=sc.nextInt();
		int u=sc.nextInt();
		System.out.println(y%u);
		System.out.println(u%y);
		// ������ 10
		int side=sc.nextInt();
		int height=sc.nextInt();
		System.out.println("S = (side*height)/2 = "+(side*height)/2);
		
	}

}
