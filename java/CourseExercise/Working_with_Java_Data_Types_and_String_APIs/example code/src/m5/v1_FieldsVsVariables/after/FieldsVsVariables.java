package m5.v1_FieldsVsVariables.after;



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

        /*
         * Partial Initialization Won't Compile


        boolean flag = (new Random()).nextBoolean();
        long variable_x;
        if(flag){
            variable_x = 100L;
        }
        out.println(variable_x);

        Random random = new Random();
        int testValue = random.nextInt(5 - 1) + 1;

        long variable_y;
        switch(testValue){
            case 1:
                variable_y = 100L;
            case 2:
                variable_y = 200L;
            case 3:
                variable_y = 300L;

        }

        out.println(variable_y);

        boolean flag = (new Random()).nextBoolean();

        long variable_z;
        while(flag){
            variable_z = 100L;
        }

        out.println(variable_z);
        */
    }
}

