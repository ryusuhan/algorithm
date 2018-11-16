import java.util.Scanner;

public class num1065 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int cnt;

        if(N < 100){
            cnt = N;
            System.out.println(cnt);
        }else {
            cnt = 99;

            for(int i = 100; i <= N; ++i){
                cnt += han(i);
            }

            if(N==1000) cnt--;

            System.out.println(cnt);

        }
    }
    public static int han(int N){
        int n1 = N /100 % 10;
        int n2 = N / 10 % 10;
        int n3 = N % 10;

        if(n2 * 2 == n1 + n3){
            return 1;
        }
        return 0 ;
    }
}
