import java.util.Scanner;

public class B5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];
        // 0~30번 만들기
        for(int i =1;i<29;i++){//28번째까지 입력 받기
            int submit = sc.nextInt();
            student[submit] = 1;
            // 30번까지의 출석번호니까 제출한 사람은 1로 바꿔버림
        }
        for(int i =1;i<student.length;i++){
            if(student[i]  != 1)
                System.out.println(i);
        }
        sc.close();
    }
}
