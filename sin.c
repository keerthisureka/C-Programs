//Program to compute sinx using taylor series
#include<stdio.h>
#include<math.h>
#define PI 3.142857
int main()
{
	float deg, x, nume, deno, sum, term;
	int i;
	printf("Enter degree: ");
	scanf("%f", &deg);
	//Convert degree to radians
	x=deg*(PI/180.0);
	nume=x;
	deno=1;
	i=1;
	sum=0;
	do
	{
		term=nume/deno;
		sum=sum+term;
		nume=(-nume)*x*x;
		i=i+2;
		deno=deno*i*(i-1);
	}while(fabs(term)>0.00001);
	printf("Computed value of sin(%.2f) = %.2f\n", deg, sum);
	printf("Value obtained from built-in function sin(%.2f) = %.2f\n", deg, sin(x));
	return 0;
}
