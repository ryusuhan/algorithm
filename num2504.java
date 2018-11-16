import java.util.Scanner;
import java.util.Stack;

public class num2504 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char strarr[] = str.toCharArray();
        Stack<String> paren = new Stack<>();
        int cal = 0;
        int result = 0;

        int rightstr = whether(str);

        if(rightstr == 0){
            System.out.println(rightstr);
        }
        else{
            for(int i = 0; i<strarr.length; i++){
                switch(strarr[i]){
                    case '(' :
                        paren.push("(");
                        break;
                    case '[' :
                        paren.push("[");
                        break;
                    case ')' :
                        if(paren.peek().equals("(")) {
                            paren.pop();
                            paren.push("2");
                        }
                    case ']' :

                }
            }

        }
    }
    public static int whether(String str){
        char arr[] = str.toCharArray();
        int cnt = 0;

        if (arr[0] != '(' && arr[0] != '[') {
            return 0;
        }

        for(int i = 0; i < arr.length ; i++) {
            if (arr[i] == '(' || arr[i] == '[')
                cnt += 1;
            else if (arr[i] == ')' || arr[i] == '(')
                cnt -= 1;
        }

            if (cnt != 0){
                return 0;
            }
            else{
                return 1;
            }
    }
}
