import java.util.Scanner;
public class ProdOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt(); 
        int product = 1;
        for (int i = start; i <= end; i++) {
            product *= i;
        }
        System.out.println(product);
        sc.close();
    }
}
