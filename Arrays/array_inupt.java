import java.util.Scanner;
public class array_inupt {
   public static void main(String[] args) {
    System.out.println("Enter size of array :");
    Scanner Input = new Scanner(System.in);
    int size = Input.nextInt();
    int [] array = new int[size];
    for(int i=0;i<size;i++){
         System.out.println("Element "+(i+1)+" :");
         array[i]= Input.nextInt();
    }
    System.out.println("Array of "+size+" elements :-");

    for(int j=0;j<array.length;j++){
        System.out.print(array[j]+" ");
    }
}
}
