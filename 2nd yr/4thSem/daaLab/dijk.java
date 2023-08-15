import java.util.*;
public class dijk {
	static int minimum(int d[],int vis[],int n) {
		int min=999,min_index=-1;
		for(int i=0;i<n;i++) {
			if(vis[i]==0 && d[i]<=min) {
				min=d[i];
				min_index=i;
			}
		}
		return min_index;
	}
	static void print_s(int d[],int n) {
		System.out.println("Result:");
		for(int i=0;i<n;i++) {
			System.out.println("Distance from source to " + i +": " + d[i]);
		}
	}
	static void dijkstra(int adj[][],int src,int n) {
		int d[]=new int[n];
		int vis[]=new int[n];
		for(int i=0;i<n;i++) {
			d[i]=999;
			vis[i]=0;
		}
		d[src]=0;
		for(int j=0;j<n-1;j++) {
			int u=minimum(d,vis,n);
			vis[u]=1;
			for(int i=0;i<n;i++) {
				if(vis[i]==0 && adj[u][i]!=0 && d[u]!=999 && d[u]+adj[u][i]<d[i]) {
					d[i]=d[u]+adj[u][i];
				}
			}
		}
		print_s(d,n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n=sc.nextInt();
		int adj[][]=new int[n][n];
		System.out.println("Enter adjacency matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				adj[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter source:");
		int src=sc.nextInt();
		dijkstra(adj,src,n);
	}
}