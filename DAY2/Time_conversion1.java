import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println("Minutes = " + minutes);
        System.out.println("Remaining seconds = " + remainingSeconds);

        sc.close();
    }
}
