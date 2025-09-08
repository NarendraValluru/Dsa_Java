import java.util.Scanner;
public class BasicAtm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int p=1234;
        int balance=1000;
        System.out.println("enter pin:");
        int pin=sc.nextInt();
        if(p==pin)
        {
            System.out.println("choose the method:");
            System.out.println("1:deposit\n2:withdraw\n3:balance\n4:change pin");
            int option=sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter the amount to deposit:");
                    int deposit=sc.nextInt();
                    if(deposit<0){
                        System.out.println("invalid amount");
                        break;
                    }else{
                        balance+=deposit;
                        System.out.println("current balance= "+balance);
                        break;
                    }
                    
            case 2:
                    System.out.println("enter amount to withdraw:");
                    int withdraw=sc.nextInt();
                    if(withdraw<=0 && withdraw<balance){
                        System.out.println("invalid");
                        break;
                    }else{
                        balance-=withdraw;
                        System.out.println("current balance= "+balance);
                        break;
                    }
                   

            case 3:
                    System.out.println("Balance amount is: " +balance);
                    break;
                    
            case 4:
                    System.out.println("enter you new pin:");
                    int new_pin=sc.nextInt();
                    if(new_pin>=1000 && new_pin<=9999){
                         for(int i=1;i<=3;i++){
                            System.out.println("Re enter new pin:");
                            int repin=sc.nextInt();
                            if(new_pin==repin){
                                p=new_pin;
                                System.out.println("changed successfully:"+p);
                                break;
                            }
                            else{
                                System.out.println("invalid pin ");
                                break;
                            }

                        }
                    }
                    break;

            default:
                    System.out.println("invalid method");
            }
        }
        else{
            System.out.println("Invalid pin number");
        }

    }
}
