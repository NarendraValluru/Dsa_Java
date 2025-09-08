public class IsArraySorted {
    public boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                
            }
            //return true;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,5,7,9,10};
        IsArraySorted is=new IsArraySorted();
        System.out.println(is.isSorted(arr));
    }
}
