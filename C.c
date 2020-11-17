#include<stdio.h>
#include<math.h>
int main()
{
    int X,i;
    scanf("%d",&X);
    if(X % 2 == 0)
    {
        for(i = 1;i < 12;i = i + 2)
        {
         printf("%d\n", X + i);
        }
    }
    else
    {
       for(i = 2;i <= 12;i += 2)
        {
         printf("%d\n",X + i);
        }
    }
    return 0;
}
