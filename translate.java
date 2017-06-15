import java.util.*;
class translate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x1=sc.next();
        int c=0;
        int m=x1.length();
        int x=0;
        int a=0;
        for(int i=0;i<m*m;i++)
        {int k=0;
            x++;
            for(int j=0;j<m;j=j+x)
            {
                if(j+x<m)
              a=Integer.valueOf(x1.substring(j,j+x));
                if(a>26)
                {k++;
                }
            }
            if(k==0)
            {
                c++;
            }
        }
        System.out.print(c);
        
    }
}
