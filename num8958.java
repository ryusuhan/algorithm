import java.util.Scanner;

public class num8958 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        int result[] = new int[N];
        for(int j = 0; j < N; j++) {

            String str = s.nextLine();
            char OXarr[] = str.toCharArray();
            int score[] = new int[OXarr.length];
            int cnt = 0;
            int scoresum = 0;

            for (int i = 0; i < OXarr.length; i++) {
                if (OXarr[i] == 'O') {
                    cnt++;
                    score[i] = cnt;
                } else {
                    cnt = 0;
                    score[i] = cnt;
                }
            }

            for(int i = 0; i < score.length; i++){
                scoresum += score[i];
            }
            result[j] = scoresum;
        }

        for(int i = 0; i < N; i++){
            System.out.println(result[i]);
        }

    }
}
