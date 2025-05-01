package m5.v7_Varargs.after;
import java.util.Arrays;

import static java.lang.System.out;

public class Varargs {
    public static void someMethod(int... nums){
        out.println(Arrays.toString(nums));
    }

    public static void someMethod(String x, double y, int... nums){
        out.print(x+", "); out.print(y + ", ");
        out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        out.println("\n** Varargs ** \n");

        someMethod(null);

        someMethod();

        someMethod(5);

        someMethod(3,5,7,9);

        someMethod("Hello", 3.14, null);

        someMethod("Hello", 3.14);

        someMethod("Hello", 3.14, 2);

        someMethod("Hello", 3.14, 2,4,6,8);
    }
}
