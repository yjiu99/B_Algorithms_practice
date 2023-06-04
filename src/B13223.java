import java.util.Scanner;

public class B13223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String currentTime = sc.nextLine(); // 현재 시간
        String addSaltTime = sc.nextLine(); // 소금 투하 시간

        // 1번째 방법
//        int hour = (currentTime.charAt(0) - '0') * 10 + currentTime.charAt(1) - '0';
//        int minute = (currentTime.charAt(3) - '0') * 10 + currentTime.charAt(4) - '0';
//        int second = (currentTime.charAt(6) - '0') * 10 + currentTime.charAt(7) - '0';

        // 2번째 방법
//        int hour = Integer.parseInt(currentTime.substring(0,2));
//        int minute = Integer.parseInt(currentTime.substring(3,5));
//        int second = Integer.parseInt(currentTime.substring(6,8));

        // 3번째 방법
        String[] time = currentTime.split(":");
        int currentHour = Integer.parseInt(time[0]);
        int currentMinute = Integer.parseInt(time[1]);
        int currentSecond = Integer.parseInt(time[2]);
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        String[] salt = addSaltTime.split(":");
        int saltHour = Integer.parseInt(salt[0]);
        int saltMinute = Integer.parseInt(salt[1]);
        int saltSecond = Integer.parseInt(salt[2]);
        int saltSecondAmout = saltHour * 3600 + saltMinute * 60 + saltSecond;

        int needSecondAmout = saltSecondAmout - currentSecondAmount;
        if(needSecondAmout <= 0) // 음수이면
            needSecondAmout += 24 * 3600;

        int needHour = needSecondAmout/3600;
        int needMinute = (needSecondAmout % 3600) / 60;
        int needSecond = needSecondAmout % 60;

        System.out.printf("%02d:%02d:%02d",needHour,needMinute,needSecond);



    }
}
