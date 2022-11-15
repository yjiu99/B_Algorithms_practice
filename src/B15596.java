import java.util.Arrays;

public class B15596 {

    public static void main(String[] args) {
        int[] arr = new int[] {5,10,1000,8,9};
        System.out.println(sum(arr));
    }

    public static long sum(int[]a) {
        //long ans = Arrays.stream(a).mapToLong(i -> i).sum();
        // 자바 8
        return Arrays.stream(a).sum();
    }
}
//    long sum(int[] a) {
//        long ans = 0;
//        for(int i = 0; i <a.length;i ++ ) {
//            ans += a[i];
//        }
//        return ans;
//    }
