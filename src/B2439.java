import java.util.Scanner;

public class B2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i =1;i<=t;i++){
            for (int j=t;j>0;j--){
                if(j<=i){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
