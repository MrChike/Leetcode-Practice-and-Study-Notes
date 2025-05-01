package m2.v6_Narrowing_Widening_Casting.after;
import static java.lang.System.out;

public class NarrowingWideningCasting {

    public static void main(String[] args) {
        out.println("\n** Narrowing, Widening, and Casting ** \n");

        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;

        float floatValue = 3.141592f;
        double doubleValue = floatValue;

        floatValue = intValue;
        doubleValue = longValue;

        out.println("floatValue = " + floatValue);
        out.println("doubleValue = " + doubleValue);
        out.println("\n");

        floatValue = 2147483647;
        doubleValue = 9223372036854775807L;

        out.println("floatValue = " + floatValue);
        out.println("doubleValue = " + doubleValue);

        out.println("\n");

        longValue = 100L; // 9223372036854775807L;
        intValue = (int) longValue;
        shortValue = (short) intValue;
        byteValue = (byte) shortValue;

        doubleValue = byteValue;
        floatValue = (float)doubleValue;

        out.println("longValue = " + longValue);
        out.println("intValue = " + intValue);
        out.println("shortValue = " + shortValue);
        out.println("byteValue = " + byteValue);
        out.println("floatValue = " + floatValue);

        out.println("\n");

        longValue = 9223372036854775807L;
        intValue = (int) longValue;
        shortValue = (short) intValue;
        byteValue = (byte) shortValue;

        doubleValue = byteValue;
        floatValue = (float)doubleValue;

        out.println("longValue = " + longValue);
        out.println("intValue = " + intValue);
        out.println("shortValue = " + shortValue);
        out.println("byteValue = " + byteValue);
        out.println("floatValue = " + floatValue);

        out.println("\n");

        shortValue = 100;
        char charValue = (char) shortValue;

        out.println("shortValue = " + shortValue);
        out.println("charValue = " + (int)charValue);

        charValue = 30000;
        shortValue = (short) charValue;

        out.println("shortValue = " + shortValue);
        out.println("charValue = " + (int)charValue);
    }
}
