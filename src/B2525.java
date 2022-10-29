import java.util.Scanner;

// 오븐 시간 계산
public class B2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 시작하는 시(h)
        int m = sc.nextInt(); // 시작하는 분(m)
        int time = sc.nextInt(); // 걸리는 시간

        m = m+time;
        while (m>=60){
            h++;
            m = m - 60;
            if (h == 24)
                h = 0;
        }
            System.out.print(h + " " + m);
    }
}
