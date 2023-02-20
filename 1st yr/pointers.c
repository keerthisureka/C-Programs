#include<stdio.h>
#include<math.h>
void main()
{
	int n, i;
	printf("Enter the size of the array: ");
	scanf("%d", &n);
	int a[n];
	int *ptr;
	ptr=a;
	
	//Input the elements from the user
	printf("Enter the elements: ");
	for(i=0; i<n; i++)
	{
		scanf("%d", ptr);
		ptr++;
	}
	
	//Sum
	float sum=0;
	ptr=a;
	for(i=0; i<n; i++)
	{
		sum = sum + *ptr;
		ptr++;
	}
	
	//Mean
	float mean;
	mean = sum/n;
	
	//Variance
	float var=0;
	ptr=a;
	for(i=0; i<n; i++)
	{
		var = var + pow((*ptr-mean),2);
		ptr++;
	}
	var = var/n;
	
	//Standard Deviation
	float sd;
	sd = sqrt(var);
	
	printf("Mean= %f\n", mean);
	printf("Variance= %f\n", var);
	printf("Standard Deviation= %f\n", sd);
}
