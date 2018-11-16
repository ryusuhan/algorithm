import java.util.Scanner;

public class num2750 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int tmp = 0;

        int arr[] = new int[T];

        for(int i = 0; i < T; i++){
            arr[i] = s.nextInt();
        }
        for(int j = arr.length; j > 0; j--) {
            for (int i = 0; i < T - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        for(int i = 0; i < T; i++){
            System.out.println(arr[i]);
        }


    }
}
