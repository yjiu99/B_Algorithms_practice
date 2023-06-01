import java.util.Scanner;

public class B1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine(); // 문서 입력 , nextLine -> 공백 포함 받기
        String keyword = sc.nextLine(); // 검색하려는 단어

        int startIndex = 0;
        int cnt = 0;

        for (int i = 0; i < doc.length(); i++){

/*1번쨰 방법
            boolean isMatch = true;
            for(int j=0; j < keyword.length();j++) {
                if (i+j >= doc.length() || doc.charAt(i + j) != keyword.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch){
                cnt++;
                i += keyword.length() -1;
            }*/

            int findIndex = doc.indexOf(keyword,startIndex);
            if(findIndex < 0)
                break;
            startIndex = findIndex + keyword.length();
            cnt++;
        }
        System.out.println(cnt);
    }
}
