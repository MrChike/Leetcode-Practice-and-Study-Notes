package m2.v4_Float_Double.after;
import static java.lang.System.out;

public class PrimitiveDecimals {

    public static void main(String[] args) {
        out.println("\n** Primitive Decimals ** \n");

        /* Floats and doubles hold decimal point numbers */
        float piFloat = 3.14f;
        double piDouble = 3.14;

        piFloat =  3.141592653f;
        piDouble = 3.14159265358979323;

        out.println("piFloat = " + piFloat);
        out.println("piDouble = " + piDouble);

        float pFloat = .98768f;

        float longToFloat = 1111111112222222223L;
        double longToDouble = 1111111112222222223L;

        out.println("\n");
        out.println("longToFloat = " + longToFloat);
        out.println("longToDouble = " + longToDouble);


    }
}
