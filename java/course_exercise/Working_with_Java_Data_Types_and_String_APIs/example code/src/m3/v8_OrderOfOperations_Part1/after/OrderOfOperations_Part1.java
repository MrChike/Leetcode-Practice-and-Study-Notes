package m3.v8_OrderOfOperations_Part1.after;
import static java.lang.System.out;

public class OrderOfOperations_Part1 {
    public static void main(String[] args) {
        out.println("\n** Order of Operations: Part 1 ** \n");

        int x = 3;
        int y = 4;
        int z = x++ + y + --y + x;
        out.println("x++ + y + --y + x = " + z);

        x = 3;
        y = 4;
        z = --x + -x + +y--;
        out.println("--x + -x + +y-- = " + z);

        x = 3;
        y = 4;
        z = x * x++ + y - y / x;
        out.println("x * x++ + y - y / x = " + z);
    }
}
