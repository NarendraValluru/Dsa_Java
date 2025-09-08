import java.util.ArrayList;
public class Intersection {
    static ArrayList<Integer> intersection(int[] a,int[] b){
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            // else if(a[i]!=b[j]){
            //     i++;j++;
            // }
            else{
                // if(a[i]==b[j]){
                    list.add(a[i]);
                    i++;j++;
                // }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] a={1,2,2,3,5,6,7};
        int[] b={1,2,3,5,6,6,7};
        System.out.println(intersection(a,b));
    }
}
