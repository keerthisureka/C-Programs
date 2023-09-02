import java.util.*;

class Knapsack01 {
	int[] weights;
	int[] values;
	int objects, W;
	int[][] table;
	int i, j;
	int[][] keep;
		
	Knapsack01(Scanner sc) {
		System.out.println("Enter no. of objects and total weights: ");
		objects = sc.nextInt();
		W = sc.nextInt();
		values = new int[objects+1];
		weights = new int[objects+1];
		table = new int[objects+1][W+1];
		keep = new int[objects+1][W+1];
		for(i=1; i<=objects; i++) {
			System.out.printf("Enter %d object value and weight: ", i);
			values[i] = sc.nextInt();
			weights[i] = sc.nextInt();
		}
		value();
	}
			
	void value() {
		for(i=0; i<W+1; i++) {
			table[0][i] = 0;
			keep[0][i] = 0;
		}
		for(i=0; i<objects+1; i++) {
			keep[0][i] = 0;
			table[i][0] = 0;
		}
		for(i=1; i<objects+1; i++) {
			 for(j=1; j<W+1; j++) {
				 if(weights[i]<=j && (table[i-1][j])<(table[i-1][j-weights[i]]+values[i])) {
					 table[i][j] = table[i-1][j-weights[i]]+values[i];
					 keep[i][j] = 1;
				 }
				 else {
					 table[i][j] = table[i-1][j];
					 keep[i][j] = 0;
				 }
			 }
		}
		System.out.printf("Value = %d\n", table[objects][W]);
		for(i=0; i<objects+1; i++) {
			for(j=0; j<W+1; j++)
				System.out.printf("%d\t", keep[i][j]);
			System.out.println();
		}
		System.out.println("Selected objects are: ");
		int n = objects;
		int Wt = W;
		for(i=n; i>0; i--) {
			if(keep[i][Wt] == 1) {
				System.out.println(i);
				Wt = Wt-weights[i];
			}
		}
	}
}

public class MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Knapsack01 obj = new Knapsack01(sc);
	}
}