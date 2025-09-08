public class MaxDiff {
    static int maxDiff(int[] a){
        int max=Integer.MIN_VALUE,diff=Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    diff=a[j]-a[i];
                    if(max<diff) max=diff;
                }
                else{
                    diff=a[i]-a[j];
                    if(max<diff) max=diff;
                }
                
            } 
        }
        return max;
    }
    public static void main(String[] args){
        int[] a={3,2,1};
        System.out.print(maxDiff(a));
    }
}

// strings are the objects in java which holds the sequence or collection of characters
// java.lang