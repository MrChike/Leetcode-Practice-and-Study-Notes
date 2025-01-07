package m2.v8_Number_Systems.after;

import static java.lang.System.out;

public class NumberSystems {
    public static void main(String [] args){

        out.println("\n** Alternative Number Systems ** \n");

        /* Java supports base-10, octal, hexadecimal and binary number systems*/

        int w = 100;        // base 10 literal
        int x = 0144;       // Octal literal
        int y = 0x0064;     // Hexadecimal literal
        int z = 0b1100100;  // binary literal

        /* although these number systems are different the can be compared */
        if( w == x && x == y && y == z){
            out.println("w == x == y == z");
        }else{
            out.println("w,x,y,z are not equal");
        }

        /* Java supports base-10, octal, hexadecimal and binary number systems*/

        int a = 1_000;        	// base 10 literal
        int b = 017_50;       	// Octal literal
        int c = 0x0_3E8;     	// Hexadecimal literal
        int d = 0b11_11101000;  // binary literal

        /* although these number systems are different the can be compared */
        if( a == b && b == c && c == d){
            out.println("a == b == c == d");
        }else{
            out.println("a,b,c,d are not equal");
        }

        /* underscores cannot appear before or after the number system prefix

        int e = 1000;        // base 10 literal
        int f = _01750;       // Octal literal
        int g = 0x_0_3E8;     // Hexadecimal literal
        int h = 0b_100_100;  // binary literal

        */

    }
}
