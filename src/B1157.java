import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 알파벳 26개
        String s = br.readLine();

        for (int i = 0;i<s.length();i++){
            int s_char = s.charAt(i);
            if(97 <= s_char && s_char <= 122) // 대문자 범위 안에 있을 때
                arr[s_char - 97]++; // 해당 인덱스 값 하나 증가
            else //소문자 범위이면
                arr[s_char - 65]++;
            System.out.println("어레이 : "+ arr[i]);
        }
        int max = -1;
        char ch = 0;
        for(int i = 0; i<arr.length;i++){
            System.out.println("넌 뭐냐 : "+ i + arr[i]);
            if (arr[i] > max){
                max = arr[i];
                System.out.println("max : " + max);
                ch = (char)(i+65); // 대문자로 출력하기 위해 65 더해줌
                System.out.println("ch : " + ch);
            } else if (arr[i] == max) {
                ch = '?';
            }
            System.out.println("이건?" + ch);
            System.out.println("mola : " + arr[i]);
        }
        System.out.println(ch);
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next().toUpperCase();
//
//        int[] count = new int[26];
//
//        for (int i = 0; i < str.length(); i++) {
//            int num = str.charAt(i) -'A' ;
//            count[num]++;
//            System.out.println(i + count[i]);
//        }
//
//        int max = 0;
//        char answer = '?';
//        for (int i = 0; i < count.length; i++) {
//            if(max < count[i]){
//                max = count[i];
//                answer = (char)(i+'A');
//                System.out.println("max : " + max);
//                System.out.println(answer);
//            } else if (max == count[i]){
//                answer = '?';
//                System.out.println(answer);
//            }
//        }
//        System.out.println(answer);
    }
}
