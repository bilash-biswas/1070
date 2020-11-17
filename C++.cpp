#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
   int X,i;
    cin>>X;
    if(X % 2 == 0)
    {
        for(i = 1;i < 12;i = i + 2)
        {
         cout<<X + i<<endl;
        }
    }
    else
    {
       for(i = 2;i <= 12;i += 2)
        {
         cout<<X + i<<endl;
        }
    }
    return 0;
}
