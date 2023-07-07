import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String words = br.readLine();

        StringBuilder sb = new StringBuilder(words);
        String reverseWord = sb.reverse().toString();

        if (reverseWord.equals(words))
            System.out.println("1");
        else System.out.println("0");

    }
}
