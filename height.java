import java.util.*;
import java.util.Arrays;
class height
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int x1=x.nextInt();
        double x2[]=new double[x1];
        for(int i=0;i<x1;i++)
        {
            x2[i]=x.nextDouble();
        }
        Arrays.sort(x2);
        System.out.println(x2[x1-4]);
        int j=x.nextInt();
        System.out.println(x2[x1-j]);
    }
}
