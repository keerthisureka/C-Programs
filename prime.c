#include<stdio.h>
void main()
{
	int n, f, count=0;
	printf("Enter a number: ");
	scanf("%d", &n);
	for(int i=1; i<=n; i++)
	{
		f=n%i;
		if(f==0)
		{
			count=count+1;
		}
	}
	if(count==2)
	{
		printf("%d is a prime number\n", n);
	}
	else
	{
		printf("%d is not a prime number\n", n);
	}
}
