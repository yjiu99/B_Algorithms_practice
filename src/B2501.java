import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N ; i++){
            if(N % i == 0)
                K--;
            if(K == 0) {
                System.out.println(i);
                return; // break 안쓰는 이유 : break 는 가장 가까이 있는 하나의 반복문 벗어남
                // return은 이게 쓰여진 함수를 벗어남. 즉, 뒤에 코드가 더 있어도 실행 X, 아예 메소드 종료

            }
        }
        System.out.println(0);
    }
}
