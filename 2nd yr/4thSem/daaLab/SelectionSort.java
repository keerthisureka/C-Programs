import java.util.Random;
import java.util.Scanner;

class ssort {
	int n;
	int arr[];
	//Create an array with random numbers
	//User specifies the number of random elements
	
	public void create_array(int n, int choice) {
		//choice = 0 for elements already in sorted order
		//choice = 1 for elements already sorted in reverse order
		//choice = 2 for random elements
		this.n = n;
		arr = new int[n];
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
	}
	
	public void swap(int min, int j) {
		int temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}
	
	public void sort() {
		int min, i, j;
		for(i=0; i<n-2; i++)
		{
			min = i;
			for(j=i+1; j<n; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			swap(min, i);
		}
	}
	
	public void print_array() {
		for(int i=0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
		}
		System.out.println("\n");
	}
}


public class SelectionSort {

	public static void main(String[] args) {
		long start, end, time;
		ssort sort_obj = new ssort();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements: ");
		int n = sc.nextInt();
		System.out.println("Ener the choice : ");
		int ch = sc.nextInt();
		
		sort_obj.create_array(n, ch);
		
		System.out.println("The array elements before sorting: ");
		sort_obj.print_array();
		
		start = System.nanoTime();
		sort_obj.sort();
		end = System.nanoTime();
		time = (end-start)/1000000;
		
		System.out.println("The array elements after sorting: ");
		sort_obj.print_array();
		
		System.out.println("The time taken to sort: " + time + " ms");
	}
}
