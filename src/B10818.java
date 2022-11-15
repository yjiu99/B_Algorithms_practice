import java.util.Arrays;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 정수
        int[] arr = new int[n]; // n개 크기의 배열 생성

        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt(); // 배열의 크기만큼 숫자 입력 받기
        }

        Arrays.sort(arr); // 배열을 오름차순으로 정렬
        System.out.println(arr[0]+ " " +arr[n-1]); //최소 최대 출력
    }
}
