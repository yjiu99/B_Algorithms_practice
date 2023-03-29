import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String a = sc.next();
//        sc.close();
//
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            sum += a.charAt(i) - '0'
//          charAt은 해당 문자의 아스키코드 값을 반환 따라서 -48 또는 '0' 해주어야 함
//            아스키 코드의 0 은 48임
//        }
//        System.out.println(sum);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum =0;
        for ( byte value : br.readLine().getBytes(StandardCharsets.UTF_8)){
            sum += (value-'0');
        }
        System.out.println(sum);
    }
}
