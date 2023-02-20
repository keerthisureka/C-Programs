#include<stdio.h>
void main()
{
	int r, c;
	printf("Enter the order of the matrix: ");
	scanf("%d%d", &r, &c);
	int a[r][c];
	printf("Enter the array elements: ");
	for(int i=0; i<r; i++)
	{
		for(int j=0; j<c; j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	printf("Transposed matrix:\n");
	for(int i=0; i<c; i++)
	{
		for(int j=0; j<r; j++)
		{
			printf("%d ", a[j][i]);
		}
		printf("\n");
	}
}
