package tyljava;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> newl = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			l.add(Integer.valueOf(arr[i]));
		}
		
		for(int i=0; i<l.size(); i++) {
			if(!newl.contains(l.get(i)))
				newl.add(l.get(i));
		}
		System.out.println(newl);
	}
}

// Remove duplicate elements in an array.