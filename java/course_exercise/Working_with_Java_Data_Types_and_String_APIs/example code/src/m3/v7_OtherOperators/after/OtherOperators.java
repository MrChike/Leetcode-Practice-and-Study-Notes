package m3.v7_OtherOperators.after;
import static java.lang.System.out;

public class OtherOperators {
    public static void main(String[] args) {
        out.println("\n** Other Operators ** \n");

        /* the positive and negative unary operators used with literals */
        int x = 5 * -3;       // -15
        double y = -6 + 9.13; // 3.13000


        /* positive and negative unary operators used with variables */
        x = 5;
        y = -x * -3 + +x;  // 20.0
 

        /* don't confusing positive/negative unary operators
        with pre-unary operators */
        x = 5;
        y = --x * -3 + ++x;  // -7


        /* don't be tricked by mixed use of positive/negative unary operators
        with pre-unary operators */
        x = 5;
        y = --x * -3 + -x;  // -16.0
  

    }
}

