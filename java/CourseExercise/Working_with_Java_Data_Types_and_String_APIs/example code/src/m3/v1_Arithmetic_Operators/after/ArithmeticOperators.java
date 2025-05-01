package m3.v1_Arithmetic_Operators.after;
import static java.lang.System.out;

public class ArithmeticOperators {
    public static void main(String[] args) {
        out.println("\n** Arithmetic Operators ** \n");

        byte byteResult = 5 + 3; // 8
        /* bytes are automcailly promoted to int */
        byte xByte = 5;
        byte yByte = 3;

        //byteResult = (int)xByte + (int)yByte;

        int intResult = xByte + yByte;

        /* A short is also automciatally promoted to an int */
        short xShort = 5;
        yByte = 3;
        //short shortResult = xShort + yByte;
        intResult = xShort + yByte;

        /* All varaibles are promoted to the largest type in the operation */
        xShort = 5;
        int yInt = 3;
        long zLong = 10;
        // intResult = xShort + yInt * zLong;
        long longResult = xShort + yInt * zLong;

        /* This promotion also happens with decimal values */
        xByte = 5;
        float yFloat = 3.0f;
        double zDouble = 10.0;
        //float floatResult = xByte + yFloat * zDouble;
        double doubleResult = xByte + yFloat * zDouble;

    }
}