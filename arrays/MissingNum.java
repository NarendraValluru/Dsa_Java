public class MissingNum {
    public static int miss(int[] arr){
       int n=arr[arr.length-1];
       int actualSum=(n*(n+1))/2;
       int sum=0;
       for(int i:arr){
        sum+=i;
       }
       return actualSum-sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7};
        System.out.print(miss(arr));
    }
}
