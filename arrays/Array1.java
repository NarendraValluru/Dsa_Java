
import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("sum " + sum);
        sc.close();
    }
}

// program to print the elements present in an array without using the loop
class Array2 {
    public static void main(String[] args) {
        int[] arr = { 2, 76, 28, 29, 287 };
        System.out.println(Arrays.toString(arr));
    }
}

// print the even elements present in an array
class Even {
    public static void main(String[] args) {
        int[] a = { 2, 93, 92, 1, 95, 76 };
        // int[] even=new int[a.length];
        // for(int i=0;i<a.length;i++){
        // even[i]= a[i]%2==0 ? a[i] : " ";
        // }
        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
    }
}

// program to print the prime num present in an array
class Prime {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1,3,7,5,9,10,13,11};
        //Prime p=new Prime();
        // int n=0;
        for(int i=0;i<arr.length;i++){
            // n=arr[i];
            //System.out.print(isPrime(arr[i]) ? arr[i]+" ":" " );
            if(Prime.isPrime(arr[i])) System.out.print(arr[i]+" ");
        }
       
    }
}
 
// linear search

class LinearSearch{
    static int linearSearch(int target,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("eneter target");
        int target=sc.nextInt();
        System.out.print("found at "+linearSearch(target, arr));
        sc.close();
    }
}

// binary search : 
/* 1)consider the sorted array
2) find out the middle element and compare it with the target element
    i) if both are same search will end 
    ii) if both are not same compare the target ele and current element 
3) if the current ele is less the target traverse through the left side of the array 
    else traverse through the right side of the array.
4) repeat the second and 3rd step until the target is found or all the elements are reached
*/

class BinarySearch{
    public static int binarySearch(int key,int[] arr){
        int mid=arr.length/2; 
        if(arr[mid]==key) return mid+1;
        else{
            if(key<arr[mid]){    // left side
                for(int i=0;i<mid;i++){
                    if(key==arr[i]) return i+1;
                }
            }
            else{      // right side
                for(int i=mid;i<arr.length;i++){
                    if(key==arr[i]) return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int key=sc.nextInt();
        Arrays.sort(arr);
        // Arrays.toString(arr);
        int res=binarySearch(key, arr);
        System.out.println(res!=-1 ? "found at "+res : "not found");
        sc.close();
    }
}

// print the smallest element present in an arry

class Smallest{
    public static int smallest(int[] arr){
        int small=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[small]){
                small=i;
            } 
        }
        return arr[small];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.print("smallest :"+smallest(arr));
        
    }
}

class Largest{
    public static int largest(int[] arr){
        int large=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[large]) large=i;
        }
        return arr[large];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("largest :"+largest(arr));
        sc.close();
    }
}

// to swap the largest element and smallest element present in an array
class Swap{
    public static int largest(int[] arr){
        int large=0;

    }
    public static int smallest(int[] arr){

    }
    public static void main(String[] args) {
        
    }
}

