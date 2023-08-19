package tyljava;
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