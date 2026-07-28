import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter College Name: ");
        String college = sc.nextLine();

        System.out.print("Enter Department Name: ");
        String department = sc.nextLine();

        System.out.println("\n-----Details-----");
        System.out.println("Name: " + name);
        System.out.println("College Name: " + college);
        System.out.println("Department Name: " + department);

        sc.close();
    }
}
