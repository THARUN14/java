import java.util.*;

public class pro33 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String xx=sc.next();
        List str=new ArrayList();
        for(int i=0;i<xx.length();i++)
        {for(int j=i+1;j<=xx.length();j++)
        {       str.add(xx.substring(i,j));
        }}
        Collections.sort(str);
        int size=str.size();
         System.out.print(str.get(size-1));
    }
}
