import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];

        int max = num[0];
        int count = 0;

        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
            if(max < num[i]){
                max = num[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);

    }
}
