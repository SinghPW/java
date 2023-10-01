import java.util.Collections;

public class permuteSumTwoArray {
    public static boolean sum( int[] a, int[] b,int k){
       //sort array in ascending order
        Arrays.sort(a);
        //sort b decending order
        Arrays.sort(b,Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            if(a[i]+b[i]<k)
            return false;
           
        }
        return true;
    }
    public static void main(String[] args) {
    int[] a={2,1,3};
     int[] b={7,8,9};
    int k=10;
    
if(sum(a,b,k)){
    System.out.println("yes");
}
else
{
System.out.println("NO");
}
}
}