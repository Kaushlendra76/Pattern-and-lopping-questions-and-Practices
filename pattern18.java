import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <=i; space++) {
                
                
                
                System.out.print(" "); 
            
            }
            for (int star = 1; star<=n-i; star++) {
                System.out.print("*");
            }

        
            System.out.println();
        }
    }
}
