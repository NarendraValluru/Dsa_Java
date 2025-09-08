import java.util.*;
class Vowelornot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' &&ch<='Z'))
		{
		switch(ch)
		{
			case "A":
				
			case "E":
				
			case "I":
				
			case "O":
				
			case "U":
			
			case "a":
				
			case "e":
				
			case "i":
				
			case "o":
				
			case "u":System.out.println("Vowel");
				
			default:
				System.out.println("Consonant");
		}
		}
		else
			{
				System.out.println("INvalid");
			}
				
	}
}