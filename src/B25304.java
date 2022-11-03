import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //영수증에 적힌 총 금액
        int n = sc.nextInt(); // 총 물건 갯수
        int total = 0; // 계산한 값을 저장할 변수

        for(int i =0;i<n;i++){
            int a = sc.nextInt(); // 물건 가격
            int b = sc.nextInt(); // 물건 갯수
            total = total+(a*b);
        }

        if(total == x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
