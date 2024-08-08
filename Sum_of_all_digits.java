import java.util.Scanner;
class Number{
static void  digitSum(int n){
    int sum=0;
    while(n>0)
    {
        int r=n%10;
        sum=sum+r;
        n=n/10;
    }
    System.out.println(sum);
}
}
public class sumOfDigits{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Number.digitSum(n);
    }
}