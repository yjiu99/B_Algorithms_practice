import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 갯수
        String[] arr = new String[n];

        for (int i =0; i< arr.length;i++) {
            arr[i] = sc.next();
            int count = 0;
            int sum =0;
            for (int j = 0; j< arr[i].length();j++){
                if (arr[i].charAt(j) == 'O')
                    count ++;
                else
                    count = 0;
                sum += count;
            }
            System.out.println(sum);
        }
    }
}
