import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        String a="aaabbbbbccdddaaa";
        int c=1;
        String res="";
        for(int i=0;i<a.length()-1;i++)
        {
            if((i-1)<a.length()&&a.charAt(i)==a.charAt(i+1))
            {
                c++;
            }
            else
            {
                res=res+a.charAt(i);
                res=res+c;
                c=1;
            }
        }
        System.out.print(res);  
    }
}
