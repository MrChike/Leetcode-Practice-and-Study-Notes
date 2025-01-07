package m3.v9_OrderOfOperations_Part2.after;
import static java.lang.System.out;

public class OrderOfOperations_Part2 {
    public static void main(String[] args) {
        out.println("\n** Order of Operations: Part 2 ** \n");

        int x = 3;
        int y = 4;
        boolean b = y + x * x > y & y != ++x;
        out.println("y + x * x > y & y != ++x = " + b);

        boolean xB = true;
        boolean yB = false;
        b = xB && yB ^ xB || yB | xB;
        out.println("xB && yB ^ xB || yB | xB = " + b);

        x = 3;
        y = 6;
        int z = 2;
        z *= y/x - y - x > y ? 4 : 2;
        out.println("z *= y/x - y - x > y ? 4 : 2 = " + z);

    }
}

