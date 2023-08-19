package array;

import java.util.*;

public class matrix {
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
		//program for upper number in primary diagonal
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)<m-1 ) {
					System.out.println("secondary elemnet are: "+arr[i][j]);
				}
			}
			
		}
		//print both diagonal number
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)==m-1 || i==j ) {
					System.out.println("elemnt ar diagonals: "+arr[i][j]);
				}
			}
			
		}
	}
}
