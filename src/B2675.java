import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int r = Integer.parseInt(s[0]);
            String S = s[1];

            for (int j =0;j < S.length();j++){
                for (int k = 0; k<r; k++ ){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
