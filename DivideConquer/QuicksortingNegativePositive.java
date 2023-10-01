public class QuicksortingNegativePositive {
    public static int partition(int[] arr,int l,int h){
        int i=l;
        int pivot=arr[l];
        for(int j=l+1;j<=h;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quick(int[] arr,int l,int h){
        if(l<h){
            int m=partition(arr,l,h);
            quick(arr, l, m-1);
            quick(arr, m+1, h);
        }
    }
        public static void printArr(int[] arr,int n){
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
        }
  
    public static void main(String[] args) {
        int[] arr={9,6,2,0,3};
        System.out.println("Before sorting the array: ");
    printArr(arr,arr.length);
   
        quick(arr,0,arr.length-1);
         System.out.println("After sorting the array: ");
        printArr(arr,arr.length);
    }
    
}
