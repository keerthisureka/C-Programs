#include<stdio.h>
int btod(int); //Funtion Declaration
int main()
{
	int bin, dec;
	printf("Enter the binary number: ");
	scanf("%d", &bin);
	dec = btod(bin); //Function Call and Arguments
	printf("Decimal value= %d\n", dec);
	return 0;
}
int btod(int b)  //Function Definition
{
	if(b==0)
	{
		return 0;
	}
	return(btod(b/10)*2 + b%10);
}
