class bcount
{
public static void main(String args[])
{
int x=Integer.parseInt(args[0]);
int c=0;
while(x>0)
{
x=x/10;
c++;
}
System.out.println(c);
}
}