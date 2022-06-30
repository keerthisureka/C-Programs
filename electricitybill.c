//Electricity bill
#include<stdio.h>
int main()
{
	char name[10];
	float units, charge, total;
	printf("Enter your name: ");
	scanf("%s", name);
	printf("Enter the units consumed: ");
	scanf("%f", &units);
	
	if(units>=0 && units<=200)
	{
		charge=units*0.8;
	}
	else if(units>200 && units<=300)
	{
		charge=(200*0.8)+((units-200)*0.9);
	}
	else if(units>300)
	{
		charge=(200*0.8)+(100*0.9)+((units-300)*1);
	}
	else
	{
		printf("Invalid unit\n");
		return 1;
	}
	total=charge+100;
	if(total>400)
	{
		total=total+(0.15*total);
	}
	printf("Total Charge=%f \n", total);
	return 0;
}
