import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n;
        boolean flag = true;
        int count = 0;
        while (flag) {
//            System.out.println("결과 : " + result);
            result = ((result % 10) * 10) + (((result / 10) + (result % 10)) % 10);
            count++;

            if (result == n) {
                System.out.println(count);
                flag = false;

            }

        }

    }
}
