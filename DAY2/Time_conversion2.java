import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in minutes: ");
        int minutes = sc.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println("Hours = " + hours);
        System.out.println("Remaining minutes = " + remainingMinutes);

        sc.close();
    }
}
