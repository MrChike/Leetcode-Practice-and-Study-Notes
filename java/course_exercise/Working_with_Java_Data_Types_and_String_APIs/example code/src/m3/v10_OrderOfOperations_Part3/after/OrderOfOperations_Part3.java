package m3.v10_OrderOfOperations_Part3.after;
import static java.lang.System.out;

public class OrderOfOperations_Part3 {
    public static void main(String[] args) {
        out.println("\n** Order of Operations: Part 3 ** \n");

        int x = 3;
        int y = 4;
        int z = --x * x + y + 8;
        out.println("--x * x + y + 8 = " + z);

        x = 3;
        y = 4;
        z = --x * (x + y + 8);
        out.println("--x * (x + y + 8) = " + z);

        x = 2; y = 4;
        z = x-- * x * x * y/x;
        out.println("x-- * x * x * y/x = " + z);

        x = 2; y = 4;
        z = x-- * (x * x) * y/x;
        out.println("x-- * (x * x) * y/x = " + z);

        boolean xB = false;
        boolean yB = false;
        boolean zB = !xB ^ yB && yB != xB;
        out.println("!xB ^ yB && yB != xB = " + zB);
        zB = !xB ^ (yB && (yB != xB));
        out.println("!xB ^ (yB && (yB != xB)) = " + zB);

    }
}
