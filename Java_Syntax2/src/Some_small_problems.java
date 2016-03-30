import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by messynger on 30.03.16.
 */
public class Some_small_problems {
    public static void main(String[] args) {

        //Area calculation
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;
        System.out.println(area);


        //Triangle area calculation
        Scanner sc = new Scanner(System.in);
        int a_x = Integer.parseInt(sc.next());
        int a_y = Integer.parseInt(sc.next());

        int b_x = Integer.parseInt(sc.next());
        int b_y = Integer.parseInt(sc.next());

        int c_x = Integer.parseInt(sc.next());
        int c_y = Integer.parseInt(sc.next());

        area = a_x*(b_y-c_y)+b_x*(c_y-a_y)+c_x*(a_y-b_y)/2;

        if ((a_x == b_x && a_x == c_x && b_x == c_x) || (a_y == b_y && a_y == c_y && b_y == c_y)
                ) {
            area = 0;
        }

        System.out.println(area);

        //Smallest of 3 numbers
        int x, y, z;
        x = 5;
        y = 2;
        z = 2;

        List<Integer> arr = new ArrayList<>();
        arr.add(x);
        arr.add(y);
        arr.add(z);
        System.out.println(Collections.min(arr));

        //convert to hex
        int some_num = 6779;
        System.out.println(Integer.toHexString(some_num).toUpperCase());

        //formatting numbers
        int num1 = 254;
        float num2 = 11.6F;
        float num3 = 0.5f;

        System.out.printf("%s %2$s %3$.3fd", Integer.toHexString(num1).toUpperCase(), Integer.toBinaryString((int)num2), num3);
    }
}

