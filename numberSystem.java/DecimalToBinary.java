import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        int n=10;
        int count=0,binary=0;
        while(n>0){
            int rem=n%2;
            double place=Math.pow(10, count);
            count++;
            binary+=rem*place;
            n=n/2;
        }
      if((binary^1) == binary+1) System.out.println("Number is even");
      else System.out.println(" Number is odd");
    }
    
}
