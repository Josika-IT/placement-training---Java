import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table number: ");
        int n = sc.nextInt();
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            System.out.println(i+"*"+n+"="+(n*i));
           
        }
       
    }
}
		
