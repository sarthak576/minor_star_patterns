import java.util.Scanner;

public class star2 {
    public static void main(String args[]) {
        System.out.println("enter num1:(rows)");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        System.out.println("enter num2:(colmns)");

        int num2 = scan.nextInt();
        // outer row

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
