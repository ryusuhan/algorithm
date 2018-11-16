import java.util.Scanner;

public class num10872 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        System.out.println(fac(N));

    }
    public static int fac(int a){
        int fac = 1;

        for(int i = 1; i <= a; i++){
            fac *= i;
        }
        return fac;
    }
}
