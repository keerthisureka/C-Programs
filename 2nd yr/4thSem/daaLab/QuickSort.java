import java.util.Random;
import java.util.Scanner;

class qsort {
	int n;
	int arr[];
	//Create an array with random numbers
	//User specifies the number of random elements
	public void create_array(int n, int choice) {
		//choice = 0 for elements already in sorted order
		//choice = 1 for elements already sorted in reverse order
		//choice = 2 for random elements
		this.n = n;
		arr = new int[n+1];
		if(choice == 0)
		{
			for(int i=0; i<n; i++)
				arr[i] = i;
		}
		else if(choice == 1)
		{
			for(int i=0; i<n; i++)
				arr[i] = n-i;
		}
		else
		{
			Random rand = new Random();
			for(int i=0; i<n; i++) {
				arr[i] = rand.nextInt(1000000);
			}
		}
		arr[n] = 1000001;
	}
	
	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public int partition(int l, int r) {
		int p, i, j;
		p = arr[l];
		i = l;
		j = r;
		while(i<=j) {
			while(p >= arr[i])
				i++;
			while(p < arr[j])
				j--;
			swap(i, j);
		}
		swap(i, j); //undo previous swap when j>i
		swap(l, j);
		return j;
	}
	
	public void sort(int l, int r) {
		if(l<r) {
			int p = partition(l, r);
			sort(l, p-1);
			sort(p+1, r);
		}
	}
	
	public void print_array() {
		for(int i=0; i < arr.length - 1; i++) {
			System.out.println(" " + arr[i]);
		}
		System.out.println("\n");
	}
}

public class QuickSort {
	public static void main(String[] args) {
		long start, end, time;
		qsort obj = new qsort();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the choice: ");
		int ch = sc.nextInt();
		
		obj.create_array(n, ch);
		
		System.out.println("The array elements before sorting: ");
		obj.print_array();
		
		start = System.nanoTime();
		obj.sort(0, n-1);
		end = System.nanoTime();
		time = (end-start)/1000000L;
		
		System.out.println("The array elements after sorting: ");
		obj.print_array();
		
		System.out.println("The time taken to sort: " + time + " ms");
	}
}
