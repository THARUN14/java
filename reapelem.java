class reapelem
{
    public static void main(String args[])
    {
        String a[]=new String[args.length];
        int k=0;
        for(int i=0;i<args.length;i++)
        {
            for(int j=0;j<args.length;j++)
            {
                if(i==j)
                {
                    
                }
                else
                {
                    if(args[i].equals(args[j]))
                    {
                        a[k]=args[i];
                        k++;
                    }
                }
            }
        }
        System.out.print(a[0]);
    }
}
