
// Accet no from user and Display that number is fib number or not
// ip ; 10
// OP : 0 1 1 2 3 5 8 13 21
// ip ; 40
// OP : 0 1 1 2 3 5 8 13 21 34
import java.util.*;
import java.lang.*;

class Numbers
{
     void fib(int iNo)
     {
        int First = 0,Second = 1,Third = 0;
        for(; First<=iNo; )         //while(First<=iNo) //0 1
        {
            System.out.println(First+"\t");
            Third = First + Second ;                   //1 2
            First = Second;                            //1 
            Second = Third;                            //1
        }
     }
}
class Demo16
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the element");
        int value = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.fib(value);

    }
}

