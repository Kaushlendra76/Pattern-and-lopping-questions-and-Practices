import java.util.Scanner;

public class pattern6 {
    int n;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    public void logic() {
        for (int row = 0; row <= n-row; row++) {
            System.out.print(" ");
            for (int col = 0; col<=row;  col++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        pattern6 obj = new pattern6();
        obj.input();
        obj.logic();
    }
}
