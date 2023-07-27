import java.util.*;
public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int sum = a[0] + a[n-1];
		System.out.println(sum);
	}
}
//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.
//A [] = {-2, 1, -4, 5, 3} N=5                                                     
//OUTPUT = -4+5=1
//A [] = {1, 3, 4, 1} N=4                                                           
//OUTPUT = 1+4 = 5
