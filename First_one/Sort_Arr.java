import java.lang.reflect.Array;

/**
 * Created by messynger on 24.03.16.
 */
public class Sort_Arr {
    public static void main(String[] args) {
        String[] arr = {"bb", "123", "aa"};
        for (int i = 0; i < 2 ; i++) {
            if (arr[i][0] < arr[i+1][0]) {
                arr[i][0] = 6;
            }
        }

    }
}
