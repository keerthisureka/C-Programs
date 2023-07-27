import java.util.*;
public class secondlargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split(" ");
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		
		Arrays.sort(b);
		for(int i=b.length-2; i>=0; i--) {
			if(b[i] != b[i+1]) {
				System.out.println(b[i]);
				break;
			}
		}
	}
}
//Given a list of integers, write a function to find the second largest number without using in built functions.
//Arr1= [10,20,30,40,32,76,32,99]                                  OUTPUT = 76
