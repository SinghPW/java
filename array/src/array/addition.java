package array;

class calc{
	public int add(int nums[]) {
		int result=0;
		for(int n: nums) {
			result=result+n;
		}
		return result;
	}
}
public class addition {
public static void main(String[] args) {
	calc obj=new calc();
	//int nums[]= {3,1,8,4,5};
	int result=obj.add(new int[] {3,2,5});//anonymous array (without name is )
	System.out.println(result);
}
}
