// the question which is asked in my interview of java --> Integrated active monitering
// print this 
/*
           *
           * *
           * * *
           * * * *
 */

class star3 {
    public static void main(String[] args) {
        // rows
        for (int i = 1; i <= 4; i++) {
            // columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
