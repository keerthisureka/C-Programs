import java.util.Random;
import java.util.Scanner;

class msort {
	
		public void create_array(int a[], int n, int choice) {
			if(choice == 0)
			{
				for(int i=0; i<n; i++)
					a[i] = i;
			}
			else if(choice == 1)
			{
				for(int i=0; i<n; i++)
					a[i] = n-i;
			}
			else
			{
				Random rand = new Random();
				for(int i=0; i<n; i++) {
					a[i] = rand.nextInt(1000000);
				}
			}
		}
		
		public void simplemerge(int a[], int l, int mid, int h) {
			int n1 = mid-l+1;
			int n2 = h-mid;
			int left[] = new int[n1];
			int right[] = new int[n2];
			int i, j, k;
			
			for(i=0; i<n1; i++) {
				left[i] = a[l+i];
			}
			for(j=0; j<n2; j++) {
				right[j] = a[mid+1+j];
			}
			i=0;
			j=0;
			k=l;
			while(i < n1 && j < n2) {
				if(left[i] <= right[j]) {
					a[k] = left[i];
					i++;
				}
				else {
					a[k] = right[j];
					j++;
				}
				k++;
			}
			
			while(i < n1) {
				a[k] = left[i];
				i++; k++;
			}
			while(j < n2) {
				a[k] = right[j];
				j++; k++;
			}
		}
		
		public void mergesort(int a[], int l, int h) {
			int mid;
			if(l<h) {
				mid = (l+h)/2;
				mergesort(a, l, mid);
				mergesort(a, mid+1, h);
				simplemerge(a, l, mid, h);
			}
		}
		
		public void print_array(int a[]) {
			for(int i=0; i < a.length; i++) {
				System.out.println(" " + a[i]);
			}
			System.out.println("\n");
		}
}

public class MergeSort {

	public static void main(String[] args) {
		long start, end, time;
		int a[];
		msort obj = new msort();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the choice: ");
		int ch = sc.nextInt();
		
		a = new int[n];
		obj.create_array(a, n, ch);
		
		System.out.println("The array elements before sorting: ");
		obj.print_array(a);
		
		start = System.nanoTime();
		obj.mergesort(a, 0, n-1);
		end = System.nanoTime();
		time = (end-start)/1000000L;
		
		System.out.println("The array elements after sorting: ");
		obj.print_array(a);
		
		System.out.println("The time taken to sort: " + time + " ms");
	}
}