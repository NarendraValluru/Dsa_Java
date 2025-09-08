public class MaxConc1s {
    public static int max1S(int[] arr){
        int cnt=0,max=0;
        for(int i:arr){
            if(i!=0){
                cnt++;
                if(max<cnt)
                max=cnt;
            } 
            else cnt=0;
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={1,1,0,1,1,1,1,0,1,1,1};
        System.out.print(max1S(arr));
    }
}
