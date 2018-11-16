import java.util.Scanner;

public class num5622 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sec = dial(str);

        System.out.println(sec);

    }
    public static int dial(String s){
        int sum = 0;
        char arr[] = s.toCharArray();
        int result[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int seq = 2;
            if(arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C'){
                seq += 1;
                result[i] = seq;
            }else if(arr[i] == 'D' || arr[i] == 'E' || arr[i] == 'F'){
                seq += 2;
                result[i] = seq;
            }else if(arr[i] == 'G' || arr[i] == 'H' || arr[i] == 'I'){
                seq += 3;
                result[i] = seq;
            }else if(arr[i] == 'J' || arr[i] == 'K' || arr[i] == 'L'){
                seq += 4;
                result[i] = seq;
            }else if(arr[i] == 'M' || arr[i] == 'N' || arr[i] == 'O'){
                seq += 5;
                result[i] = seq;
            }else if(arr[i] == 'P' || arr[i] == 'Q' || arr[i] == 'R' || arr[i] == 'S'){
                seq += 6;
                result[i] = seq;
            }else if(arr[i] == 'T' || arr[i] == 'U' || arr[i] == 'V'){
                seq += 7;
                result[i] = seq;
            }else if(arr[i] == 'W' || arr[i] == 'X' || arr[i] == 'Y' || arr[i] == 'Z'){
                seq += 8;
                result[i] = seq;
            }else{
                seq += 9;
                result[i] = seq;
            }
        }

        for(int i = 0; i < result.length; i++){
            sum += result[i];
        }

        return sum;
    }
}
