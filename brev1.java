class brev

{

public static void main(String args[])


{

int a=Integer.parseInt(args[0]);

  int b=0;

  while(a>0)

 {b*=10;  
  b+=a%10;

    a=a/10;

    
}
System.out.print(b);

  
}

}
