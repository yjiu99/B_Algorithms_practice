import java.io.*;
import java.util.StringTokenizer;

// BufferedReader BufferedWriter 사용해보기
public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
        int t = Integer.parseInt(br.readLine());
        // BufferedReader 는 String 으로 받기 때문에 형변환 해주어야 함
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 하나의 문자열을 여러개의 토큰으로 분리하는 클래스
            bw.write((Integer.parseInt(st.nextToken()))+ (Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.close();
    }
}
