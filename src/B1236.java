import java.util.Scanner;

public class B1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 성의 세로 크기
        int M = sc.nextInt(); // 성의 가로 크기

        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++){
            map[i] = sc.next().toCharArray();
        }

        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[N];
        for (int i =0 ; i <N;i++){
            for(int j= 0;j<M;j++){
                if(map[i][j] == 'X'){
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }
        ///int existRowCount = 0;
        /*for(int i =0; i < N; i++){
            boolean exist = false;
            for (int j = 0; j <M; j++ ){
                if(map[i][j] == 'X'){
                    exist = true;
                    break;
                }
            }
            if(exist) existRowCount++;
        }*/

        //int existColCount = 0;
       /* for (int c =0 ; c <M;c++){
            boolean exist = false;
            for(int r = 0; r<N; r++){
                if(map[r][c] == 'X'){
                    exist = true;
                    break;
                }
            }
            if(exist) existColCount ++;
        }*/

//        int needRowCount = N - existRowCount;
//        int needColCount = M - existColCount;

        int needRowCount = N;
        int needColCount = M;
        for(int i =0;i<N;i++)
            if(existRow[i]) needRowCount--;
        for(int i =0;i<M;i++)
            if(existCol[i]) needColCount--;
        System.out.println(Math.max(needRowCount,needColCount));

    }
}
