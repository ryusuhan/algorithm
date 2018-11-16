import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num10845 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        int a;
        int l = 0;

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < N; i++){
            String str = s.nextLine();
            String strarr[] = str.split(" ");
            switch(strarr[0]){
                case "push" :
                    a = Integer.parseInt(strarr[1]);
                    l = a;
                    q.add(Integer.parseInt(strarr[1]));
                    break;

                case "pop" :
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(q.poll());
                    }
                    break;

                case "front" :
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(q.peek());
                    }
                    break;

                case "empty" :
                    if(q.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;

                case "size" :
                    System.out.println(q.size());
                    break;

                case "back" :
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(l);
                    }
                    break;
            }
        }
    }
}
