class revowel
{
    public static void main(String args[])
    {
        String k=(new StringBuffer(args[0])).reverse().toString();
        System.out.println(k);
        char f[]={'a','e','i','o','u'};
        for(char b:f)
        {
            k=k.replace(""+b,"");
        }
        System.out.println(k);
    }
}
