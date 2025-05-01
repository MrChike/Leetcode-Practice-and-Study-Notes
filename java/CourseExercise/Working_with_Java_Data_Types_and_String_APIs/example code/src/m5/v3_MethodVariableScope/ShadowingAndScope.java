package m5.v3_MethodVariableScope;

import static java.lang.System.out;

public class ShadowingAndScope {
    public static int memberVariable = 200;

    public static void someMethod() {
        out.println(memberVariable); // 200
        int memberVariable = 2;
        out.println(memberVariable); // 2
        out.println(ShadowingAndScope.memberVariable); // 200
    }

    public static void main(String [] args){
        out.println("\n** Method Variable Scope ** \n");

        someMethod();
    }
}
