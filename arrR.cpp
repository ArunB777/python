#include<stdio.h>
#include<stdlib.h>
int main()
{
    int *p,*q,i;
    p=(int*)malloc(5*sizeof(int));
    q=(int*)malloc(10*sizeof(int));
    p[0]=3;p[1]=4;p[2]=5;p[3]=6;p[4]=7;
    for(i=0;i<5;i++)
        q[i]=p[i];

    free(q);
    q=p;
    q=NULL;
    for(int i=0;i<5;i++)
    {
        printf("%d \n",p[i]);
    }
    
    return 0;
}