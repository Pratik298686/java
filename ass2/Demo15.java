import java.util.Scanner;
// no from user and check whether that number is amstrong number or not
// ip ; 153
// OP : true (1^3 + 5^3 +3^3) = 153 -> 3 is number of Digit
import java.util.*;
import java.lang.*;

class Numbers
{
     int amstrong(int iNo)
     {
         int iDigit = 0,iMult = 1,iSum = 0;
         while(iNo!=0)
         {
            iDigit = iNo % 10 ;
            iMult = 1;
            for(int i= 1; i<=3; i++)
            {
                iMult = iMult * iDigit ; 
            }
            iSum = iSum + iMult ;
            iNo = iNo/10;
         }
         return iSum;
     }
}
class Demo15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the element");
        int value = sobj.nextInt();

        Numbers nobj = new Numbers();
        int ret = nobj.amstrong(value);
        System.out.println("amtring digit id : \n"+ret);

    }
}
