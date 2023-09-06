import java.util.*;

public class BracketNumbersStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Integer> st = new Stack<Integer>();
		int c = 1;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.push(c++);
				System.out.print(st.peek() + " ");
			}
			if(s.charAt(i) == ')') {
				System.out.print(st.peek() + " ");
				st.pop();
			}
		}
	}
}

// Displaying Bracket Numbers during both open and close brackets.
// Input: (a+(b*c))+(d/e)
// Output: 1 2 2 1 3 3
