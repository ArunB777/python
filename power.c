#include<stdio.h>
int power(int m,int n)
{
    if(n==0)
        return 1;
    return power(m,n-1)*m;
}
int pow1(int m,int n)
{
    if(n==0)
        return 1;
    if(n%2==0)
        return pow1(m*m,n/2);
    return m *pow1(m*m,(n-1)/2);
}
int main()
{
    int r=pow1(2,5);
    printf("%d ",r);

    return 0;
}