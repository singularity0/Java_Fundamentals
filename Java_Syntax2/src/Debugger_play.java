import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by messynger on 30.03.16.
 */
public class Debugger_play {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Locale.setDefault(new Locale("BG", "BG"));

        byte b;
        b = 1;
        int i = 5;
        long num = Long.MAX_VALUE;
        short sum = (short)num;
        char ch = '\u03A9';
        String s = "2a" + String.valueOf(b);
        String s2 = "2a" + Integer.toString(b);


        System.out.printf("%s %s" , s, s2);
        System.out.println();
        System.out.printf(String.format("%s %s" , s, s2));
        System.out.println();
        System.out.println(s + i);

//        Scanner scann = new Scanner(System.in);
//        System.out.println(scann.next());
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(100);
//
//        while (!scann.hasNext("END")) {
//            nums.add(scann.nextInt());
//        }


        System.out.println(num);


        if (num > 23 && num > 100 || true) {
            num %= 100_000_000;
            System.out.println(num);
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Mon"); break;
            case 2:
                System.out.println("Tue"); break;
        }


    }
}
