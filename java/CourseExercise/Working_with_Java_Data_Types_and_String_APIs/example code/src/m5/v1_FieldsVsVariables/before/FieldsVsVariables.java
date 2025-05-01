package m5.v1_FieldsVsVariables.before;

public class FieldsVsVariables {

    /* FIELDS */

    // static (class) variables
    static int field_a;
    static String field_b;

    // instance variables
    float field_c;
    String field_d;

    /* FIELDS ^^^^^^ */

    public void method_1( ){

        /* LOCAL VARIABLES*/
        short variable_a;
        String variable_b;

    }

    public static void main(String [] args){

        /* LOCAL VARIABLES */
        long variable_c;
        String variable_d;

    }
}

