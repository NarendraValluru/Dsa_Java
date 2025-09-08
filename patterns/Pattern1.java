public class Pattern1 {
    public static void main(String[] args) {
        //displayX();
        displayV() + displayX();;
    }
    static void displayX(){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                System.out.print(i==j || i+j==6  ? "*" :" ");
            }
            System.out.println();
        }
    }
    static void displayV(){
        int a=1,b=9;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                System.out.print(j==a || j==b ?"*":" " );
            }
            System.out.println();
            a++;
            b--;
            
        }
    }
}
