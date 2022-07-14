#include<stdio.h>
int main()
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
	int key, f=0, l=size-1, m;
	printf("Enter the element to be searched: ");
	scanf("%d", &key);
	while(f<=l)
	{
		m=(f+l)/2;
		if(key==a[m])
		{
			printf("%d is found at location %d", key, m+1);
			return 0;
		}
		else if(key>a[m])
		{
			f=m+1;
		}
		else
		{
			l=m-1;
		}
	}
	printf("%d is not found\n", key);
	return 0;
}
