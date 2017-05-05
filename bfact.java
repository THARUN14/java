class bfact
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int x=1;
if(a==0)
{
System.out.println(x);
}
else
{
for(int i=a;i>0;i--)
{
x*=i;
System.out.println(x);

}

}
}
}
