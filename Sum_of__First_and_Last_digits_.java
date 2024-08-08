import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String str = Integer.toString(n);
        char q = str.charAt(0);
       char w = str.charAt(str.length() - 1);

        int e = q - '0';
        int r = w - '0';
        int sum = e + r;

        System.out.println(sum);
    }
}
