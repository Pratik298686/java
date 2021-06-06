/*5. Accept on character from user and check whether that character is vowel  (a,e,i,o,u) or not.  
Input : E   Output : TRUE  
Input : d   Output : FALSE  */
import java.lang.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Program5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    //character input
    char c = sc.next().charAt(0);
    System.out.println("c ="+c);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
    System.out.println("yes it is voewl");
}
else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
    System.out.println("yes it is vowel");
}
else
{
    System.out.println("it is not vowel");  
}
    }
    
}