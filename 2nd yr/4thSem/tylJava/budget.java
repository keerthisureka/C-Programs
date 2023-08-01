import java.util.*;
public class budget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] max = new int[T];
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			max[i] = -1;
			for(int j=0; j<N; j++) {
				int W = sc.nextInt();
				int H = sc.nextInt();
				int P = sc.nextInt();
				if(P<=B) {
					int temp = W*H;
					if(temp>max[i])
						max[i] = temp;
				}
			}
		}
		for(int i=0; i<T; i++) {
			System.out.println(max[i]);
		}
	}
}
//You have a Budget of B rupees and you want to buy a Laptop. You cannot buy a 
//Laptop whose price is greater than B, and you also want your laptop Screen to be as big as possible.
//The first line of input contains number of Test Cases denoted by T
//The first line of each test case contains N,B denoting Number of phones you Searched and Budget
//The N lines contains values W, H,P denoting Width, Length and Price of Laptop 
//Return the Size of screen which you should buy and if not possible return -1
//
//Example:
//2
//3 6
//3 4 4
//5 5 7
//5 2 5
//2 6
//3 6 8
//5 4 9
//Output:
//12
//-1
