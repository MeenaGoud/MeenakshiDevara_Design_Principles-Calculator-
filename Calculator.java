package examples;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator:");
		System.out.println("options:");
		System.out.println("\n 1.Addition:");
		System.out.println("2.Subtraction:");
		System.out.println("3.Division:");
		System.out.println("4.Multiplication:");
		System.out.println("enter your choice?:");
		int ch=sc.nextInt();
		
		System.out.println();
		if(ch==1)
		{
			addition();
		}
		else if(ch==2)
		{
			subtraction();
		}
		else if(ch==3)
		{
			division();
			
		}
		else if(ch==4)
		{
			multiplication();
		}
		
		System.out.println();
		sc.close();

	}
	
	public static void addition()
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Addition");
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		System.out.println("sum of"+ a +" and "+ b +" is "+(a+b));
	}
	
	public static void subtraction()
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("subtraction");
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		System.out.println("subtraction of"+ a +" and "+ b +" is "+(a-b));
	}
	public static void multiplication()
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("multiplication");
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		System.out.println("multiplication of"+ a +"and"+ b +" is "+(a*b));
	}
	
	public static void division()
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("division");
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		System.out.println("division of"+ a +"and"+ b +" is "+(a/b));
	}
	
	

}
