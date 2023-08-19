
package array;
import java.util.*;
public class IIdarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the number m and n: ");
	int m=sc.nextInt();
	int n=sc.nextInt();
	int arr[][]=new int[m][n];
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	//count positive and negative
	int pos=0,neg=0,even=0,odd=0,zeros=0;
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(arr[i][j]>0) {
				pos++;
			}
			if(arr[i][j]<0) {
				neg++;
			}
			if(arr[i][j]%2==0) {
				even++;
			}
			if(arr[i][j]%2!=0) {
				odd++;
			}
			if(arr[i][j]==0) {
				zeros++;
			}
		}
	}
	System.out.println("positive are "+pos);
	System.out.println("negative are "+neg);
	System.out.println("even are "+even);
	System.out.println("odd are "+odd);
	System.out.println("zeros3 are "+zeros);
}
}
