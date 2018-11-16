import java.util.Scanner;

public class num10250 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        int H,W,N;
        int arr[] = new int[T];

        for(int i = 0; i < T; i++){
            H = s.nextInt();
            W = s.nextInt();
            N = s.nextInt();

            int m = N / H;
            int k = N % H;

            if(k == 0){
                arr[i] = H * 100 + m;
            }else{
                k = k*100;
                arr[i] = (int)(k+m+1);
            }
        }
      for(int i = 0 ; i < T; i++){
          System.out.println(arr[i]);
      }
    }

}
