package m6.v3_StringMethods_1.after;
import static java.lang.System.out;

public class StringMethods_1 {

    public static void main(String [] args) {
        out.println("\n** String Methods, Part 1 ** \n");

        /* Remember two string object with the same contents
            are still two different objects
         */
        String str = new String("Hello World!");
        String str2 = new String("Hello World!");
        out.println(str == str2); // false

        /* Test the contents of two String objects using the equals */
        out.println( str.equals(str2) ); // true

        /* The case must be exactly the same for two String object to be equal */
        String str3 = "hello World!";
        out.println( str.equals(str3) ); // false

        /* Equals ignore case, ignores case differences */
        out.println( str.equalsIgnoreCase(str3) ); // true

        /* the length() method counts all characters */
        str = "Hello World!";
        out.println(str.length()); // 12

        /* including spaces, tabs, end of lines and escaped characters */
        str = "\tHello \"cruel\" World!\n";
        out.println( str.length() ); // 22

        /* Upper and Lower case methods */
        str = "Hello World!";
        str2 = str.toUpperCase();
        out.println( str2 ); // "HELLO WORLD!"
        str3 = str.toLowerCase();
        out.println( str3 ); // "hello world!"

        /* These methods, like all methods, return unique String objects */
        out.println(str == str2 || str == str3 || str2 == str3); // false

        /* the startsWith( ) method */
        str = "Love For All, Hatred For None";
        out.println( str.startsWith("Lov") ); // true
        out.println( str.startsWith("luv") ); // false

        /* the endsWith( ) method */
        out.println( str.endsWith("one") ); // true
        out.println( str.endsWith("Non") ); // false

        /* the contains() method */
        str2 = "Hello, my name is Richard";
        out.println( str.contains("Rich") ); // true
        out.println( str.contains("Rick") ); // false

        /* trim() removes whites space at the start and end of the String
         */

        str = " Hi there! ";
        out.println(str.length()); // 11
        str2 = str.trim();
        out.println( str2.length() );// 9

        /* trim also removes all escaped characters except escaped single
            and double quotes and backslashes
        */
        str = "\t\b   \"Hi there!\"  \\\r\n\f";
        out.println(str.length()); // 22
        str2 = str.trim();
        out.println(str2.length()); // 14, ("Hi there!"   \)

        /* strip( ) does the same thing but doesn't ignore
           anything that is not a white space character
         */
        str = "\t\b   \"Hi there!\"  \\\r\n\f";
        out.println(str.length()); // 22
        str2 = str.strip();
        out.println(str2.length()); // 22, (     "Hi there!"  \)

        /* the stripLeading and stipTrailing work the same way
            as strip, but focus on the beginning or the end of the string
            respectively
         */
        str = "  Hi there!  ";
        out.println(str.length());  // 11   (   Hi there!   )
        str2 = str.stripLeading();
        out.println(str2.length()); // 10, (Hi there!   )
        str3 = str.stripTrailing();
        out.println(str3.length()); // 10, (   Hi there!)


    }
}