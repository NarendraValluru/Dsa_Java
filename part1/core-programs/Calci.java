import java.util.*;
class Calci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		String op=sc.nextLine();
		
		switch(op)
		{
			case "+":
				System.out.println(num1+num2);
				break;
			case "-":
				System.out.println(num1-num2);
				break;
			case "*":
				System.out.println(num1*num2);
				break;
			case "/":
				System.out.println(num1/num2);
				break;
			case "%":
				System.out.println(num1%num2);
				break;
			default:
				System.out.println("Enter valid one");
		}
				
	}
}