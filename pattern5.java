import java.util.Scanner;

public class pattern5 {
    int n, count=1;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    public void logic() {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col<=row; col++) {
                System.out.print(count+" ");
               count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern5 obj = new pattern5();
        obj.input();
        obj.logic();
    }
}
