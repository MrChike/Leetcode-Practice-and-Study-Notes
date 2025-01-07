package m5.v6_LocalVariableTypeInference.after;
import static java.lang.System.out;

public class LocalVariableTypeInference {

    {
        // var can be use in static blocks
        var varValue = 1;
    }

    /* var cannot be used for static class variables */
    // static var someValue = 1; // compile error

    /* var cannot be used for instance variables*/
    // var someInstanceValue = "My value"; // compile error

    /* the var can be use in the body of a static method */
    public static String staticMethod(){
        var h = "hi there";
        return h;
    }

    /* the var can be use in the body of an instance method */
    public int instanceMethod( ){
        var q = 1;
        return q += 1;
    }

    public static void main(String[] args) {
        out.println("\n** Local Variable Type Inference ** \n");

        int x = 1;
        var y = 1;     // y is an int type
        var z = 3.14f; // z is a float type

        /* you cannot declare a variable without a type */
        // z = "Hello"; // compile error
        z = y;

        var intX = 5;
        var intY = 2;
        var result = intX + intY;

        /* You must cast a null to a reference type in a var declaration */
        var name = (String)null;

        /* multi-variable initialization is allowed with an explicit type */
        int nInt = 1, mInt = 2, oInt = 3;

        /* multi-variable initialization is NOT allowed with var  */
        //var pInt = 1, qInt = 2, rInt = 3; // compile error


    }

//    public LocalVariableTypeInference(var a){
//        //  COMPILE ERROR
//    }
//
//    public void whatever(var a, var b){
//        //  COMPILE ERROR
//    }
//
//    public static void something(var x, var y){
//        //  COMPILE ERROR
//    }
}

