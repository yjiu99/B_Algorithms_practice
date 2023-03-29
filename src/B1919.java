import java.util.Scanner;

//두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때,
// 그러한 두 단어를 서로 애너그램 관계에 있다고 한다.
// 예를 들면 occurs 라는 영어 단어와 succor 는 서로 애너그램 관계에 있는데,
// occurs의 각 문자들의 순서를 잘 바꾸면 succor이 되기 때문이다.
//한 편, dared와 bread는 서로 애너그램 관계에 있지 않다.
// 하지만 dared에서 맨 앞의 d를 제거하고, bread에서 제일 앞의 b를 제거하면,
// ared와 read라는 서로 애너그램 관계에 있는 단어가 남게 된다.
//두 개의 영어 단어가 주어졌을 때,
// 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램을 작성하시오.
// 문자를 제거할 때에는 아무 위치에 있는 문자든지 제거할 수 있다.
public class B1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.next(); // 입력 받기
        String reverse = sc.next(); // 또 하나의 문자 입력
        // 알파벳 구성을 비교하기 위해 저장
        int[] words_count  = new int[26];
        // ex, dared : [1,0,0,2.......]
        int[] reverse_count = new int[26];

        for(int i =0; i<words.length();i++){
            words_count[words.charAt(i) - 'a']++; // 구성 성분을 카운트
        }
        for(int i = 0; i<reverse.length();i++){
            reverse_count[reverse.charAt(i) - 'a']++;
        }
        int ans  = 0;
        for (int i = 0; i<26; i++){
            if (words_count[i] > reverse_count[i])
                ans += words_count[i] - reverse_count[i];
            else if(words_count[i] < reverse_count[i])
                ans += reverse_count[i] - words_count[i];
        }
        System.out.println(ans);

    }
}
