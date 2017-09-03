import java.lang.reflect.Array;
import java.util.*;

public class pro25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bit = sc.nextInt();
        Set<String> valy = new LinkedHashSet<String>();
        for (int i = 0; i <= bit; i++) {
            int val[] = new int[bit];
            if(i==0){}
            else
            for (int j = 0; j < i; j++) {
                val[j] = 1;
            }
            Arrays.fill(val, i, bit, 0);
            for (int dd = 0; dd < bit; dd++) {
                String str = String.valueOf(val[dd]);
                String str2="";
                for (int ds = 0; ds < bit; ds++) {
                    if(ds!=dd)
                    str2 += val[ds];
                }
                String str1=str+str2;
                String str3=str+((new StringBuffer(str2).reverse()).toString());
                valy.add(str1);
                valy.add(str3);
            }
        }
        System.out.print(valy);

    }

        }
