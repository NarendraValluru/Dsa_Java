public class Tri {
    public static void main(String[] args) {
        int str=1, spc=4;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=str;k++){
                System.out.print("*");
            }
            System.out.println();
            str++;spc--;
        }
    }

}
