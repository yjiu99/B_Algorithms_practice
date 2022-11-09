import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 시험 본 과목의 개수
        Float[] score = new Float[n];
        float max= 0;
        float sum =0;

        for (int i =0; i<score.length;i++){
            score[i] = sc.nextFloat();
            if(max < score[i])
                max = score[i];
        }
//        System.out.println("최대: "+max);
        for (int i =0; i<score.length;i++){
                score[i] = (score[i]/max)*100;
//                System.out.println("확인용 : " + score[i]);
                sum += score[i];
//                System.out.println("합친거 : " + sum);

        }
        sc.close();
        System.out.println(sum/n);


    }
}
