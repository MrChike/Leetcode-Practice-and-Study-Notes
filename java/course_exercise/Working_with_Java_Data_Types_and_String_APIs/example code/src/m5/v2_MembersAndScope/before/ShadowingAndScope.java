package m5.v2_MembersAndScope.before;
import static java.lang.System.out;

public class ShadowingAndScope {
    public static int memberVariable = 200;

    public void aMethod(int param1, int param2){
    }

    public static void main(String [] args){
        m5.v2_MembersAndScope.after.ShadowingAndScope sas = new m5.v2_MembersAndScope.after.ShadowingAndScope();
        sas.aMethod(1,1);
    }

}
