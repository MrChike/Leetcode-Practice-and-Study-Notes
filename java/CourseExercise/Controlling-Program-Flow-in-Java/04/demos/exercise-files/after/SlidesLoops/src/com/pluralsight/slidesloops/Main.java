package com.pluralsight.slidesloops;

public class Main {

    public static void main(String[] args) {
        whileLoop_ConditionInitiallyTrue();
        whileLoop_ConditionInitiallyFalse();
        doWhileLoop_ConditionInitiallyTrue();
        doWhileLoop_ConditionInitiallyFalse();
        forLoop_KeepDoublingValue();
        forLoop_KeepDoublingValue_WhileEquivalent();
        forLoop_Factorial();
        forLoopControlVariable_OutOfScope();
        forLoopControlVariable_ValueUpdatedInLoopBody();
        forEachLoop_SumValues();
        forEachLoop_SumValues_ForEquivalent();
        forEachLoopLimitations_TwoArraysOneIndex();
        forEachLoopLimitations_TwoArraysSeparateIndex();
    }

    private static void whileLoop_ConditionInitiallyTrue() {
        System.out.println("***************************");
        System.out.println("While Loop - Condition Initially True");
        System.out.println();

        int someValue = 4;

        System.out.println("someValue = " + someValue);
        System.out.println();

        int factorial = 1;
        while(someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println("factorial = " + factorial); // displays 1

        System.out.println("***************************");
        System.out.println();
    }

    private static void whileLoop_ConditionInitiallyFalse() {
        System.out.println("***************************");
        System.out.println("While Loop - Condition Initially False");
        System.out.println();

        int someValue = 1;

        System.out.println("someValue = " + someValue);
        System.out.println();

        int factorial = 1;
        while(someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println("factorial = " + factorial); // displays 1

        System.out.println("***************************");
        System.out.println();
    }

    private static void doWhileLoop_ConditionInitiallyTrue() {
        System.out.println("***************************");
        System.out.println("Do-while Loop - Condition Initially True");
        System.out.println();

        int iVal = 5;

        System.out.println("iVal = " + iVal);
        System.out.println();

        do {
            System.out.print(iVal + " * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 25);

        System.out.println("***************************");
        System.out.println();
    }

    private static void doWhileLoop_ConditionInitiallyFalse() {
        System.out.println("***************************");
        System.out.println("Do-while Loop - Condition Initially False");
        System.out.println();

        int iVal = 80;

        System.out.println("iVal = " + iVal);
        System.out.println();

        do {
            System.out.print(iVal + " * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 25);

        System.out.println("***************************");
        System.out.println();
    }

    private static void forLoop_KeepDoublingValue() {
        System.out.println("***************************");
        System.out.println("For Loop - Keep Doubling the Value");
        System.out.println();

        for(int i = 1; i < 100; i *= 2)
            System.out.println(i);

        System.out.println("***************************");
        System.out.println();
    }

    private static void forLoop_KeepDoublingValue_WhileEquivalent() {
        System.out.println("***************************");
        System.out.println("For Loop - Keep Doubling the Value - While Loop Equivalent");
        System.out.println();

        int i = 1;
        while(i < 100) {
            System.out.println(i);
            i *= 2;
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void forLoop_Factorial() {
        System.out.println("***************************");
        System.out.println("For Loop - Factorial");
        System.out.println();

        int factorial = 1;
        for (int num = 3; num > 1; num--){
            factorial *= num;
            System.out.println(num + " | " + factorial);
        }
        System.out.println("Result:" + factorial);

        System.out.println("***************************");
        System.out.println();
    }

    private static void forLoopControlVariable_OutOfScope() {
        System.out.println("***************************");
        System.out.println("For Loop Control Variable - OutOfScope");
        System.out.println();

        int factorial = 1;
        for (int num = 3; num > 1; num--){
            factorial *= num;
            System.out.println(num + " | " + factorial);
        }
        System.out.println("<<uncompilable line commented out>>");
        //System.out.println("Value of num is" + num); // this line won't compile
        System.out.println("Result:" + factorial);

        System.out.println("***************************");
        System.out.println();
    }

    private static void forLoopControlVariable_ValueUpdatedInLoopBody() {
        System.out.println("***************************");
        System.out.println("For Loop Control Variable - Value Updated In Loop Body");
        System.out.println();

        int factorial = 1;
        for (int num = 3; num > 1; num--){
            factorial *= num;
            System.out.println(num + " | " + factorial);
            num = num + 5;

            // Forcing loop to exit to avoid endless loop
            if (num > 30) {
                System.out.println("<< forcing loop to exit to avoid infinite loop>>");
                break;
            }
        }
        System.out.println("Result:" + factorial);

        System.out.println("***************************");
        System.out.println();
    }

    private static void forEachLoop_SumValues() {
        System.out.println("***************************");
        System.out.println("For-each Loop - Sum Values");
        System.out.println();

        float[] vals = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;
        for(float currentVal : vals) {
            System.out.println("currentVal = " + currentVal);
            sum += currentVal;
        }
        System.out.println(sum); // displays 45

        System.out.println("***************************");
        System.out.println();
    }

    private static void forEachLoop_SumValues_ForEquivalent() {
        System.out.println("***************************");
        System.out.println("For-each Loop - Sum Values - For Loop Equivalent");
        System.out.println();

        float[] vals = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;
        for(int i = 0; i < vals.length; i++) {
            float currentVal = vals[i];
            System.out.println("i = " + i + "  currentVal = " + currentVal);
            sum += currentVal;
        }

        System.out.println(sum); // displays 45

        System.out.println("***************************");
        System.out.println();
    }
    private static void forEachLoopLimitations_TwoArraysOneIndex() {
        System.out.println("***************************");
        System.out.println("For-each Loop Limitations - Two Arrays One Index");
        System.out.println();

        int[] left = {5, 3, 7};
        int[] right = {12, 9, 8};
        for(int i = 0; i < left.length; i++) {
            System.out.println("\ni = " + i + "  left[i] = " + left[i] +
                    "  right[i] = " + right[i]);
            int result = left[i] + right[i];
            System.out.println("result = " + result);
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void forEachLoopLimitations_TwoArraysSeparateIndex() {
        System.out.println("***************************");
        System.out.println("For-each Loop Limitations - Two Arrays Separate Index");
        System.out.println();

        int[] left = {5, 3, 7};
        int[] right = {12, 9, 8};
        for(int i = 0, j = right.length - 1; i < left.length; i++, j--) {
            System.out.println("\ni = " + i + "  left[i] = " + left[i] +
                    "  j = " + j + "  right[j] = " + right[j]);
            int result = left[i] + right[j];
            System.out.println("result = " + result);
        }

        System.out.println("***************************");
        System.out.println();
    }

}
