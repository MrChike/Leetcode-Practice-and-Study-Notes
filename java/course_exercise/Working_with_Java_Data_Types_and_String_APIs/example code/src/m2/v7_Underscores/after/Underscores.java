package m2.v7_Underscores.after;

import static java.lang.System.out;

public class Underscores {

    public static void main(String [] args){

        out.println("\n** Underscores in Numbers ** \n");

        /* commas are NOT allowed in numeric literals
        long worldPopulation = 7,674,000,000L;

        /* underscores are can be used instead */
        long worldPopulation = 7_674_000_000L;

        /* underscores can be used almost anywhere in a number*/
        long phoneNumber = 1_617_385_1234L;

        /* underscores can also be used in doubles and floats */
        double Pi = 3.141_592_653_793_238d;

        /* underscores cannot be used at the start or end of a number

        short maxShort = _32_767;
        short minShort = 32_767_;

        double latitude = _48.8584;
        double longitude = 2.2945_;

        */

        /* underscores cannot be used before or after a type suffix

        long usPopulation = 328_200_000_L;
        float specificGravity = 1.050f_;

        */

        /* underscores cannot be used before or after a decimal point

        float kgInPounds = 2_.20462f;
        double poundInKg = 0._453591830542594d;

         */

        /* underscores cannot be used before or after a minus sign on a negative number

        short fahrenheit = _-10;
        float celsius = -_23.3333f;

         */


    }
}
