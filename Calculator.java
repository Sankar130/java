import java.util.Scanner;

 class Calculator {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("first=");
		int a=scan.nextInt();
		
		System.out.println("second=");
		int b=scan.nextInt();
		
		add(a,b);
		sub(a,b);
		multp(a,b);
		div(a,b);
	 remain(a,b);
		
		scan.close();
		
		}

	public static void add(int a, int b) {
		System.out.println("add="+(a+b));	
	}

	public static void remain(int a, int b) {
		System.out.println("remain="+(a%b));
	}

	public static void div(int a, int b) {
		System.out.println("div="+(a/b));		
	}

	public static void multp(int a, int b) {
		System.out.println("multp="+(a*b));		
	}

	public static void sub(int a, int b) {
		System.out.println("sub="+(a-b));		
	}

	}


