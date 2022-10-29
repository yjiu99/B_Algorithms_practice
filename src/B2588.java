import java.util.Scanner;

// 세자리 수 곱하기 세자리 수 자리별로 출력
public class B2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 첫 번째 세자리 수
        int b = sc.nextInt(); // 두 번째 세자리 수

        int c = (b%10) * a; // 3번, 즉 첫 번째 자리 숫자와 곱한 것 472*5
        int d = ((b%100)/10)*a; // 4번, 두 번째 자리 숫자와 곱한 것 472*8
        int e = (b/100)*a; // 5번, 세 번째 자리 숫자와 곱한 것 472*3
        // 결과
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);
        //혹은
        System.out.println(c + d*10 + e*100);

    }
}
