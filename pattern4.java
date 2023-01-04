import java. util.*;
public class pattern4 {
    int n;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        n= sc.nextInt();
    }
    public void logic() {
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern4 obj = new pattern4();
        obj.input();
        obj.logic();
    }
}
