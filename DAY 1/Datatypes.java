import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("\nInteger: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + ch);

        sc.close();
    }
}
