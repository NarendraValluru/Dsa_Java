public class Quad1 {
    
    public static void main(String[] args) {
        int str=5, spc=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=str;k++){
                System.out.print("*");
            }
            System.out.println();
            str--;spc++;
        }
    }
}

