import java.util.ArrayList;
public class Prime {
    static ArrayList<Integer> isPrime(int[] arr){
        // int[] temp=new int[arr.length];
        ArrayList<Integer> list=new ArrayList<>();
        int c=0,num=0;
        for(int i=0;i<arr.length;i++){
            num=arr[i];
            if(num==1) list.add(num);
            else if(num>1){
                for(int j=2;j<num;j++){
                    if(num%j==0) c++;
                }
                if(c<=2) list.add(num);
            } 
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,6,5,7};
        ArrayList<Integer> list=new ArrayList<>();
        isPrime(arr);
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
        
    }
}
