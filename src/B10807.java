import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int count = 0;
        for(int i=0; i<num.length;i++){
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int j : num)
            if (j == x) {
                count++;
            }
        System.out.println(count);

    }
}
