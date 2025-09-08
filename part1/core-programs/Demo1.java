import java.util.Scanner;
class Demo1{
	// static boolean isPrime(int n){
	// 	if(n<=1){
	// 		return false;
	// 	}
	// 	else{
	// 		for(int i=2;i<=Math.sqrt(n);i++){
	// 			if(n%i==0){
	// 				return false;
	// 			}
	// 		}
	// 		return true;
	// 	}
	// }
	public static void main(String args[]){
		
		// Scanner sc=new Scanner(System.in);
		// for(char i='A';i<='Z';i++){
		// 	System.out.print(i+" ");
		// }
		// System.out.println("\n");
		// char i='A';
		// while(i<='Z'){
		// 	System.out.print(i+" ");
		// 	i++;
		// }

		// int start=sc.nextInt();
		// System.out.print("enter range:");
		// int range=sc.nextInt();
		// for(int i=start;i<=range;i++){
		// 	if(isPrime(i)){
		// 		System.out.println(i);
		// 	}	
		// }
		// int i=start;
		// while (i<=range) {
		// 	System.out.print(i+" ");
		// 	i++;	
		// }
		// do{
		// 	System.out.print(i+" ");
		// 	i++;
		// }
		// while(i<=range);
	

		//even number in range
		// int start=sc.nextInt();
		// int end=sc.nextInt();
		for(int i=1;i<=20;i++){
			// System.out.print(i%2!=0? break:i);
			if(i%2!=0) continue;
			System.out.print(i+" ");
			

		}

	}

}
		