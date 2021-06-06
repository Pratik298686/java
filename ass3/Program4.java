/*4. Accept one character from user and convert case of that character.  
Input : a   Output : A  
Input : D   Output : d   */

import java.lang.*;
import java.util.*;
import java.lang.String;
class Program4
{
    public static void main(String[] args) {
        Base bobj = new Base();
        bobj.fun();
    }
}
class Base
{
    public void fun()
    {
        System.out.println("to convert lowercase to uppercase");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String st = sc.nextLine();

        char ch[] = st.toCharArray();
        int n= ch.length;

        for(int i=0; i<=n; i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i] = ch[i]+32;
                System.out.println(ch[i]);
            }
            else if(ch[i]>='a' && ch[i]<='z')
            {
                ch[i] = ch[i]-32;
                System.out.println(ch[i]);
            }
        }

    }
}
/*public class Program4
{
   Scanner sc = new Scanner(System.in);
    //character input
    char c = sc.next().char.At(0);
    System.out.println("c ="+c); 
}*/