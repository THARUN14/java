class bprime
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int f=0;
for(int i=2;i<a;i++)
{
if(a%i==0)
{
f=1;
}
}
if(f==1)
{
System.out.print("Not prime");
}
else
{
System.out.print("prime");
}
}
}