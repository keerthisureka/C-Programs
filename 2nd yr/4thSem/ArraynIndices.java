package tyljava;

import java.util.*;
public class ArraynIndices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1=0, sum2=0;
		
		int n1 = sc.nextInt();
		int[] a1 = new int[n1];
		for(int i=0; i<n1; i++) {
			a1[i] = sc.nextInt();
			sum1 += a1[i];
		}
		
		int n2 = sc.nextInt();
		int[] a2 = new int[n2];
		for(int i=0; i<n2; i++) {
			a2[i] = sc.nextInt();
			sum2 += a1[a2[i]];
		}
		
		System.out.println(sum1-sum2);
	}
}
//Given Two Array where First Array have some elements and second array consist of indices,
//Find the sum of all element from Array1, and subtract all the indices value present in array2.
//EX: Arr1 = [10,20,30,40,50]         Arr2 = [0,2]
//OUTPUT SUM = 10+20+30+40+50 - (10-30) = 110