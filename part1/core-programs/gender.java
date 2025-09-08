import java.util.*;
class gender
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='M')
		{
			System.out.println("male");
		}
		else if( ch=='F')
		{
			System.out.println("female");
		}
		else if(ch=='O')
		{
			System.out.println("others");
		}
		
		else
		{
			System.out.println("Invalid");
		}
		
	}
}