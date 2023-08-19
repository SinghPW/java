package array;

public class secondmax {
	public static void main(String[] args) {
		int arr[]= {2,5,3,6,9,91,0,22};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int num:arr) {
			max1=Math.max(max1, num);
		}
//System.out.println("maximum nuber is: "+max);
		for(int num:arr) {
						if(num!=max1) {
							max2=Math.max(max2,num);
						}
		}
		if(max2==Integer.MAX_VALUE) {
			System.out.println("no other element in such array: ");
		}
		else {
			System.out.println("second manumber is:  "+max2);
		}
}
}
