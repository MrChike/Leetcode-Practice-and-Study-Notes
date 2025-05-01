package m3.v4_RelationalOperators.after;
import static java.lang.System.out;
import java.util.Date;

public class RelationalOperators {
    public static void main(String[] args) {
        out.println("\n** Relational Operators ** \n");

        /*  Review of simple comparison operators */
        int xInt = 3;
        long yLong = 3L;
        float zFloat = 3.1f;

        /*The following are 'true' */
        boolean result = yLong != zFloat;
        result = xInt == yLong;
        result = yLong < zFloat;
        result = xInt <= zFloat;
        result = zFloat > yLong;
        result = zFloat > yLong;

        /* The following are 'false' */
        result = xInt == zFloat;
        result = yLong != xInt;
        result = xInt < yLong;
        result = zFloat <= xInt;
        result = yLong > zFloat;
        result = xInt >= zFloat;


        /* The <, <=, >, >= Only work on numbers
        xInt = 3;
        boolean flag = false;
        String obj = "This is an Object";

        xInt < flag;  // won't compile
        xInt < obj;   // won't compile

        */

        /* the == and != can compare any two numerical primtive types */
        xInt = 3;
        zFloat = 3.1f;
        result = xInt == zFloat;  //  false
        result = xInt != zFloat;  //  true

        /* the == and != can compare any two boolean primitives */
        boolean isFalse = false;
        boolean isTrue = true;
        result = isTrue == isFalse; //  false
        result = isTrue != isFalse; //  true

        /* the == and != compare object references,
        not the values contained by the objects */
        Date dateA = new Date(0L); // Wed Dec 31 18:00:00 CST 1969.
        Date dateB = dateA;
        Date dateC = new Date(0L); // Wed Dec 31 18:00:00 CST 1969.

        result = dateA == dateB; // true
        result = dateA != dateC; // true

        /* The instanceof comparator compares the class types. Two objects the same class
            returns true because they are instances of exactly the same type.
            Also, any object that extend extends a class of the same type and
            any object that implements the interface of same type.
         */

        class ClassA {};
        class ClassB extends ClassA {};

        ClassA instanceA = new ClassA();
        ClassB instanceB = new ClassB();

        result = (instanceA instanceof ClassA); // true
        result = (instanceB instanceof ClassA); // true
        result = (instanceA instanceof ClassB); // false

        /* Relational operators can also be operands */

        xInt = 3;
        yLong = 3L;
        zFloat = 3.1f;

        result = ((zFloat >= yLong) == (xInt <= zFloat)); // true

    }
}
