package m6.v4_StringMethods_2.after;
import static java.lang.System.out;

public class StringMethods_2 {

    public static void main(String [] args) {
        out.println("\n** String Methods, Part 2 ** \n");


        /* charAt() returns the character at the specified index */
        String str = "Hello World!";
        Character chr = str.charAt(1);
        out.println(chr); // 'e'

        /* indexOf() returns the index of the first character that matches
            if no match is found it returns -1
         */
        str = "Mississippi";
        int index = str.indexOf('s');
        out.println(index); // 2

        /* indexOf() returns the beginning index of the first occurrence
            sequence of characters that matches. if no match is found it returns -1
         */
        str = "Mississippi";
        index = str.indexOf("is");
        out.println(index); // 1

        /* indexOf starting at index */
        str = "Mississippi";
        index = str.indexOf('i', 5);
        index = str.indexOf("ss", 4);
        out.println(index); // 5

        /* Substring create a new string from the index to the
           end of the String */
        str = "Mississippi";
        String subStr = str.substring(8);
        out.println(subStr); // (ppi)

        /* Substring create a new string from the first index to the
           character before the end index */
        str = "Mississippi";
        subStr = str.substring(5,8);
        out.println(subStr); // (ssi)

        /* replace() creates a new string substituting a character for a character
            or a sequence for a sequence
         */
        str = "MISSISSIPPI"; // (MISSISSIPPI)
        String str2 = str.replace('I', 'x');
        out.println(str2); // (MxSSxSSxPPx)

        str = "MISSISSIPPI"; // (MISSISSIPPI)
        str2 = str.replace("SS", "xx");
        out.println(str2); // (MIxxIxxIPPI)


        /* Method chaining */

        str = new String("   Hi there!  "); 
        str2 = str.strip(); // (Hi there!)
        String str3 = str2.replace("Hi", "Hello"); // (Hello there!)
        String str4 = str3.toUpperCase();
        out.println(str4); // (HELLO THERE!)


        str = "   Hi there!   ";
        str2 = str.strip().replace("Hi", "Hello").toUpperCase();
        out.println(str2); // (HELLO THERE!)

    }
}
