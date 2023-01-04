import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            
            for (int space = 1; space <=n-i; space++) {
                
                
                
                System.out.print(" "); 
            
            }
            // Print Ist triaangle
            for (int star = 1; star<=i; star++) {
                System.out.print(star);
                
           }
           //print IInd triagle
           for (int j = 1; j<=i-1; j++) {
            System.out.print(j);
            
           } 


        
            System.out.println();
        }
    }
}
