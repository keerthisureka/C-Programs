#include<stdio.h>
#include<stdlib.h>
struct node
{
	struct node *prev;
	int data;
	struct node *next;
};
struct node *start=NULL;
int ele, pos, c=0;

struct node *create(struct node *start)
{
	struct node *newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter the element: ");
	scanf("%d", &ele);
	newnode->data=ele;
	while(ele!=0)
	{
		struct node *newnode=(struct node *)malloc(sizeof(struct node));
		newnode->data=ele;
		if(start==NULL)
		{
			newnode->prev=NULL;
			newnode->next=NULL;
			start=newnode;
		}
		else
		{
			struct node *ptr;
			ptr=start;
			while(ptr->next!=NULL)
			{
				ptr=ptr->next;
			}
			newnode->prev=ptr;
			newnode->next=NULL;
			ptr->next=newnode;
		}
		printf("Enter the element: ");
		scanf("%d", &ele);
	}
	return start;
}

struct node *display(struct node *start)
{
	struct node *ptr;
	ptr=start;
	while(ptr!=NULL)
	{
		printf("%d	", ptr->data);
		ptr=ptr->next;
	}
	printf("\n");
	return start;
}

struct node *count(struct node *start)
{
	c=0;
	struct node *ptr;
	ptr=start;
	while(ptr!=NULL)
	{
		ptr=ptr->next;
		c+=1;
	}
	return start;
}

struct node *insert(struct node *start, int ele)
{
	struct node *newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter the position at which the element is to be inserted: ");
	scanf("%d", &pos);
	newnode->data=ele;
	struct node *ptr, *preptr;
	ptr=start;
	start = count(start);
	if(pos>c)
	{
		while(ptr->next!=NULL)
			ptr=ptr->next;
		ptr->next=newnode;
		newnode->prev=ptr;
		newnode->next=NULL;
		return start;
	}
	
	while(pos>1)
	{
		pos-=1;
		ptr=ptr->next;
	}
	if(ptr==start)
	{
		newnode->next=ptr;
		newnode->prev=NULL;
		ptr->prev=newnode;
		start=newnode;
	}
	else
	{
		preptr=ptr->prev;
		preptr->next=newnode;
		newnode->prev=preptr;
		newnode->next=ptr;
		ptr->prev=newnode;
	}
	return start;
}
struct node *delet(struct node *start)
{
	struct node *ptr;
	ptr=start;
	printf("Enter the element to be deleted: ");
	scanf("%d", &ele);
	while(ptr->data!=ele)
		ptr=ptr->next;
	if(ptr==start)
	{
		start=ptr->next;
		start->prev=NULL;
	}
	else if(ptr->next==NULL)
	{
		ptr->prev->next=NULL;
	}
	else
	{
		ptr->prev->next=ptr->next;
		ptr->next->prev=ptr->prev;
	}
	free(ptr);
	return start;
}

void main()
{
	int ch;
	while(1)
	{
		printf("\n---------MENU--------\n1.Create\n2.Insert\n3.Delete\n4.Display\n5.Count\n6.Exit\nEnter your choice: ");
		scanf("%d", &ch);
		switch(ch)
		{
			case 1: start = create(start);
				break;
			case 2: printf("Enter the element to be inserted: ");
				scanf("%d", &ele);
				start = insert(start, ele);
				break;
			case 3: start = delet(start);
				break;
			case 4: start = display(start);
				break;
			case 5: start = count(start);
			    	printf("The total number of nodes are: %d\n", c);
				break;
			case 6: exit(0);
			default: printf("Invalid Input!\n");
		}
	}
}
