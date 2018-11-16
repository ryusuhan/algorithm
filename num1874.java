import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class num1874 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        List al = new ArrayList();//+ - 를 넣기 위한 arraylist
        Stack<Integer> st = new Stack<>();
        int idx = 0;
        for(int i = 0; i < n; i ++){
            arr[i] = s.nextInt();
        }

        for(int i = 1; i <= n; i ++){
            st.add(i);
            al.add('+');
            while(!st.isEmpty() && arr[idx] == st.peek()){
                idx++;
                st.pop();
                al.add('-');
            }
        }
        if(!st.isEmpty()){
            System.out.println("NO");
        }
        else{
            for(int i = 0; i < al.size(); i++){
                System.out.println(al.get(i));
            }
        }
    }
}
