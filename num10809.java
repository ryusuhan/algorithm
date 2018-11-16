import java.util.Scanner;
import java.util.Arrays;

public class num10809 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char a = 'a';
        String S = s.nextLine().trim();

        int arr[] = new int[26];
        Arrays.fill(arr, -1);

        for(int i =0; i<S.length() ; i++){
            char b = S.charAt(i);
            int index = S.indexOf(b);

            arr[b-97] = index;
        }

        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

    }
}
