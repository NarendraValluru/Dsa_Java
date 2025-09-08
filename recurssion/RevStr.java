public class RevStr {
    public static void main(String[] args){
        String s="hello";
        // rev(s);
        // System.out.println();
        rev(s,s.length()-1);
        // System.out.println();
        // System.out.print(rev(s));
    }
    public static void rev(String s,int i){
        if(i==0){
            System.out.print(s.charAt(0));
            return;
        }
        System.out.print(s.charAt(i));
        rev(s,i-1);
    } 

    // public static void rev(String s){
    //     String str="";
    //     for(int i=s.length()-1;i>=0;i--){
    //         str+=s.charAt(i);
    //     }
    //     System.out.print(str);
    // }

    // public static char[] rev(String s){
    //     char[] str=s.toCharArray();
    //     int start=0,end=str.length-1;
    //     while(start<end){
    //         char temp=str[start];
    //         str[start]=str[end];
    //         str[end]=temp;
    //         start++;end--;
    //     }
    //     return str;

    // }

}
