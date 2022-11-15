import java.util.Scanner;

public class B1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(arithmetical(sc.nextInt()));
        sc.close();
    }

    public static int arithmetical(int num){
        int cnt; // 한수를 셀 변수

        if (num < 100) // 1~99는 그 수 자체가 수열, 따라서 100보다 작으면 다 한수
            return num;
        else {
            cnt = 99; // 100이상이면 한수의 갯수는 최소 99개
            for (int i = 100; i<= num; i++){
                int hundred = i / 100; // 100의 자리
                int ten = (i/10) % 10; // 10의 자리
                int one = i % 10; // 1의 자리

                if ((hundred - ten) == (ten - one)) // 각 자리 수 차이가 같으면
                    cnt++;
            }
        }
        return cnt;
    }
}
