//Matrix Multiplication
#include<stdio.h>
void main()
{
	int r1, c1, r2, c2, i, j, k, sum;
	printf("Enter the rows and columns of matrix 1: ");
	scanf("%d %d", &r1, &c1);
	printf("Enter the rows and columns of matrix 2: ");
	scanf("%d %d", &r2, &c2);
	int a[r1][c1], b[r2][c2], c[r1][c2];
	if(c1==r2)
	{
		printf("Enter the elements of matrix 1: ");
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c1; j++)
			{
				scanf("%d", &a[i][j]);
			}
		}
		//Printing the entered matrix
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c1; j++)
			{
				printf("%d ", a[i][j]);
			}
			printf("\n");
		}
		
		printf("Enter the elements of matrix 2: ");
		for(i=0; i<r2; i++)
		{
			for(j=0; j<c2; j++)
			{
				scanf("%d", &b[i][j]);
			}
		}
		//Printing the entered matrix
		for(i=0; i<r2; i++)
		{
			for(j=0; j<c2; j++)
			{
				printf("%d ", b[i][j]);
			}
			printf("\n");
		}
		
		//Logic for matrix multiplication
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c2; j++)
			{
				sum = 0;
				for(k=0; k<r2; k++)
				{
					sum = sum + (a[i][k] * b[k][j]);
				}
				c[i][j] = sum;
			}
		}
		//Printing matrix after multiplication
		printf("Matrix after multiplication: \n");
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c2; j++)
			{
				printf("%d ", c[i][j]);
			}
			printf("\n");
		}
	}
	else
	{
		printf("Matrix multiplication not possible! \n");
	}
}
