import java.util.*;
class revorder
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String x1=x.nextLine();
        String x2[]=x1.split(" ");
        for(int i=x2.length-1;i>=0;i--)
        {
            System.out.print(x2[i]+" ");
        }
    }
}
