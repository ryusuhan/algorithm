import java.util.Scanner;

public class num2775 {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);

       int T = s.nextInt();
       int apart[][] = new int[15][16];
        int result[] = new int[T];
       for(int i = 0 ; i <= 14; i++){
            apart[i][1] = 1;
            apart[0][i+1] = i+1;
            apart[i][2] = i+2;
       }

       for(int i = 0; i < T; i++){
           int k = s.nextInt();
           int n = s.nextInt();
           for(int j = 1 ; j <= k; j++) {
               for (int l = 1; l <= n; l++) {
                   apart[j][l] = apart[j][l - 1] + apart[j - 1][l];
               }
           }
           result[i] = apart[k][n];
       }
       for(int i =0 ; i < T; i++) {
           System.out.println(result[i]);
       }
    }
}
