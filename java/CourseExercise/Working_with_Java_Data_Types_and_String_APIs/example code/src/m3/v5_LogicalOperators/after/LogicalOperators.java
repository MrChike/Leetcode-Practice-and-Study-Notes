package m3.v5_LogicalOperators.after;
import static java.lang.System.out;

public class LogicalOperators {
    public static void main(String[] args) {
        out.println("\n** Logical Operators ** \n");

        int xInt = 7; // 8
        boolean yBool = false; // false
        boolean result = (xInt++ <= 7) || (yBool = true); // true



        /* demo boolean variables */
        boolean tru_1 = true;
        boolean tru_2 = true;
        boolean fls_1 = false;
        boolean fls_2 = false;

        /* Logical & (AND) Operator.
        Both sides must be true for result to be true */
        result = tru_1 & tru_2; // true
        result = tru_1 & fls_1; // false
        result = fls_2 & tru_2; // false

        /* Logical && (Short-Circuit AND) Operator.
        Both sides must be true for result to be true. Short-circuits if left is false */
        result = tru_1 && tru_2; // true
        result = tru_1 && fls_1; // false
        result = fls_2 && tru_2; // false short-circuited

        /* Logical | (or) Operator.
        At least one side must be true for result to be true */
        result = tru_1 | tru_2; // true
        result = tru_1 | fls_1; // true
        result = fls_1 | fls_2; // false

        /* Logical || (Short-Circuit OR) Operator.
        Both sides must be true for result to be true. Short-circuits if left is true */
        result = tru_1 || tru_2; // true short-circuited
        result = fls_2 || tru_2; // true
        result = fls_1 || fls_2; // false short-circuited

        /* Logical ^ (exclusive-or) Operator.
        One side must be true and the other false */
        result = tru_1 ^ tru_2; // false
        result = tru_1 ^ fls_1; // true
        result = fls_1 ^ fls_2; // false

    }
}
