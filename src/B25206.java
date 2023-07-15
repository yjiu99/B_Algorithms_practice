import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// java 14 버전 이상
        int totalCredit = 0;
        double totalGrade = 0.0;

        for(int i = 0 ; i < 20 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if( !grade.equals("P")){
                totalCredit += credit;
                switch (grade){
                    case "A+" -> totalGrade += 4.5 * credit;
                    case "A0" -> totalGrade += 4.0 * credit;
                    case "B+" -> totalGrade += 3.5 * credit;
                    case "B0" -> totalGrade += 3.0 * credit;
                    case "C+" -> totalGrade += 2.5 * credit;
                    case "C0" -> totalGrade += 2.0 * credit;
                    case "D+" -> totalGrade += 1.5 * credit;
                    case "D0" -> totalGrade += credit;
                    case "F" -> totalGrade += 0.0;
                }
            }
        }
        double avg = totalGrade/totalCredit;
        System.out.printf("%.6f\n", avg);

    }
}
