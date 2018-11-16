import java.util.Scanner;
import java.util.Stack;

public class num10828 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < N; i++){
            String str = s.nextLine();
            String strtoInt[] = str.split(" ");
            switch(strtoInt[0]){
                case "push" :
                    stack.push(Integer.parseInt(strtoInt[1]));
                    break;

                case "pop" :
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(stack.pop());
                    }
                    break;

                case "size" :
                    System.out.println(stack.size());
                    break;

                case "empty" :
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                    break;

                case "top" :
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }

    }
}
