import java.util.Arrays;
class pr1
{
public static void main(String args[])
{
char a[]=args[0].toCharArray();

Arrays.sort(a);
String b=String.valueOf(a[0]).concat(String.valueOf(a[1]));
int x=a.length-2;
System.out.print("The least number is"+" "+b+" after deleting"+" "+x+" digits");
}
}
