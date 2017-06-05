import java.util.*;
class camse
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String y=x.nextLine();
        String res="";
        char fst=y.charAt(0);
        res=res+Character.toUpperCase(fst);
        for(int i=1;i<y.length();i++)
        {
            char cur=y.charAt(i);
            char pre=y.charAt(i-1);
            if(pre==' ')
            {
                res=res+Character.toUpperCase(cur);
            }
            else
            {
                res=res+cur;
            }
        }
        System.out.print(res);
        
    }
}
