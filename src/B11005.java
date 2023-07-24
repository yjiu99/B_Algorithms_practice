import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //Integer.toString(N,b) : 10진수 숫자 N을 b진수로 변환해라
        //toUpperCase() : 대문자로 만들어라
        System.out.println(Integer.toString(N,b).toUpperCase());
    }
}
