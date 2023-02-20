#include<stdio.h>
#include<stdlib.h>
struct tree
{
	struct tree *lchild;
	int data;
	struct tree *rchild;
};

struct tree *newnode(int data)
{
	struct tree *node = (struct tree *)malloc(sizeof(struct tree));
	node->data=data;
	node->lchild=node->rchild=NULL;
	return node;
}

struct tree *insertLevelOrder(int arr[], int i, int n)
{
	struct tree *root=NULL;
	if(i<n)
	{
		root=newnode(arr[i]);
		root->lchild=insertLevelOrder(arr, 2*i+1, n);
		root->rchild=insertLevelOrder(arr, 2*i+2, n);
	}
	return root;
}

void inorder(struct tree *temp)
{
	if(temp!=NULL)
	{
		inorder(temp->lchild);
		printf("%d ", temp->data);
		inorder(temp->rchild);
	}
}

void preorder(struct tree *temp)
{
	if(temp!=NULL)
	{
		printf("%d ", temp->data);
		preorder(temp->lchild);
		preorder(temp->rchild);
	}
}

void postorder(struct tree *temp)
{
	if(temp!=NULL)
	{
		postorder(temp->lchild);
		postorder(temp->rchild);
		printf("%d ", temp->data);
	}
}

void main()
{
	int arr[]={1,2,3,4,5,6};
	int n=sizeof(arr)/sizeof(arr[0]);
	struct tree *root=insertLevelOrder(arr, 0, n);
	printf("\nInorder is:\n");
	inorder(root);
	printf("\nPreorder is:\n");
	preorder(root);
	printf("\nPostorder is:\n");
	postorder(root);
}
