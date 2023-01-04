import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for (int i = 1; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(n-j-1);
                
            }
            System.out.println();
            
        }
    }
}
