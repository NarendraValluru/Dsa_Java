import java.util.*;
class Person
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='s'||ch=='S')
		{
			System.out.println("successful");
		}
		else
		{
			System.out.println("not");
		}
	}
}