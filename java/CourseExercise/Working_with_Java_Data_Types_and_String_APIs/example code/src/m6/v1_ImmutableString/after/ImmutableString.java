package m6.v1_ImmutableString.after;
import static java.lang.System.out;

public class ImmutableString {

    public static void main(String [] args){
        out.println("\n** Immutable Strings ** \n");

        /* String literals are stored in a shared pool */
        String str = "Hello!";
        String str2 = "Hello!";

        out.println(str == str2); // true

        /* Other String object are not shared in the pool */
        String str3 = new String("Hello!");
        out.println(str == str3); // false

        /* String methods always create new string objects,
           even on String literals. The result substrings are
           not stored in the String literal pool
        */
        String str4 = str.substring(5);
        String str5 = str.substring(5);
        out.println(str4 == str5); // false

    }
}
