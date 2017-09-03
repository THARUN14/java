import java.util.*;

public class prisoners {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int pri=sc.nextInt();
        int pris[]=new int[pri+1];
        for(int i=1;i<=pri;i++)
        {pris[i]=i;}
        int spri=sc.nextInt();
        sc.nextLine();
        Set<Integer> min=new TreeSet<Integer>();
        String  selpr[]=sc.nextLine().split(" ");
        Arrays.sort(selpr);
        Collections.rotate(Arrays.asList(selpr),(selpr.length/2));
        for(int i=0;i<spri;i++)
        {
            int selpri=Integer.valueOf(selpr[i]);
            pris[selpri]=999;
            int gold=0;
            if(i==0)
            {
               gold+=(pri-1);
            }
            else
            {
                int rev=selpri-1;
                int fro=selpri+1;
                for(int jh=rev;jh>0;jh--)
                {
                    if(pris[jh]!=999)
                    gold++;
                    else
                        break;
                }
                for(int jh1=fro;jh1<=pri;jh1++) {
                    if (pris[jh1] != 999)
                        gold++;
                    else
                        break;
                }
            }
            System.out.println(selpri+" "+gold);
        }
    }
}
