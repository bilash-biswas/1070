import java.util.Scanner

fun main(args: Array<String>){
    val input = Scanner(System.`in`);
    var i:Int;
    var X = input.nextInt();
    if(X % 2 == 0)
    {
        for(i in 1..12 step 2)
        {
            System.out.printf("%d\n", X + i);
        }
    }
    else
    {
        for(i in 0..10 step 2)
        {
            System.out.printf("%d\n", X + i);
        }
    }
}

