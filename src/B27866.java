import java.util.Scanner;

public class B27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int i = sc.nextInt();

        char result = S.charAt(i-1);
        System.out.println(result);
    }
}
