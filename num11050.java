import java.util.Scanner;

public class num11050 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        System.out.println(fac(N)/(fac(K) * fac(N-K)));


    }
    public static int fac(int a){
        int fac = 1;

        for(int i = 1; i <= a; i++){
            fac *= i;
        }

        return fac;
    }
}
//이항 계수의 식은 N! / K! * (N-K)!