class coupri
{
    public static void main(String args[])
    {
        int frs=Integer.parseInt(args[0]);
        int lst=Integer.parseInt(args[1]);
        int y=0;
        for(int i=frs+1;i<lst;i++)
        {
            int x=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    x++;
                }
            }
            if(x==0)
            {
                y++;
            }
        }
        System.out.print(y);
    }
}

