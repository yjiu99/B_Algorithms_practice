import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;

        int i = M;
        x :
        while (i <= N) { //N회만큼 반복
            if (i == 1) { //1은 소수가 아님
                i++;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    i++;
                    continue x;
                }
            }
            sum += i;
            if (min > i) {
                min = i;
            }
            i++;
        }
        if (sum == 0 ) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum + "\n" + min);

    }
}



