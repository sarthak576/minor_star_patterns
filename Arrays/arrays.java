public class arrays {
  public static void main(String[] args) {
    System.out.println("Arrays : (method-1)");
    int[] num = { 10, 50, 30 }; // shortcut
    System.out.println(num[2]); // prints index[]

    System.out.println("Arrays : (method-2)");
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[3] = 70;
    System.out.println(arr[2]); // output = 0

  }

  // index starts from 0 --> 0,1,2,3

}
