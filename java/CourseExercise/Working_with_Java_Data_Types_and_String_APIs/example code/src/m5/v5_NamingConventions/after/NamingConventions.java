package m5.v5_NamingConventions.after;
import static java.lang.System.out;

public class NamingConventions {

    public static void main(String[] args) {
        out.println("\n** Variable Naming Conventions ** \n");

        int total_due = 0; // avoid using underscores
        int total$due = 0; // avoid using dollar sign
        int ttl = 0; // avoid abbreviations; use full words
        int Total = 0; // Never start with upper case letter
        int toTAL = 0; // use all lower case if its a single word
        int totalamountdue = 0; // use camel case.

        int totalAmountDue = 0; // perfect!
    }
}
