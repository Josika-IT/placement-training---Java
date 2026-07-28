import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Price: ");
	    int price = sc.nextInt();
	    System.out.print("Quantity: ");
	    int quantity = sc.nextInt();
	   
	    int amount = price*quantity;
	    System.out.println("Amount: "+amount);
	}
}
