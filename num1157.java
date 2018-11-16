import java.util.Scanner;
import java.util.Arrays;

public class num1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().toUpperCase();
        int alpha[] = new int[26];
        int max = 0;
        char answer = '?';

        Arrays.fill(alpha, 0);

        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 65]++;
            if (max < alpha[str.charAt(i) - 65]) {
                answer = str.charAt(i);
                max = alpha[str.charAt(i) - 65];
            } else if (max == alpha[str.charAt(i) - 65]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
