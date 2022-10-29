import java.util.Scanner;

//알람 45분 일찍 설정하기
// H M 바꾸기
public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 시간
        int m = sc.nextInt(); // 분
        int time = ((h * 60 + m) - 45); //분으로 치환

        if (h == 0) {
            h = ((24 * 60 + m) - 45) / 60;
            m = ((h * 60 + m) - 45) % 60;
        }
        else {
            h = time / 60;
            m = time%60;
        }

        if (h == 24) // 24시로 나오면 0 으로 바꿔주기
            h = 0;

        System.out.print(h + " ");
        System.out.print(m);

    }
}
