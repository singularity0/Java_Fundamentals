
import java.math.BigDecimal;
import java.util.Arrays;


/**
 * Created by messynger on 29.03.16.
 */
public class First_Steps {
    public static void main(String[] args) {
        System.out.println("Hello");

        int some_int = 123;
        System.out.println(some_int);

        BigDecimal x = new BigDecimal(445665000);
        BigDecimal y = new BigDecimal(12);
        BigDecimal z = x.add(y);
        System.out.println(z);

        float fl = 23.00F;
        float fl2 = 0.0123F;
        System.out.println(fl + fl2);

        double double_num = 2.0000001;
        double double_num2 = 0.000000944;
        System.out.println(double_num + double_num2);

        String[] st_arr = {"qwer", "foo", "bar"};
        System.out.println(st_arr[1]);
        System.out.println(String.join("__@__@", st_arr));

        boolean b = true;
        if (b) {
            System.out.println("Works");
        }

        String some_str = "abcd";
        System.out.println(some_str.substring(1,3));
        System.out.println(some_str.substring(1));
        System.out.println(some_str.substring(4));

        Arrays.sort(st_arr);
        System.out.println(st_arr[0]);

        String i = "12";
        String k = new String("12");
        System.out.println(i == k );
        System.out.println(i == i );
        System.out.println(i.equals(k) );



    }


}
