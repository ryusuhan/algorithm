import java.util.Scanner;

public class num1748 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long num[] = new long[9];
        int length = leng(N);
        int result = 0;
        int a = 1, b = 9;

        for(int i = 0; i < num.length; i++){
            num[i] = a * b;
            a++;
            b *= 10;
        }

        for(int i = 0; i < length-1; i++){
            result += num[i];
        }

        if(length == 1){
            System.out.println(N);
        } else{
            result += (N-(int)Math.pow(10,length-1)+1) * length;
            System.out.println(result);
        }

    }

    private static int leng(int N){
        int leng = 0;
        int tmp = N;
        while(tmp > 0){
            tmp /= 10;
            leng++;
        }
        return leng;
    }
}
