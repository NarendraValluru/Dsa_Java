public class NamePattern {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++){
            for(int c=1;c<=24;c++){
                if((c==1 || c==5) || c==r) 
                System.out.print("* ");
                else if(r+c ==11 || (r==3 && c>=9 && c<=12) || c-r==9){
                    System.out.print("* ");
                }
                else if((c==15 || c==19) || (r==2 && c==16) ||(r==3 && c==17) || (r==4 && c==18) ){
                    System.out.print("* ");
                }
                else if((r==1 && c>=20 && c<=24 ) || (r==5 && c>=20 && c<=24 ) || (c==22)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
