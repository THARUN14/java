import java.util.ArrayList;
import java.util.Scanner;

public class pro21 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr_size=sc.nextInt();
        int arr[]=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int pos=0;
        for(int i=1;i<=arr_size;i++)
        {
            int sum1=0;
            int sum2=0;
            for(int j=0;j<i;j++)
            {
             sum1+=arr[j];
            }
            for(int k=i;k<arr_size;k++)
            {
                sum2+=arr[k];
            }
            sum1=sum1/i;
            if(arr_size-i!=0)
            {sum2=sum2/(arr_size-i);}
            if(sum1==sum2)
            {
                pos=i;
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Impossible");
        }
        else {
            ArrayList<Integer> al = new ArrayList<Integer>();
            ArrayList<Integer> al2 = new ArrayList<Integer>();
            for (int gg = 0; gg < arr_size; gg++) {
                if (gg < pos)
                    al.add(arr[gg]);
                else
                    al2.add(arr[gg]);
            }
            System.out.println(al+" "+al2);
        }

    }
}
