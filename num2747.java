import java.util.Scanner;

public class num2747 {
    static int[] result;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        result = new int[n + 1];

        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n <= 1)
            return n;
        else if (result[n] > 0)
            return result[n];

        result[n] = fibo(n - 2) + fibo(n - 1);

        return result[n];
    }
}
