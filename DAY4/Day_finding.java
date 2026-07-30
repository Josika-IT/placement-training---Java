import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDays = 0;
        for (int y = 1900; y < year; y++) {
            if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
                totalDays += 366;
            else
                totalDays += 365;
        }
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m - 1];

            if (m == 2 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))
                totalDays++;
        }

        totalDays += day - 1;

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(week[totalDays % 7]);
    }
}
		
