class reverse
{
public static void main(String args[])
{
char[] a=args[0].toCharArray();
String b="";
int i=a.length;
while(i>0)
{
b=b+a[i];
i--;
}
System.out.print(b);
}
}
