import java.util.Arrays;

public class NegatiePositive {
    public static void negativeToPositive(int[] arr, int n){
        int i=0;
        for(int j=0;j<n;j++){
            int p=arr[i];
            if(arr[j]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};//{-20 ,-4, -13, -5, 19 ,11 ,3, 7}
      negativeToPositive(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    
}
