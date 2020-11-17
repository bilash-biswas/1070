using System.IO;
using System;

class Program
{
    static void Main()
    {
    int X,i;
    X = Convert.ToInt32(Console.ReadLine());
    if(X % 2 == 0)
    {
        for(i = 1;i < 12;i = i + 2)
        {
         Console.WriteLine(X + i);
        }
    }
    else
    {
       for(i = 2;i <= 12;i += 2)
        {
         Console.WriteLine(X + i);
        }
    }
    Console.ReadLine();
    }
}
