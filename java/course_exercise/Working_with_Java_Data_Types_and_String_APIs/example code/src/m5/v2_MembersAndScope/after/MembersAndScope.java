package m5.v2_MembersAndScope.after;
import static java.lang.System.out;

public class MembersAndScope {

    static { /*static initializer; not a member */ }

    { /* instance initializer; not a member*/ }

    // static (class) field; a member
    public static int staticField = 1;

    // instance field; a member
    public int instanceVariable = 1;

    // static (class) method; a member
    public static void aStaticMethod(int param1, int param2){
        staticField += 1;
        if(true){
            int localVar1 = 0;
            localVar1 = staticField + param1;
            if(true){
                int localVar2 = 0;
                localVar1 = localVar2 + param2;
            }
        }else{
            int localVar1 = 2;
            for(int i = param1; i < staticField; i++){
                int localVar2 = 0;
                localVar2 = localVar1 + param2;
            }
        }
        int localVar3 = 3;
        while(param1 < staticField){
            int localVar4 = param2;
            localVar4 = staticField + localVar3;
        }
    }

    // instance method; a member
    public void anInstanceMethod(){}

    // constructor; not a member
    public MembersAndScope(){ }
}
