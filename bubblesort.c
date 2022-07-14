#include<stdio.h>
void main()
{
	int size, i, j, temp;
	printf("Enter the number of elements you want to enter: ");
	scanf("%d", &size);
	int a[size];
	printf("Enter the elements: ");
	for(i=0; i<size; i++)
	{
		scanf("%d", &a[i]);
	}
	for(i=0;i<size-1;i++)
	{
		for(j=0;j<size-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	printf("Elements after sorting: \n");
	for(i=0; i<size ; i++)
	{
		printf("%d\n", a[i]);
	}
}
