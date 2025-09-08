public class PrintJava {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=32;j++){
                if((i==1 && j<=5)||((j==3)) || (i==5 && j<=3)){  // J  r==1 || c==3 || (r==5 && c<=3)
                    System.out.print("*" );
                }

                else if((i==1 && j==10) || (i==2 && (j==9 || j==11)) || (i==3 &&(j<13 && j>=8)) || (i==4 &&(j==7 || j==13)) || (i==5 &&(j==6 || j==14)))  // 6 -->14 A  r+c ==11 || (r==3 && c>=9 && c<=12) || c-r==9
                {
                        System.out.print("*");
                }

                else if((i==1 && (j==15 || j==23)) || (i==2 && (j==16 || j==22)) || (i==3 && (j==17 || j==21)) ||(i==4 &&(j==18 || j==20)) || (i==5 && j==19)) // 15 -> 23   c-r==14 || r+c==24
                {
                    System.out.print("*");
                }

                else if((i==1 && j==28) || (i==2 && (j==27 || j==29)) || (i==3 &&(j<30 && j>=26)) || (i==4 &&(j==25 || j==31)) || (i==5 &&(j==24 || j==32))){  // A  r+c==29 || c-r=27 || (r==3 && c>=26 && c<=30)
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
