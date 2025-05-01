package m5.v2_MembersAndScope.after;
import static java.lang.System.out;

public class ShadowingAndScope {
    public static int memberVariable = 200;

    public void aMethod(int param1, int param2){
        out.println(memberVariable); // 200
        int memberVariable = 2;
        out.println(memberVariable); // 2
        out.println(ShadowingAndScope.memberVariable); // 200
    }

    public static void main(String [] args){
        ShadowingAndScope sas = new ShadowingAndScope();
        sas.aMethod(1,1);
    }

}
