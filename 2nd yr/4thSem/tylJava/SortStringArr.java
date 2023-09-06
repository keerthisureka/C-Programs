package tyljava;
import java.util.*;

public class SortStringArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

// Sorting on array of string.