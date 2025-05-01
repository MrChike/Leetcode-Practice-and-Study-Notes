package m3.v11_MathAPIs.after;
import static java.lang.System.out;

public class MathAPIs {
    public static void main(String[] args) {
        out.println("\n** Math APIs ** \n");

        /* Random - any number between 0 and 1, but not including 1 */
        for(int i = 0; i < 4; i++) {
            double result = Math.random();
            out.format("Math.random() = %.20f%n",result);
        }


        /* Exponents */
        double num = 2;
        double exp = 3;

        double result = Math.pow(num,exp); // 8
        out.format("Math.pow(%.2f,%.2f) = %.2f%n",num, exp, result);

        /* Round - looks at first decimal digit. 0 - 4 round down; 5 - 9 round up */
        double pI = 3.14;
        float eN = -2.71f;

        long longX = Math.round(pI); // 3
        out.format("Math.round(%.2f) = %d%n",pI,longX);

        int intX = Math.round(eN); // -2
        out.format("Math.round(%.2f) = %d%n",eN,intX);
        



        /* Max Min - several overloaded methods for different types */
        int intA = 3;
        int intB = 4;

        int intMin = Math.min(intA,intB); // 3
        out.format("Math.min(%d,%d) = %d%n",intA,intB,intMin);

        intMin = Math.min(intB,intA); // 3
        out.format("Math.min(%d,%d) = %d%n",intB,intA,intMin);

        int intMax = Math.max(intA, intB); // 4
        out.format("Math.max(%d,%d) = %d%n",intA,intB,intMax);

        intMax = Math.max(intB, intA); // 4
        out.format("Math.max(%d,%d) = %d%n",intB,intA,intMax);

//        Math.max(long, long);
//        Math.min(long, long);
//
//        Math.max(doulbe, double);
//        Math.min(double, double);
//
//        Math.max(float, float);
//        Math.min(float, float);








    }
}
