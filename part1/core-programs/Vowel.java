import java.util.*;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char alpha=sc.next().charAt(0);
		if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
		{
			System.out.println("Vowel");
		}
		else if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}