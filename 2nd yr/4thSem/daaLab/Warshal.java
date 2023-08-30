import java.util.Scanner;

public class Warshal {
	private int dmatrix[][];
	private int n;
	public static final int INFINITY = 999;
	public Warshal(int n) {
		dmatrix = new int[n+1][n+1];
		this.n = n;
	}
	public void floydwarshal(int amatrix[][]) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				dmatrix[i][j] = amatrix[i][j];
			}
		}
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(dmatrix[i][k] + dmatrix[k][j] < dmatrix[i][j])
						dmatrix[i][j] = dmatrix[i][k] + dmatrix[k][j];
				}
			}
		}
		for(int source=1; source<=n; source++)
			System.out.print("\t" + source);
		System.out.println();
		
		for(int source=1; source<=n; source++) {
			System.out.print(source + "\t");
			for(int dest=1; dest<=n; dest++) {
				System.out.print(dmatrix[source][dest] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int wmatrix[][];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of vertices: ");
		n = sc.nextInt();
		wmatrix = new int[n+1][n+1];
		System.out.println("Enter the weighted matrix for the graph: ");
		for(int source=1; source<=n; source++) {
			for(int dest=1; dest<=n; dest++) {
				wmatrix[source][dest] = sc.nextInt();
				if(source == dest) {
					wmatrix[source][dest] = 0;
					continue;
				}
				if(wmatrix[source][dest] == 0) {
					wmatrix[source][dest] = INFINITY;
				}
			}
		}
		System.out.println("Following matrix shows the shortest distances between every pair of vertices");
		Warshal floydwarshal = new Warshal(n);
		floydwarshal.floydwarshal(wmatrix);
		sc.close();
	}
}