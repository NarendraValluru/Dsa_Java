import java.util.Scanner;
public class ArthmeticOperations {
    //methods
    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
    }

    public static int mul(int a,int b){
        return a*b;
    }

    public static double div(int a, int b){
        if(b==0){
            return 0;
        }
        
        return a/b;  
    }

    public static double mod(int a, int b){
        if(b==0) return 0;
        return a%b;
    }
    // methods end

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter a");
            int a=sc.nextInt();
            System.out.println("enter b");
            int b=sc.nextInt();
            System.out.println("1: Add\n2: Sub\n3: Mul\n4: Div\n5: Mod");
            int c=sc.nextInt();
            if(c<6){
                while (c<6) {
                switch (c) {
                    case 1:
                            System.out.println(add(a,b));
                            break;

                    case 2: System.out.println(sub(a,b));
                            break;
                    case 3:
                            System.out.println(mul(a,b));
                            break;
                    case 4: System.out.println(div(a,b));
                            break;

                    case 5: System.out.println(mod(a,b));
                            break;
                
                    default:  System.out.println("invalid");
                    
                            
                }
                
            }
        

        }
            
       
    }
       
}
