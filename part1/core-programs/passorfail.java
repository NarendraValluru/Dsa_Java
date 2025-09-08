import java.util.*;
class passorfail
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks>=95 && marks<=100)
		{
			System.out.println("A+");
		}
		else if( marks>=85 && marks<=94)
		{
			System.out.println("A");
		}
		else if(marks>=75 && marks<=84)
		{
			System.out.println("B+");
		}
		else if(marks>=72 && marks<=74)
		{
			System.out.println("B");
		}
		else if(marks>=50 && marks<=69)
		{
			System.out.println("C");
		}
		else if(marks>=35 && marks<=49)
		{
			System.out.println("D");
		}
		else if(marks>=0 && marks<=34)
		{
			System.out.println("F");
		}
		else 
		{
			System.out.println("Invalid");
		}
	}
}