
public class evensumupto_n {
    public static void main(String[] args) {
              System.out.println("Even Sum upto 20: "+evensum(20));     
    }
    public static int evensum(int k){
        int sum =0;
        for (int i=2;i<=k;i++){

            if(i%2==0){
                sum +=i;  
            }
           
        }
        return sum;



    }
    
}
