import java.util.Scanner;
class Number{
    static void printAtoB(int a,int b){
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
        }
    }
}
public class aToB{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Number.printAtoB(a,b);
    }
}