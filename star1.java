// print the pattern ? 
/*
       ****
       ****
       ****
       ****  
 */
public class star1 {
    public static void main(String[] args) {
        // outer loop - row
        for (int i = 0; i <= 3; i++) {
            // inner loop - column
            for (int j = 0; j <= 3; j++) {

                System.out.print("*");

            }
            System.out.println(" ");

        }

    }
}
