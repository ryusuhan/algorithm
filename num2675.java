import java.util.Scanner;

public class num2675 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        String strarr[] = new String[T];
        int cnt[] = new int[T];

        for(int i=0; i<T;i++){
            cnt[i]=s.nextInt();
            strarr[i]=s.nextLine().trim();
        }
        for(int j = 0; j<T; j++){
            char arr[] = strarr[j].toCharArray();
            for(int k=0; k<arr.length; k++){
                for(int l = 0; l<cnt[j]; l++){
                    System.out.print(arr[k]);
                }
            }
            System.out.println();
        }
    }
}
