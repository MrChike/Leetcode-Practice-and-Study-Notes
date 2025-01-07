package m6.v2_StringConcatenation.after;
import static java.lang.System.out;

public class StringConcatenation {

    public static void main(String [] args) {
        out.println("\n** String Concatenation ** \n");

        /* The plus operator concatenates two String objects */
        String str = "Hi, ";
        String str2 = str + "Bob!";
        out.println(str2); // "Hi, Bob!"

        /* Primitives can be concatenated to String objects */
        String pi = "3.14" + 15926;
        out.println(pi); // "3.1415926"

        /* The order of precedents when combining
           Strings still applies
         */
        String str3 = 5 + 3 + "xyz" + 3 + 5;
        System.out.println(str3);  // "8xyz35"

        /* The += can also be used */
        String str4 = "Pi is ";
        str4 += "3.14";
        System.out.println(str4); // "Pi is 3.14"

        /* Again, the order of precedents applies */
        str4 += "__" + 5 * 4;
        System.out.println(str4); // "Pi is 3.14__20"


    }
}
