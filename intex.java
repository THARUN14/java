import java.util.*;
class intex
{
    public  void find(int a,String x)
    {
        int y=Integer.valueOf(x);
              if(y==a)
        {
            System.out.print("the number is equal to index " +a);
        }
    }
    public static void main(String args[])
    { intex ex=new intex();
             for(int i=0;i<args.length;i++)
        {
            ex.find(i,args[i]);
        }
    }
}
