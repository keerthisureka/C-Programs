import java.util.*;

public class kthLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String[] a = t.split(" ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			int temp = Integer.parseInt(a[i]);
			arr.add(temp);
		}
		
		int k = sc.nextInt();
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("The " + k + " largest element is: " + arr.get(k-1));
	}
}

// Find the kth largest element in the array. It has to take the elements from the array and input k.
