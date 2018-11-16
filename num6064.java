import java.util.Scanner;

public class num6064 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for(int i = 0; i < T; i++){
             int M = s.nextInt();
             int N = s.nextInt();
             int xs = s.nextInt();
             int ys = s.nextInt();
             int x = 1, y = 1;
             int d = 1;
             int cnt = 1;

             for(; ;){
                 if(x == xs) d = M; //x좌표가 목표좌표와 같다면 x를 고정
                 if(y == ys) d = N; //y좌표가 목표좌표와 같다면 y를 고정

                 //M or N만큼 건너뛰기
                 x = ((x+d)%M == 0) ? M : (x + d) % M;
                 y = ((y+d)%N == 0) ? N : (y + d) % N;
                 cnt += d;

                 if(x == xs && y == ys) break;
                 if( cnt > M*N){
                     cnt = -1;
                     break;
                 }
             }
             System.out.println(cnt);
        }
    }
}
