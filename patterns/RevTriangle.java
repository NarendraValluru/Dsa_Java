public class RevTriangle {
    public static void main(String[] args) {
        int spc=0,str=9;
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
            spc++;str-=2;
            System.out.println();
        }
    }
}
