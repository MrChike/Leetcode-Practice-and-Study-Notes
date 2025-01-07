package m5.v7_Varargs.before;
import static java.lang.System.out;

public class Varargs {

    public static void someMethod(int... nums){
        if(nums == null) {
            out.print("null");
        }else {
            for (int i = 0; i < nums.length; i++) {
                out.print(nums[i] + ", ");
            }
        }
    }
    public static void main(String[] args) {
        out.println("\n** Varargs ** \n");
    }
}
