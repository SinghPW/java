package array;
import java.util.*;
public class middleRow2D {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the value of row and coloumn: ");
int m=sc.nextInt();
int n=sc.nextInt();
int arr[][]=new int[m][n];
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0;i<m;i++) {
	if(m/2==i) {
		for(int j=0;j<n;j++) {
			System.out.print("middle number is "+arr[i][j]);
		}
		System.out.println();
	}
}
	}
}
