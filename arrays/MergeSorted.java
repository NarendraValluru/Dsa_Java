import java.util.*;
public class MergeSorted {
    public static ArrayList<Integer> merge(int[] a, int[] b){
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;
        ArrayList<Integer> list= new ArrayList<>();
        while(i<n1 && j<n2){
            int val;
            if(a[i]< b[j]){
                val=a[i++];
            }
            else if(a[i]>b[j]){
                val=b[j++];
            }
            else{
                val=a[i];
                i++;j++;

            }
            if(list.isEmpty() || list.get(list.size()-1) !=val){
                list.add(val);
                
            }
        }
        while(i<n1){
            if(list.isEmpty() || list.get(list.size()-1) !=a[i]){
                list.add(a[i]);
            }
            i++;
        }
          while(j<n2){
            if(list.isEmpty() || list.get(list.size()-1) !=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a1={1,1,2,3,5};
        int[] a2={1,2,4,4,5,6};
        ArrayList<Integer> res= merge(a1,a2);
        System.out.println(res);
    }
}
