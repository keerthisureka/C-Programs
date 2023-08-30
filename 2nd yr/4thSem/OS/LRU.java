package OS;
import java.util.*;


// Program to implement the LRU page replacement algorithm. Compute the page faults for a given reference string.
public class LRU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the reference string: "); // Ex: 7 0 1 2 0 3 0 4 2 3 0 3 2 1 2 0 1 7 0 1
		String s = sc.nextLine();
		String[] refstr = s.split(" ");
		
		ArrayList<Integer> ref = new ArrayList<Integer>();
		for(int i=0; i<refstr.length; i++) {
			ref.add(Integer.parseInt(refstr[i]));
		}
		
		System.out.print("Enter the number of frames: "); // Ex: 3
		int n = sc.nextInt();
		ArrayList<Integer> frames = new ArrayList<Integer>();
		int count = 0;
		
		if(ref.size()<=n) {
			for(int i=0; i<ref.size(); i++) {
				if(!frames.contains(ref.get(i))) {
					frames.add(ref.get(i));
					count++;
				}
			}
			System.out.println("Page Faults: " + count);
			System.exit(0);
		}
		else {
			for(int i=0; i<ref.size(); i++) {
				if(!frames.contains(ref.get(i)) && frames.size()<n) {
					frames.add(ref.get(i));
					count++;
					System.out.println(frames);
				}
				else if(!frames.contains(ref.get(i))) {
					ArrayList<Integer> arr = new ArrayList<Integer>();
					for(int u=0; u<n; u++) {
						for(int j=i-1; arr.size()!=(u+1); j--) {
							if(frames.get(u) == ref.get(j))
								arr.add(j);
						}
					}
					int min = arr.indexOf(Collections.min(arr));
					frames.set(min, ref.get(i));
					count++;
					System.out.println(frames);
				}
			}
			System.out.println("Page Faults: " + count); // Ex: Page Faults: 12
			System.exit(0);
		}
	}
}
