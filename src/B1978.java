import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        while (st.hasMoreTokens()){
            boolean isTrue = true;

            int decimal = Integer.parseInt(st.nextToken());

            if(decimal == 1){ // 1은 소수가 아님
                continue;
            }
            for(int i = 2; i <= Math.sqrt(decimal); i++){
                if(decimal % i == 0){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) cnt++;

        }
        System.out.println(cnt);

    }
}
