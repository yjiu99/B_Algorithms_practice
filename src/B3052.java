import java.util.Arrays;
import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 1;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt()%42; //나머지 저장
        }
        Arrays.sort(arr); //나머지를 정렬
        //정렬을 해야 다음것과 비교했을 때 카운트를 셀 수 있음
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1])
                count +=1;
        }
        System.out.println(count);
        sc.close();

    }
}
