import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 바이트 정수
        int len = N/4;
        for (int i = 0; i < len;i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
