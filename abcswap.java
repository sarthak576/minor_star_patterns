public class abcswap {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;

        int temp = a;
        System.out.println("initally : " + "a: " + a + "  b: " + b);

        a = b;
        b = temp;
        System.out.println("Swapped : " + "a: " + a + "  b: " + b);

    }
}
