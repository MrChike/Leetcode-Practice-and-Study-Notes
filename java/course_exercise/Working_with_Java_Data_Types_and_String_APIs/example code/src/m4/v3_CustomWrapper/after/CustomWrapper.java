package m4.v3_CustomWrapper.after;
import static java.lang.System.out;

public class CustomWrapper {

    public static void main(String[] args) {
        out.println("\n** Custom Wrapper ** \n");

        Volume v = new Volume(3.0);

        double milliliters = v.inMilliliters();

        double quarts = v.inQuarts();

        Volume v2 = new Volume(4.0);

        boolean test = v2.equals(v2); // false

    }
}

