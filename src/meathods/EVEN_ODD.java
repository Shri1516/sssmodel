package meathods;

import java.util.Scanner;

public class EVEN_ODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter number");
int num1=scan.nextInt();
findevenodd(num1);
	
	}

	private static void findevenodd(int num1) {
		// TODO Auto-generated method stub
	if(num1%2==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
	}

}
