import java.util.Arrays;

public class RelativeOrder {
     public static void merge(int[] arr,int[] temp,int l,int mid,int h){
            //copy allthe negative element from left
            int k=l;
            for(int i=l;i<=mid;i++){
                if(arr[i]<0){
                    temp[k++]=arr[i];
                }
            }
            //copy negative elements from right
            for(int j=mid+1;j<=h;j++){
                if(arr[j]<0){
                    temp[k++]=arr[j];
                }
            }
            //copy allthe positiveelement from left
            for(int i=l;i<=mid;i++){
                if(arr[i]>0){
                    temp[k++]=arr[i];
                }
            }
            //copy positive elements from right
              for(int j=mid+1;j<=h;j++){
                if(arr[j]>0){
                    temp[k++]=arr[j];
                }
            }


            //copy temp back into arrr
            for(int i=l;i<=h;i++){
                arr[i]=temp[i];


            }


    }
    public static void Partition(int[] arr, int[] temp,int l,int h){
        if(h<=l) {
            return;
        }
        int mid=l+(h-l)/2;
      Partition(arr,temp,l,mid);
      Partition(arr, temp, mid+1, h);
      merge(arr,temp,l,mid,h);


    }
    public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        //{-20 ,-4, -13, -5, 19 ,7 ,11, 3}  output
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
      Partition(arr,temp,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    
}
