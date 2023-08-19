package array;
//time complexity:O(n)
//space coplexity: O(1)
public class peakElement {
public static void main(String[] args) {
	int arr[]= {2,5,3,6,9,91,0,22};
	int n=arr.length;
	for(int i=1;i<n-1;i++) {
		if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
			System.out.println("peak number is : "+arr[i]);
			break;
			
		}
	}
}
}
