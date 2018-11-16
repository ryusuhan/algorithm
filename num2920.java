import java.util.Arrays;
import java.util.Scanner;

public class num2920 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int scales[] = new int[8];
        int minus[] = new int[scales.length - 1];
        int count = 0;
        for(int i = 0; i < scales.length; i++){
            scales[i] = s.nextInt();
        }

        for(int i = 0; i <scales.length-1; i++){
            minus[i] = scales[i] - scales[i+1];
        }

        for(int i = 0; i < minus.length; i++){
            for(int j = 0; j < minus.length; j++){
                if(minus[i] == minus[j]){
                    count ++;
                }
            }
        }

        if(count == 49){
            if(minus[0] == 1){
                System.out.println("descending");
            }else if(minus[0] == -1){
                System.out.println("ascending");
            }
        }else{
            System.out.println("mixed");
        }
        System.out.println(count);

    }
}
