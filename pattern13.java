import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        int n;char a = 'A'; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                
                
                System.out.print(a+" "); 
                a++;
            }
        
            System.out.println();
        }
    }
}
