import java.util.Scanner;

/**
 * pattern3
 */
public class pattern3 {

    int n;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        n= sc.nextInt();
    }
    public void logic() {
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern3 obj = new pattern3();
        obj.input();
        obj.logic();
    }
}