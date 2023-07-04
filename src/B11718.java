import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> words = new ArrayList<>();

        try{
            String str;
            while (!(str = br.readLine()).equals("")){
                words.add(str);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String word : words) {
            System.out.println(word);
        }
        // 위는 공백이면 넘어가는 문제여서 null Point Error
        // 정답은 이 밑에 줄
//        String word;
//        while ((word = br.readLine()) != null){
//            System.out.println(word);
//        }
    }
}
