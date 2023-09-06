import java.util.Scanner;

public class LeaderElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		int[] arr = new int[s1.length];
		for(int i=0; i<s1.length; i++) {
			arr[i] = Integer.valueOf(s1[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			int max = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > max) {
					max = arr[j];
				}
			}
			if(max == arr[i]) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

// WAP to display the elements which have all the elements on the right smaller to them
// Ex: 1 6 17 3 4 5 2
// o/p: 17 5 2
// All the elements on the right to 17 are smaller than 17, similarly 5 and 2

// If an element is bigger than every other element to its right, it is considered a leader.
