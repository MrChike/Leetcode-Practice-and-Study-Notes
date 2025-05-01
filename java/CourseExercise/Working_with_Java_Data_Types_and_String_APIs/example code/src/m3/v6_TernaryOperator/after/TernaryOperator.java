package m3.v6_TernaryOperator.after;
import static java.lang.System.out;

public class TernaryOperator {
    public static void main(String[] args) {
        out.println("\n** Ternary Operator ** \n");

        boolean result;
        float x = (float)Math.random() * 6;

        if(x <= 3){
            result = true;
        }else{
            result = false;
        }
        out.format("%2.0f --> %b%n", x,result);

        result = (x <= 3)? true : false;

        out.format("%2.0f --> %b%n", x,result);

        if( (x <= 3)? true : false ){
            // do something
        }

        double dValue = ((x <= 3)? 0.0 : 3.14) * 13;

        String strValue = "The strValue is "
                +( (x <= 3)? x : "to high" );

        out.println(strValue);

    }
}