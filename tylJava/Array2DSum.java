package tyljava;

import java.util.*;
public class Array2DSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = 0;
		int[][] a = new int[n1][n2];
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n1; i++) {
			for(int j=0; j<2; j++) {
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}
}
//Take input of a 2-D array. Find the sum of all element present at column 1 and 2.
//Hint: Take input for N,M and an Array A[N][M]
//EX= Arr[4][3] = [[1,2,3], [10,20,30],[12,15,18],[5,15,25]]
//OUTPUT = 1+ 2 +10+20+12+15+5+15 = 80