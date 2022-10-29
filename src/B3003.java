import java.util.Scanner;

public class B3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int look = 2;
        int bishop = 2;
        int night = 2;
        int pone = 8;

        king = king - sc.nextInt();
        queen = queen - sc.nextInt();
        look = look - sc.nextInt();
        bishop = bishop - sc.nextInt();
        night = night - sc.nextInt();
        pone = pone -sc.nextInt();

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(look + " ");
        System.out.print(bishop + " ");
        System.out.print(night + " ");
        System.out.print(pone + " ");

    }
}
