package m3.v2_PrePostUnaryOperators.after;
import static java.lang.System.out;

public class PrePostUnaryOperators {
    public static void main(String[] args) {
        out.println("\n** Pre-/Post-Unary Operators ** \n");

        /* Pre-Unary Operators increment or decrement integrals*/
        int xInt = 1;
        ++xInt; // 2
        --xInt; // 1

        /* Pre-Unary Operators increment or decrement only the integral part
            of decimal numbers */
        double xDouble = 3.14;
        ++xDouble; // 4.14
        --xDouble; // 3.14


        /* The pre-unary operators are applied as the statement is evaluated */
        xInt = 4; // 5
        int yInt = 7;
        int zInt = 3; // 2
        int result = ++xInt + yInt + --zInt; // 14

        /* The pre-unary operator is immediate.
          Subsequent uses will reflect the increment */
        xInt = 5; // 6 + 6 + 7 = 19
        result = ++xInt + xInt + ++xInt; // 19

        /* Post Unary operators decrement or increment a number.
            The change occurs after the variable is incremented,
            not before.
         */
        xInt = 1; // 3
        result = xInt++ + xInt + xInt++; // 5
        //         1       2       2   = 5

    }
}
