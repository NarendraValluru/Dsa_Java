import java.util.*;
class incometax
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		if(money>=1200000)
		{
			System.out.println("Pay tax");
		}
		else
		{
			System.out.println("No need to pay tax");
		}
	}
}