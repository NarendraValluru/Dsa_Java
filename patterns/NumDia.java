public class NumDia {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((i==j || i+j==6 ) ? i : " ");
            }
            System.out.println();
        }
    }
}
