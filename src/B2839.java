import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while (kg >= 0){
//            if ((kg == 1) || (kg ==2) || (kg == 4) || (kg == 7)){
//                System.out.println(-1);
//                break;
//            } else if (kg%5 ==0) {
//                System.out.println((kg/5)+count);
//                break;
//            } else if (kg%5 != 0) {
//                kg = kg - 3;
//                count ++;
//            }
//        }
        int N = sc.nextInt();

        if (N ==1 || N == 2 ||N == 4 || N == 7) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }
    }
}
