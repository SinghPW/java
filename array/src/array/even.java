package array;

public class even {
public static void main(String[] args) {
	int arr[]= {2,5,3,6,9,1,0,22};
	int n=arr.length;
	for(int num:arr) {
		if(num%2==0) {
			System.out.println("this is prime number:"+num);
		}
	}
}
}
