package m4.v2_AutoboxingUnboxing.after;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class AutoboxingUnboxing {
    private int value = 0;
    public AutoboxingUnboxing(int v ){
        value = v;
    }


    public static void main(String[] args) {
        out.println("\n** Custom Wrapper ** \n");

        Integer integer = 234;
        int intPrimitive = integer;

        Integer integer2 = new Integer(234);
        int intPrimitive2 = integer2.intValue();

        /* Autoboxing of primitive literals */
        Boolean boolWrapper = true;
        Character charWrapper = 'A';

        Byte byteWrapper = 123;
        Short shortWrapper = 23_400;
        Integer intWrapper = 234_000;
        Long longWrapper = 234_000_000L;
        Float floatWrapper = 2.340000f;
        Double doubleWrapper = 2.340000000000;

        /* Unboxing of wrapper variables */
        boolean boValue = boolWrapper;
        char cValue = charWrapper;

        byte byValue = byteWrapper;
        short sValue = shortWrapper;
        int iValue = intWrapper;
        long lValue = longWrapper;
        float fValue = floatWrapper;
        double dValue = doubleWrapper;

        /* Widening with unboxing */
        sValue = byteWrapper;
        iValue = shortWrapper;
        lValue = intWrapper;
        fValue = longWrapper;
        dValue = floatWrapper;

        /* Casting with unboxing doesn't work */
//        byValue = (byte) shortWrapper;
//        fValue = (float) doubleWrapper;

        /* Casting wrapper to wrapper does  not work */
//        shortWrapper = (short)intWrapper;
//        floatWrapper = (float)doubleWrapper;
//
//        shortWrapper = (Short)intWrapper;
//        floatWrapper = (Float)doubleWrapper;

        /* Methods parameters support autoboxing */
        iValue = 9;
        wrapperMethod(iValue);

        /* Method paramters also support unboxing */
        intWrapper = new Integer(3);
        valueMethod(intWrapper);

        shortWrapper = new Short((short) 4);
        valueMethod(shortWrapper);

        List<Integer> list = Arrays.asList(1, 2);
        list.add(null);

    }
    public static void wrapperMethod(Integer intWrapper){
        out.println(intWrapper);
    }

    public static void valueMethod(int intValue){

        out.println(intValue);
    }
}
