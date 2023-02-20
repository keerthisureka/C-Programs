//Quadratic Equation
#include<stdio.h>
#include<math.h>
void main()
{
	//variable declaration
	float a, b, c, d, r1, r2, rpart, ipart;
	printf("Enter the coefficients: ");
	scanf("%f%f%f", &a, &b, &c);
	d=(b*b)-4*a*c;
	if(a!=0)
	{
		if(d==0)
		{
			r1=-b/(2*a);
			r2=r1;
			printf("The roots are equal r1=%f and r2=%f\n", r1, r2);
		}
		else if(d>0)
		{
			r1=(-b+sqrt(d))/(2*a);
			r2=(-b-sqrt(d))/(2*a);
			printf("The roots are real and distinct r1=%f and r2=%f\n", r1, r2);
		}
		else
		{
			rpart=-b/(2*a);
			ipart=sqrt(-d)/(2*a);
			printf("The roots are imaginary r1=%f+i%f and r2=%f-i%f\n", rpart, ipart, rpart, ipart);
		}
	}
	else
	{
		printf("Not a quadratic equation \n");
	}
}
