package tyljava;
import java.util.Scanner;

public class ValidShuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(); // abc
		char[] ch1 = s1.toCharArray();
		String s2 = sc.next(); // def
		char[] ch2 = s2.toCharArray();
		String res = sc.next(); // dabecf -- Valid Shuffle
		char[] r = res.toCharArray();
		if((ch1.length + ch2.length) != r.length) {
			System.out.println("Invalid!");
		}
		else {
			int i = 0, j = 0, k = 0;
			while(k!=r.length) {
				if(i<ch1.length && ch1[i] == r[k]) {
					i++;
				}
				else if(j<ch2.length && ch2[j] == r[k]) {
					j++;
				}
				else {
					System.out.println("Invalid!");
					System.exit(0);
				}
				k++;
			}
			
			if(i==ch1.length && j==ch2.length && k==r.length) {
				System.out.println("Valid!");
			}
			else {
				System.out.println("Invalid!");
			}
		}
	}
}

// WAP to check if a string is a valid shuffle of two strings. You are given 3 strings first, second and third.
// Third string is said to be a shuffle of first and second if it can be formed by interleaving the characters of
// first and second string in a way that maintains the left to right ordering of characters in each string.
// Ex: s1="abc"  s2="def"  res="dabecf" -- Valid!
