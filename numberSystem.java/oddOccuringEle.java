public class oddOccuringEle {
    public static void main(String[] args) {
        int[] arr={4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count%2!=0) {
                System.out.println("The odd accuring element is "+arr[i]);
                break;
            }
            else count=0;
        }
    }
    
        
    
}
