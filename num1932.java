import java.util.Scanner;

public class num1932 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tree[][] = new int[n+1][n+1];
        int max = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                tree[i][j] = s.nextInt();

                if(j == 1) tree[i][j] = tree[i-1][j] + tree[i][j];
                else if(j == i) tree[i][j] = tree[i-1][j-1] + tree[i][j];
                else tree[i][j] = Math.max(tree[i-1][j-1], tree[i-1][j]) + tree[i][j];

                if(max < tree[i][j]) max = tree[i][j];
            }
    }
        System.out.println(max);
    }
}
