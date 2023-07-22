import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int ans = 0;

        for(int i = 0; i <N.length() ; i++){
            if('0' <= N.charAt(i) && N.charAt(i) <= '9')
                ans = ans*b + ((int)N.charAt(i) - (int)'0' );
            else ans =  ans*b + ((int)N.charAt(i) - (int) 'A' + 10);
        }
        System.out.println(ans);
    }
}
