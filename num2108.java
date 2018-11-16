import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num2108 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        //수가 중복될 수 있기 때문에 index를 수로 처리하기 위해 4001을 먼저 선언
        int parr[] = new int[4001]; //입력이 양수일 때를 위한 배열
        int narr[] = new int[4001]; //입력이 음수일 때를 위한 배열
        int ascarr[] = new int[N]; //모든 입력에 대한 오름차순 배열
        int ascidx = 0;
        /*
        int pfreq = 0, freqp = 0; //양수입력의 최대빈도를 알아내기 위한 변수와 최대 빈도인 수
        int nfreq = 0, freqn = 0; //음수입력의 최대빈도를 알아내기 위한 변수와 최대 빈도인 수
        실패한 빈도수 구하기 방법
        */
        double sum = 0; //산술 평균을 위한 합

        for(int i = 0; i < N; i++){
            int a = s.nextInt();
            if(a >= 0){
                parr[a]++;
            }else{
                narr[Math.abs(a)]++;
            }
        }

        for(int i = 0; i < parr.length; i++){
            sum += parr[i] * i - narr[i] * i;
        }

        // 음수이기 때문에 끝 인덱스 부터 내려가면서 넣어야 오름차순으로 정렬된다.
        for(int i = narr.length-1; i>0; i--){
            while(narr[i] != 0){ //입력값이 있는 인덱스만 처리하기 위함
                ascarr[ascidx++] = -i;
                narr[i]--;
            }
        }

        for(int i = 0; i<parr.length; i++){
            while(parr[i] != 0){
                ascarr[ascidx++] = i;
                parr[i]--;
            }
        }

        /*for(int i = 0; i < parr.length; i++){
            if(parr[i] > pfreq){
                pfreq = parr[i];
                freqp = i;
            }
            if(narr[i] > nfreq){
                nfreq = narr[i];
                nfreq = -i;
            }
        }
        실패한 빈도수 구하기 방법 */


        int freq = 0; //빈도수를 알기 위한 변수
        List<Integer> freqlist = new ArrayList<>(); //최빈값들을 담기 위한 리스트

        for(int i = narr.length - 1; i>0; i-- ){
            if(narr[i] != 0) { //입력이 있는 부분만 처리하기 위해
                if(freq == narr[i]){ //가장 많이 반복한 횟수를 구하기 위해
                    freqlist.add(-i); //이렇게 저장되는 경우 최고 빈도의 수가 여러개인 경우이다.
                }else if(freq < narr[i]){
                    freq = narr[i];
                    freqlist = new ArrayList<>(); // 빈도수가 더 많은게 나오면 List를 초기화.
                    freqlist.add(-i);
                }
            }
        }

        for(int i = 0; i<parr.length; i++){
            if(parr[i] != 0){ //입력값이 있는 부분만
                if(freq == parr[i]){ //반복한 최대 횟수를 구하기 위해
                    freqlist.add(i); //이렇게 입력된 경우 최빈값이 여러개일 때
                }else if(freq < parr[i]){
                    freq = parr[i];
                    freqlist = new ArrayList<>(); //최빈값이 나오면 기존의 리스트를 초기화
                    freqlist.add(i);
                }
            }
        }

        System.out.println(Math.round(sum/N));
        System.out.println(ascarr[(N-1)/2]);
        //if(freqlist.size() == 1){ //최빈값이 하나면 그것을 출력
            System.out.println(freqlist.get(0));
        //}else{ //최빈값이 여러개면, 두번째로 작은 값을 출력
         //   System.out.println(freqlist.get(1));
        //}
        System.out.println(ascarr[N-1] - ascarr[0]);
    }
}
