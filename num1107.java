import java.util.Scanner;

public class num1107 {

    static boolean broke[] = new boolean[10];
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int result = Math.abs(N-100);

        for(int i = 0; i < M; i++){
            broke[s.nextInt()] = true;
        }

        for(int i = 0; i <= 1000000; i++){
            int check = i;
            int leng = avail(check);
            if(leng > 0) {
                int press = Math.abs(check - N);
                if(result > leng + press){
                    result = leng + press;
                }
            }
        }
        System.out.println(result);
    }
    public static int avail(int N){
        int digits = 0;

        if(N == 0){
            if(broke[0] == true) {
                return 0;
            } else {
                return 1;
            }
        }

        int leng = 0;
        while(N > 0){
            if(broke[N%10] == true){
                return 0;
            }
            leng++;
            N = N/10;
        }
        return leng;
    }
}
