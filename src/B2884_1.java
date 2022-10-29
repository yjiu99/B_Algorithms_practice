import java.util.Scanner;

public class B2884_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45){
            h --;
            m = 60-(45-m);
            if(h < 0)
                h = 23;
            System.out.print(h + " " + m);
        }else {
            System.out.print(h + " " + (m-45));
        }

    }
}
