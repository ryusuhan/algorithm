import java.util.Scanner;

public class num9012 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int cnt[] = new int[n];

        for(int i = 0; i < n; i++){
            String str=s.nextLine().trim();
            cnt[i] = VPS(str);
        }

        for(int i = 0; i < n; i ++){
            if(cnt[i] != 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }



    }
    public static int VPS(String str){
        int cnt = 0;

        char chararr[] = str.toCharArray();

        for(int i = 0; i < chararr.length; i++){
            if(cnt < 0){
                return -1;
            }
            if(chararr[i] == '('){
                cnt += 1;
                continue;
            }
            if(chararr[i] == ')'){
                cnt -= 1;
                continue;
            }
        }

        return cnt;
    }
}
