import java.util.*;
class Marks
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=35)
		{
			System.out.println("Passed in the exam");
		}
		else
		{
			System.out.println("Failed in the exam");
		}
	}
}