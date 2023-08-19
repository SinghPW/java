package array;
//time
public class maximum {
	public static void main(String[] args) {
		int arr[]= {2,5,3,6,9,1,0,22};
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			max=Math.max(max, num);
		}
System.out.println("maximum nuber is: "+max);
}
}
