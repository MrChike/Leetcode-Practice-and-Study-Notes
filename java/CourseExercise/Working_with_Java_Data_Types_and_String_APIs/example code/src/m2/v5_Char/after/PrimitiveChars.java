package m2.v5_Char.after;
import static java.lang.System.out;

public class PrimitiveChars {
    public static void main(String[] args) {
        out.println("\n** Primitive chars ** \n");

        char aLetter = 'A';
        char aUnicode = '\u0041';
        char aNumber = 65;

        if(aLetter == aUnicode && aUnicode == aNumber){
            out.print("\\u0041, \'A\', and 65 are equal");
        }else{
            out.println("They are NOT equal");
        }

        char newLine = '\n';
        out.println(newLine);

        char sheenCharacter = '\u0634';
        out.println("Arabic 'sheen' = " + sheenCharacter);

        char minChar = 0;
        char maxChar = 65535;

        //aNumber = 3.14;

        minChar = '\uffff'; // 65535;
        maxChar = '\u0000'; // 0;

    }
}
