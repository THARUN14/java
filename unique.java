class unique
{
    public static void main(String args[])
    {
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
                      args[i]="*";
                      args[j]="*";
                  }
              }
          }
      }
      for(int k=0;k<args.length;k++)
      {
          if(args[k]!="*")
          {
              System.out.print(args[k]);
          }
      }
    }
}

