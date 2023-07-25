import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
        StringBuilder sb = new StringBuilder(); //  한번에 출력

        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";


        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if(first == 0 && second == 0) break;
            if(second % first == 0)
                sb.append(f);
            else if (first % second == 0)
                sb.append(m);
            else sb.append(n);
        }
        System.out.println(sb);
    }
}
