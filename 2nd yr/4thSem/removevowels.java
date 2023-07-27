package tyljava;

import java.util.*;
public class removevowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s);
	}
}
//Write a function that takes a string and returns a new string with all the vowels removed.
//EX: "WELCOME TO OUR EVENT"             OUTPUT: "WLCM T R VNT"