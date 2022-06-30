#include<stdio.h>
void main()
{
	int n, num, dig=0, r=0;
	printf("Enter a number: ");
	scanf("%d", &n);
	num=n;
	while(n!=0)
	{
		dig=n%10;
		n=n/10;
		r=(r*10)+dig;
	}
	if(r==num)
	{
		printf("%d is a palindrome number\n", num);
	}
	else
	{
		printf("%d is not a palindrome number\n", num);
	}
}
