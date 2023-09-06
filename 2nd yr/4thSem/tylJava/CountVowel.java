package tyljava;
import java.util.*;

public class CountVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] s = a.toCharArray();
		int c = 0;
		
		for(int i=0; i<s.length; i++) {
			if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] =='A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
				c++;
		}
		System.out.println("The number of vowels is " + c);
	}
}

// Display the count of vowels in a string.