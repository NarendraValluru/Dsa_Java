public class Triangle {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=9;j++){
        //         System.out.print((j<=5 && i+j>=6)||(j>5 && j-i<=4) ? "*" :" ") ;
        //     }
            
        //     System.out.println();
        // }

        int spc=4, str=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=str;k++){
                System.out.print("*");
            }
            for(int l=1;l<=spc;l++){
                System.out.print(" ");
            }
            System.out.println();
            str+=2; spc--;
        }
    }
}
