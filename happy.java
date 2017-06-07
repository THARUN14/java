import java.util.*;
class happy
{
public static void main(String args[])
{
Scanner x1=new Scanner(System.in);
int x=x1.nextInt();
int y=0;
while(x!=1)
{
int z=0;
while(x>0)
{

y=x%10;
z=z+(y*y);
x=x/10;
    }
if(z==1)
{
System.out.print("happy");
System.exit(0);
}
x=z;
}
}
}

