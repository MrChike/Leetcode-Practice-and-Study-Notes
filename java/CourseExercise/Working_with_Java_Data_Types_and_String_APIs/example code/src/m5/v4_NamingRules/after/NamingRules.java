package m5.v4_NamingRules.after;
import static java.lang.System.out;

public class NamingRules {

    public static void main(String [] args){
        out.println("\n** Variable Naming Rules ** \n");

        /* Valid characters include A-Z, a-z, 0-9, $, _ */
        int thisI$variaBLEname_thatIS5verylong = 0; // valid

        int ___$__$___  = 0; // valid

       // int thisIsAlso-AVaraibleName = 0; // error

        int someVArIABle = 0;
        if( someVArIABle == 0){
            // someVariable = 2; // never defined
        }

        /* Variable names must start with a letter, $, or _ */
        int someMoney = 0; // valid
        int $omeMoney = 0; // valid
        int _moreMoney = 0; // valid
        // int 1stMoney = 0; // error

        /* Reserved words in the proper case cannot be used */
        int theFinal = 0; // valid
        int the_final = 0; // valid
        int finalExam = 0; // valid
        int Final = 0; // valid
        // int final = 0: // error


    }
}
