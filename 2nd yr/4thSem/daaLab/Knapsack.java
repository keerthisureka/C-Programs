import java.util.Scanner; 
class Knapsack 
{
	static int object, m;
	static int weight[], profit[]; 
	static double p_w[];
	public static void display() {
		System.out.print("Objects\t");
		for(int i=1; i<=object; i++)
		{
			System.out.print(i+"    ");
		}
		System.out.println();
		System.out.print("Profit\t");
		for(int i=0; i<object; i++)
		{
			System.out.print(profit[i]+"    ");
		}
		System.out.println();
		System.out.print("Weight\t");
		for(int i=0;i<object;i++)
		{
			System.out.print(weight[i]+"    ");
		}
		System.out.println();
		System.out.print("P/W\t");
		for(int i=0;i<object;i++)
		{
			System.out.print(p_w[i]+"  ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the total number of objects: ");
		object=sc.nextInt();
		System.out.print("Enter the knapsack capacity: ");
		m=sc.nextInt();
		
		// Accepting Input
		weight=new int[object]; 
		profit=new int[object];
		p_w=new double[object];
		for(int i=0; i<object; i++) 
		{
			System.out.print("\nEnter the profit: "); 
			profit[i]=sc.nextInt();
			System.out.print("Enter the weight: "); 
			weight[i]=sc.nextInt();
			p_w[i]=(double)profit[i]/(double)weight[i];
		}
		
		// Display entered data and p/w ratios
		System.out.println("\n\n------------Data-Set--------------");
		display();
		
		// Sorting
		for(int i=0;i<object-1;i++)
		{
			for(int j=i+1;j<object;j++)
			{
				if(p_w[i]<p_w[j])
				{
					double temp=p_w[j];
					p_w[j]=p_w[i];
					p_w[i]=temp;
					
					int temp1=profit[j];
					profit[j]=profit[i];
					profit[i]=temp1;
					
					int temp2=weight[j];
					weight[j]=weight[i];
					weight[i]=temp2;
				}
			}
		}
		
		// Display sorted data
		System.out.println("\n\n---------After Arranging-----------");
		display();
		
		// Calculating final profit
		int k=0;
		double sum=0;
		System.out.println();
		while(m>0)
		{
			if(weight[k]<m)
			{
				sum += profit[k];
				m = m-weight[k];
				k++;
			}
			else
			{
				double x = (double)(m*profit[k])/weight[k];
				sum += x;
				m=0;
			}
		}
		System.out.println("\nFinal Profit is = " + sum);
	}
}