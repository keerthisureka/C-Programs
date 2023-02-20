#include <stdio.h>
#include <stdlib.h>
int ht[10]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
int n=10;
void insert(int key)
{
    int i;
    int hash=key % 10;
    if(ht[hash] == -1)
    {
        ht[hash] = key;
    }
    else
    {
    	int j = 1;
    	while(j<n)
    	{
        	int newhash = (hash+j)%10;
        	if(ht[newhash]==-1)
        	{
        		ht[newhash]=key;
        		break;
        	}
          j++;
        }
    }
}

void display()
{
    int i;
    for(i=0;i<n;i++)
        printf("%d ",ht[i]);
}

void main()
{
    int ch,key;
    while(1)
    {
        printf("\n\n---------MENU---------\n1.Insert\n2.Display\n3.Exit\nChoose your option: ");
        scanf("%d",&ch);
        switch(ch)
	{
            case 1: printf("Enter the element to be inserted: ");
                    scanf("%d",&key);
                    insert(key);
                    break;
            case 2: printf("The elements are:\n");
                    display();
                    break;
            case 3: printf("You have exited!\n");
                    exit(0);
            default: printf("Invalid option");
        }
    }
}
