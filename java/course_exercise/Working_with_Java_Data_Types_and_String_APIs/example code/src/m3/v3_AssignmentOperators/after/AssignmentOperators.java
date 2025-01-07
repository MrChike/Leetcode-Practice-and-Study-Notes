package m3.v3_AssignmentOperators.after;
import static java.lang.System.out;

public class AssignmentOperators {
    public static void main(String[] args) {
        out.println("\n** Assignment Operators ** \n");

        int x = 5;
        int y = 3;
        int z = x + y;

        /* Simple assignment operators can be used elsewhere in statements */
        x = 5;
        y = 3;
        z = 5 + (y = x + y); // 15

        /* When a simple assignment looks like an equals operator, but isn't */
        boolean flag = false; // true
        z = 0; // 5
        if(flag = true){
            z = 5;
        }else{
            z = 3;
        }

        /* Compound assignment example */
        int xInt = 5;
        int yInt = 3;
        yInt *= yInt; // 15
        yInt = yInt * xInt; // 15

        /* Compound assignments automatically cast the result to the assign type */
        byte xByte = 5;
        double yDouble = 3.0;

        //xByte = xByte + yDouble;

        xByte += yDouble;
        xByte = (byte)(xByte + yDouble);

        xByte = 5;
        yDouble = 3.0;
        float afloat = 5.0f;
        long aLong = 10;
        short aShort = 3;
        xByte += yDouble + afloat * aLong % aShort; // 10

    }
}
