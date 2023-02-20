#include<stdio.h>
#define MAX 5
int adj[][MAX]={{0,1,0,1,0},{1,0,1,1,0},{0,1,0,0,1},{1,1,0,0,1},{0,0,1,1,0}};

void bfs()
{
	int visited[MAX]={0};
	int start=0;
	int r,f,i;
	r=f=-1;
	int q[MAX];
	q[++r]=start;
	visited[start]=1;
	while(r!=f)
	{
		start=q[++f];
		printf("%d->", start);
		for(i=0;i<MAX;i++)
		{
			if(adj[start][i]==1 && visited[i]==0)
			{
				q[++r]=i;
				visited[i]=1;
			}
		}
	}
}

void dfs(int start)
{
	int visited[MAX]={0};
	int stack[MAX];
	int TOP=-1, i;
	printf("%d->", start);
	visited[start]=1;
	stack[++TOP]=start;
	while(TOP!=-1)
	{
		start=stack[TOP];
		for(i=0;i<MAX;i++)
		{
			if(adj[start][i]==1 && visited[i]==0)
			{
				stack[++TOP]=i;
				printf("%d->", i);
				visited[i]=1;
				break;
			}
		}
		if(i==MAX)
			TOP--;
	}
}

int main()
{
	printf("\nBFS:\n");
	bfs();
	printf("\nDFS:\n");
	dfs(0);
	return 0;
}
