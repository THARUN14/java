class algonce
{
    public static void main(String args[])
    {
      for(int i=0;i<args.length;i++)
      {
          int count=0;
          for(int j=0;j<args.length;j++)
          { 
             
              if(i!=j)
              {
                  if(args[i].equals(args[j]))
                  {
                      count++;
                  }
              }
          }
          if(count==0)
          {
              System.out.print(args[i]);
          }
      }
    }
}





