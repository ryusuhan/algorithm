import java.util.Scanner;

public class num2292 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.print(arith(N));

    }
    public static int arith(int n) {
        if (n == 1) return 1;
        int i = 2;
        int c = 1;

        while (i <= n) {
            i += 6 * c;
            c++;
        }
        return c;
    }
}
