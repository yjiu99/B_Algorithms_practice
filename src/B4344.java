import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); // 테스트 갯수

        for(int i = 0; i < c; i++){
            int n = sc.nextInt(); // 학생의 수
            int[] arr = new int[n];

            double sum =0;

            for(int j=0; j<n;j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double avg = sum/n; // 평균 저장
            double count =0;
            System.out.println("평균:" +  avg);

            for (int j =0;j<n;j++){
                if (arr[j] > avg){
                    count++;
                }
            }

            System.out.println("카운트 : "+ count);
            double per = (count / n) * 100;
            System.out.println(String.format("%.3f",per)+ "%");
            System.out.printf("%.3f%%\n",(count/n)*100);
        }



    }
}
