import java.util.Scanner;

/**
 * pattern9
 */
public class pattern9 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                int a= 'A'+j-1;
                char ch =(char)a;
                System.out.print(ch+" ");
                
            }
            System.out.println();
            
        }

    }
}