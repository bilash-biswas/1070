import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int X,i;
    X = input.nextInt();
    if(X % 2 == 0)
    {
        for(i = 1;i < 12;i = i + 2)
        {
         System.out.printf("%d\n", X + i);
        }
    }
    else
    {
       for(i = 2;i <= 12;i += 2)
        {
         System.out.printf("%d\n", X + i);
        }
     }
  }   
}
