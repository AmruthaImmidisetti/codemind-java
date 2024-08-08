import java.util.Scanner;
 class Number{
    static int getDigitCount(int n){
        int c=0;
        while(n>0){
            int r=n%10;
            c++;
            n=n/10;
        }
        return c;
    }
}

   public class  digitCount{
         public static void main(String[] args){
             int n;
             Scanner read=new Scanner(System.in);
             n=read.nextInt();
             System.out.println(Number.getDigitCount(n));
         }
     }
