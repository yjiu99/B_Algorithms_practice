import java.util.Scanner;

public class B10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int []arr = new int[N+1];

        for(int i = 1; i<=N;i++){
            arr[i] = i;
        }
        for (int i =0; i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        for (int i = 1; i < N+1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
