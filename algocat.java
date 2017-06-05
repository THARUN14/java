import java.util.Arrays;
import java.util.*;
class algocat
{
    public static void main(String args[])
    {
        Arrays.sort(args,Collections.reverseOrder());
        String x="";
        for(int i=0;i<args.length;i++)
        {
            x+=args[i];
        }
        System.out.println(x);
        System.out.print("order of #s: ");
        for(int j=0;j<args.length;j++)
        {
            System.out.print(args[j]+" ");
        }
    }
}
