public class oddsumupto_n {
    public static void main(String[] args) {
        System.out.println("Sum of "+15+" odd terms :"+ oddsum(15));
    }
    public static int oddsum(int n){
    int sum =0;
      for (int i=1;i<=n;i++){
        if(i%2!=0){
            sum+=i;        }
      }
      return sum;
}
}
