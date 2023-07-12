import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class B2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 한 번에 출력하기 위해서

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i= 0; i<N;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int i : list)
            sb.append(i).append('\n');
        System.out.println(sb);



        // 이러면 시간 초과
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N ; i++){
//            arr[i] = Integer.parseInt(br.readLine());// 배열 입력 받기
//        }
//        int temp;
//        for(int i = 0; i < N ; i++){
//            for(int j = 0; j < N; j++){
//                if(arr[i] < arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int i = 0 ; i <N;i++){
//            System.out.println(arr[i]);
//        }
    }
}
