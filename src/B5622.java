import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int count = 0;

        for (int i = 0; i<word.length();i++){
            switch (word.charAt(i)) {
                case 'A', 'B', 'C' -> count += 3;
                case 'D', 'E', 'F' -> count += 4;
                case 'G', 'H', 'I' -> count += 5;
                case 'J', 'K', 'L' -> count += 6;
                case 'M', 'N', 'O' -> count += 7;
                case 'P', 'Q', 'R', 'S' -> count += 8;
                case 'T', 'U', 'V' -> count += 9;
                case 'W', 'X', 'Y', 'Z' -> count += 10;
            }
        }
        System.out.println(count);
    }
}
