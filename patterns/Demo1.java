public class Demo1 {
    public static void main(String[] args) {
        int spc = 4, str = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print("* ");
            }
            // for(int l=1;l<=spc;l++){
            // System.out.print(" ");
            // }
            System.out.println();
            str++;
            spc--;
        }
    }
}

class Pascals {
    public static void main(String[] args) {
        int str = 1, spc = 4;
        for (int i = 1; i <= 5; i++) {
            int n = 1;
            for (int j = 1; j <= spc; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print(n + " ");
                n = n * (i - k) / k;
            }
            str++;
            spc--;
            System.out.println();
        }
    }
}

class Diamond {
    public static void main(String[] args) {
        int spc = 4, str = 1;
        // int s=1,st=7;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print("* ");
            }
            if (i < 5) {
                str += 2;
                spc--;
            } else {
                str -= 2;
                spc++;
            }
            System.out.println();
        }
    }
}

class Ones {
    public static void main(String[] args) {
        int spc = 4, str = 1;
        for (int i = 1; i <= 5; i++) {
            int n = 1;
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print(n + " ");
                if (k < i)
                    n++;
                else
                    n--;
            }
            System.out.println();
            spc--;
            str += 2;

        }
    }
}

class DiamondAbc {
    public static void main(String[] args) {
        int spc = 3, str = 1;
        for (int i = 1; i <= 7; i++) {
            char c = 65;
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print(k < (str + 1) / 2 ? c++ + " " : c-- + " ");
            }
            if (i < 4) {
                spc--;
                str += 2;
            } else {
                spc++;
                str -= 2;
            }
            System.out.println();

        }
    }
}

class MixNum {
    public static void main(String[] args) {
        int n=1;
        char c=65;
        for (int i = 1; i <= 5; i++) {
            // int n = 1;
            // char c = 65;
            for (int j = 1; j <= i; j++) {
                //System.out.print(j % 2 == 0 ? c + " " : n + " ");
                if(j%2==0){
                    System.out.print(c+" ");
                    c++;
                }
                else{
                    System.out.print(n+" ");
                    n++;
                }
                // c++;
                // n++;
            }
            System.out.println();
        }
    }
}

class Star{
    public static void main(String[] args) {
        int a=5,b=5;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j==a || j==b) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
            if(i<5){
                a++;b--;
            }
            else{
                a--;b++;
            }
        }
    }
}

class Rev{
    public static void main(String[] args) {
        int spc=0,str=9;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=str;k++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<5){
                spc++;
                str-=2;
            }
            else{
                spc--;
                str+=2;
            }
            
        }
    }
}

class Butterfly{
    public static void main(String[] args) {
        // 9 c 9 r
        int str=1,spc=8;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=spc;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=str;l++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<5){  
                str++;
                spc-=2;
            }
            else{
                str--;
                spc+=2;
            }
        }
    }
}

