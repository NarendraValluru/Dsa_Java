import java.util.*;
class Traffic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		switch(s)
		{
			case "Red":
				System.out.println("Stop and wait for few second");
				break;
			case "Yellow":
				System.out.println("Please be ready to move");
				break;
			case "Green":
				System.out.println("Thanks for waiting you can go now");
				break;
			default:
				System.out.println("Enter valid one");
		}
				
	}
}