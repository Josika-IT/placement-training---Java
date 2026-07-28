import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = sc.nextDouble();

        System.out.print("Enter width: ");
        float width = sc.nextDouble();

        float area = length * width;
        float perimeter = 2 * (length + width);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        sc.close();
    }
}
