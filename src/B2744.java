//영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String en = sc.next();
        String result = ""; // 변환 값 저장할 변수
        char tmp;

        for(int i = 0 ; i<en.length();i++){
            tmp = en.charAt(i);
            if((65 <= tmp) && (tmp <= 90)) // 대문자이면
                result += en.valueOf(tmp).toLowerCase(); // 소문자로 변환
            else if (97 <= tmp && tmp <=122) // 소문자이면
                result += en.valueOf(tmp).toUpperCase(); // 대문자로 변환
            else
                result += tmp;


        }
        System.out.println(result);
    }
}
