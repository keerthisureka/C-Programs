package tyljava;

import java.util.*;
public class consecutive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] a = new char[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.next().charAt(0);
		}
		
		String s = new String(a);
		s = s.toUpperCase();
		String newstr = "";
		int i = 0;
	    int j = 0;
	    while (j < s.length()) {
	      if (s.charAt(i) != s.charAt(j) && j == s.length()-1) {
	    	  newstr += s.charAt(i);
	    	  newstr += s.charAt(j);
	    	  j++;
	      }
	      else if (s.charAt(i) != s.charAt(j) || j == s.length()-1) {
	    	  newstr += s.charAt(i);
	    	  i = j;
	    	  j++;
	      }
	      else if (s.charAt(i) == s.charAt(j)) {
	    	  j++;
		  }
	    }
	    System.out.println(newstr);
	}
}
//Take input for a number N and then input of a char array whose length is N,
//convert it into a String such that no two consecutive same letters occur together
//EX: arr= ['B','R','O','C', 'O','D','E']  N=8   
//OUTPUT:BROCODE                                                                                                            
//arr = ['H','E','L','L','L','O'] N=6
//OUTPUT:HELO