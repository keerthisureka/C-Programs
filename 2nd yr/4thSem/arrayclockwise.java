package tyljava;

import java.util.*;
public class arrayclockwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int temp = a[n-1];
		for(int i=n-2; i>=0; i--) {
			a[i+1] = a[i];
		}
		a[0] = temp;
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
//Given an array and N denoting number of elements, rotate the array by one position in clock-wise direction.
//A [] = {1, 2, 3, 4, 5} N=5                                                    
//OUTPUT: 5 1 2 3 4
//A [] = {9, 8, 7, 6, 4, 2, 1, 3} N=8                                       
//OUTPUT: 3 9 8 7 6 4 2 1