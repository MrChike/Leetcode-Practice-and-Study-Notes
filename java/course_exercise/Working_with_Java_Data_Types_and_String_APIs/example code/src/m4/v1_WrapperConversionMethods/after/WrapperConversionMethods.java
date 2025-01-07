package m4.v1_WrapperConversionMethods.after;
import static java.lang.System.out;

public class WrapperConversionMethods {

    public static void main(String [] args){
        out.println("\n** Wrapper Conversion Methods ** \n");

        Integer intWrapper = new Integer(7);

        byte   bytVal = intWrapper.byteValue( );  // 7
        short  shtVal = intWrapper.shortValue( ); // 7
        int    intVal = intWrapper.intValue( );   // 7
        long   lngVal = intWrapper.longValue( );  // 7L
        float  fltVal = intWrapper.floatValue( ); // 7.0f
        double dblVal = intWrapper.doubleValue( );// 7.0

        intWrapper = new Integer(200_000);
        shtVal = intWrapper.shortValue(); // 3392

        Double dblWrapper = new Double(3.14);
        bytVal = dblWrapper.byteValue(); // 3

        // boolean booVal = intWrapper.booleanValue();

        String strNum = "1234";
        intVal = Integer.parseInt(strNum); // 1234
        fltVal = Float.parseFloat(strNum); // 1234.0f

        try {
            shtVal = Short.parseShort("Hello World");
        }catch(java.lang.NumberFormatException nfe){
            // the exception is always thrown
        }

        try {
            intVal = Integer.parseInt("3.14");
        }catch(java.lang.NumberFormatException nfe){
            // the exception is always thrown
        }

        try {
            intVal = Integer.parseInt(null);
        }catch(java.lang.NumberFormatException nfe){
            // the exception is always thrown
        }

        boolean booVal = Boolean.parseBoolean("TRUE"); // true
        booVal = Boolean.parseBoolean("false"); // false

        booVal = Boolean.parseBoolean("troop"); // false
        booVal = Boolean.parseBoolean(null);   // false

        Long longWrap = Long.valueOf(23234);        // new Long(23234)
        Integer intWrap = Integer.valueOf("23234"); // new Long(23234)


    }
}
