import java.util.*;
class cheap
{public static void main(String args[])
{Scanner sc=new Scanner(System.in);
String x=sc.next();
String y=sc.next();
StringBuffer x1=new StringBuffer(x);
StringBuffer y1=new StringBuffer(y);
//System.out.print(x1+" "+y1);
int c=0;
for(int i=0;i<x.length();i++)
{if(x1.length()>=x.length())
if(x1.charAt(i)==y1.charAt(i))
{if(i+1<x.length())
    if(x1.charAt(i+1)==y1.charAt(i))
    {
        x1.deleteCharAt(i);
        c=c+3;
    }
    else 
    {
     x1.replace(i,i+1,String.valueOf(y1.charAt(i)));   
     c=c+5;
    }
}
}
    if(x1.length()!=y1.length())
    {
        x1.insert(x1.length(),y1.substring(x1.length(),y1.length()));
        int m=y1.length()-x1.length();
        c=c+(4*m);
    }
    System.out.print(c);
}}
