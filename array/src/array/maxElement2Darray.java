package array;

import java.util.Scanner;

public class maxElement2Darray {
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
		int max=Integer.MIN_VALUE;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				max=Math.max(max,arr[i][j]);
			}
		}
		System.out.println("max element is "+max);
		}
}
