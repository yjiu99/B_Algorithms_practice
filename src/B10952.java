import java.util.Scanner;

public class B10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0)
                flag = false;
            else
                System.out.println(a+b);
        }
    }
}

