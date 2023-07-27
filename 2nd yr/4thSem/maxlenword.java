package tyljava;

import java.util.*;
public class maxlenword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<String> a = new ArrayList<String>();
		for(String val: s.split(" ")) {
			a.add(val);
		}
		
		int n = a.size();
		if(n%2 == 0) {
			if(a.get(n/2).length() > a.get(n/2-1).length()) {
				System.out.println(a.get(n/2).length());
			}
			else {
				System.out.println(a.get(n/2-1).length());
			}
		}
		else {
			System.out.println(a.get(n/2).length());
		}
	}
}
//Take input of a sentence and PRINT the Length of Middle word in the sentence and
//if they are two middle elements than print the one which has maximum length.
//EX: "WELCOME TO CODECHEF EVENT"         OUTPUT: 8