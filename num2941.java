import java.util.Scanner;

public class num2941 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String cro[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = s.nextLine();

        for(int i = 0; i < 8; i++){
            input = input.replace(cro[i], "a");
        }

        System.out.println(input.length());

    }
}
