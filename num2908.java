import java.util.Scanner;

public class num2908 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int fir = s.nextInt();
        int sec = s.nextInt();
        int a = sang(fir);
        int b = sang(sec);

        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


    }
    public static int sang(int t){
        int n1 = t / 100;
        int n2 = (t /10) % 10;
        int n3 = t % 10;
        int ch = n3 * 100 + n2 * 10 + n1;

        return ch;

    }
}
