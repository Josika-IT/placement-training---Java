import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Price: ");
        int price = sc.nextInt();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Discount (%): ");
        int per = sc.nextInt();

        int amount = price * quantity;
        int discount = amount * per / 100;
        int finalAmount = amount - discount;

        System.out.println("Actual Amount: " + amount);
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}
