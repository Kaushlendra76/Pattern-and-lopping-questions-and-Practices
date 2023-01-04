import java.util.Scanner;

public class pattern8 {
 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    n=sc.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n; j++) {
            int a = 'A'+i-1;
            char ch = (char)a;
            System.out.print(ch+" ");
        }
        System.out.println();
        
    }
 }   
}
