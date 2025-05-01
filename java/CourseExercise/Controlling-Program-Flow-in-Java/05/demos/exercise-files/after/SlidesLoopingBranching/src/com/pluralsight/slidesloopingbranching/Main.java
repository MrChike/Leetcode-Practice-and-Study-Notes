package com.pluralsight.slidesloopingbranching;

public class Main {

    public static void main(String[] args) {
        forWithIf();
	    ifWithDoWhile();
        nestedLoops_ForWithFor();
        nestedLoops_ForEachWithForEach();
        continue_SingleWhileLoop();
        continue_SingleForLoop();
        break_SingleWhileLoop();
        break_NestedLoops_While_While();
        break_NestedLoops_For_While();
        break_BonusSample_ComplexMixOfLoopsAndSwitchStatements();
        return_NestedLoops_For_For();
        infiniteLoop_For();
        infiniteLoop_While();
        infiniteLoop_While_ConditionFixed();
        infiniteLoop_For_Check();
    }

    private static void forWithIf() {
        System.out.println("***************************");
        System.out.println("For Loop - Containing Nested If-else");
        System.out.println();

        int evenCount = 0;
        for(int i = 10; i > 0; i--) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.println(" is even");
                evenCount++;
            }
            else
                System.out.println(" is odd");
        }
        System.out.println("Even count = " + evenCount);

        System.out.println("***************************");
        System.out.println();
    }

    private static void ifWithDoWhile() {
        System.out.println("***************************");
        System.out.println("If-else - Containing Nested Do-while Loop");
        System.out.println();

        int iVal = 1;
        if(iVal < 5)
            do
                System.out.println("iVal = " + iVal++);
            while(iVal < 5);
        else
            System.out.println("iVal is not less than 5");

        System.out.println("***************************");
        System.out.println();
    }

    private static void nestedLoops_ForWithFor() {
        System.out.println("***************************");
        System.out.println("Nested Loops - For Loop Containing For Loop");
        System.out.println();

        int[][] multi = {{100, 105, 110},
                         {200, 205, 210},
                         {300, 305, 310}};

        for(int i = 0; i < multi.length; i++)
            for(int j = 0; j < multi[i].length; j++)
                System.out.println(multi[i][j]);

        System.out.println("***************************");
        System.out.println();
    }

    private static void nestedLoops_ForEachWithForEach() {
        System.out.println("***************************");
        System.out.println("Nested Loops - For-each Loop Containing For-each Loop");
        System.out.println();

        int[][] multi = {{100, 105, 110},
                         {200, 205, 210},
                         {300, 305, 310}};

        for(int[] simple : multi)
            for(int value : simple)
                System.out.println(value);

        System.out.println("***************************");
        System.out.println();
    }

    private static void continue_SingleWhileLoop() {
        System.out.println("***************************");
        System.out.println("Continue Statement - While Loop");
        System.out.println();

        int iVal = 0;
        while (iVal < 10) {
            iVal++;
            if(iVal % 2 == 0)
                continue;
            System.out.println("iVal = " + iVal);
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void continue_SingleForLoop() {
        System.out.println("***************************");
        System.out.println("Continue Statement - For Loop");
        System.out.println("******* Bonus Sample ******");
        System.out.println();

        for(int iVal = 1; iVal < 10; iVal++) {
            if(iVal % 2 == 0)
                continue;
            System.out.println("iVal = " + iVal);
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void break_SingleWhileLoop() {
        System.out.println("***************************");
        System.out.println("Break Statement - While Loop");
        System.out.println();

        int sum = 0;
        int iVal = 1;
        while (iVal < 10) {
            sum += iVal;
            System.out.println("iVal = " + iVal + " sum = " + sum);
            if(sum > 5)
                break;
            iVal++;
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void break_NestedLoops_While_While() {
        System.out.println("***************************");
        System.out.println("Break Statement - Nested Loops - While Loop Containing While Loop");
        System.out.println();

        int iValStart = 1;
        while (iValStart < 4) {
            System.out.println("iValStart = " + iValStart);
            int sum = 0, iVal = iValStart;
            while (iVal < 10) {
                sum += iVal;
                System.out.println("iVal = " + iVal + " sum = " + sum);
                if (sum > 5)
                    break;
                iVal++;
            }
            iValStart++;
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void break_NestedLoops_For_While() {
        System.out.println("***************************");
        System.out.println("******* Bonus Sample ******");
        System.out.println("Break Statement - Nested Loops - For Loop Containing While Loop");
        System.out.println();

        for (int iValStart = 1; iValStart < 4; iValStart++) {
            System.out.println("iValStart = " + iValStart);
            int sum = 0, iVal = iValStart;
            while (iVal < 10) {
                sum += iVal;
                System.out.println("iVal = " + iVal + " sum = " + sum);
                if (sum > 5)
                    break;
                iVal++;
            }
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void break_BonusSample_ComplexMixOfLoopsAndSwitchStatements() {
        System.out.println("***************************");
        System.out.println("******* Bonus Sample ******");
        System.out.println("Break Statement - Complex Mix of Loops and Switch");
        System.out.println();

        for (int iValStart = 1; iValStart < 4; iValStart++) {
            System.out.println("iValStart = " + iValStart);
            int sum = 0, iVal = iValStart;
            switch(iValStart % 2) {
                case 0:
                    System.out.println("Inner loop will increment each time by 2");
                    while (iVal < 10) {
                        sum += iVal;
                        System.out.println("iVal = " + iVal + " sum = " + sum);
                        switch (iVal % 2) {
                            case 0:
                                System.out.println("iVal is even");
                                break; // exists switch(iVal % 2) - does not effect while
                            case 1:
                                System.out.println("iVal is odd");
                                break; // exists switch(iVal % 2) - does not effect while
                        }
                        if (sum > 5)
                            break; // exits while - does not effect switch(iValStart %2)
                        iVal += 2;
                    }
                    break; // exists switch(iValStart % 2) - does not effect for
                case 1:
                    System.out.println("Inner loop will increment each time by 1");
                    while (iVal < 10) {
                        sum += iVal;
                        System.out.println("iVal = " + iVal + " sum = " + sum);
                        switch (iVal % 2) {
                            case 0:
                                System.out.println("iVal is even");
                                break; // exists switch(iVal % 2) - does not effect while
                            case 1:
                                System.out.println("iVal is odd");
                                break; // exists switch(iVal % 2) - does not effect while
                        }
                        if (sum > 5)
                            break; // exits while - does not effect switch(iValStart %2)
                        iVal++;
                    }
                    break; // exists switch(iValStart % 2) - does not effect for
            }
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void return_NestedLoops_For_For() {
        System.out.println("***************************");
        System.out.println("Return Statement - Nested Loops - For Loop Containing For Loop");
        System.out.println();

        System.out.println("Before method call");
        methodWithLoops();
        System.out.println("After method call");

        System.out.println("***************************");
        System.out.println();
    }

    private static void methodWithLoops() {
        for (int iValStart = 1; iValStart < 4; iValStart++) {
            System.out.println("loopStart = " + iValStart);
            for (int iVal = iValStart; iVal < 10; iVal++) {
                System.out.println("iVal = " + iVal);
                if (iVal == 3) return;
            }
        }
    }

    private static void infiniteLoop_For() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - For Loop");
        System.out.println();

        int maxIterations = 5;
        int currentIteration = 0;
        for(;;) {
            System.out.println("Looping...");
            // Code to keep loop from running infinitely
            if(++currentIteration >= maxIterations) {
                System.out.println("**** exiting loop because appears to be infinite***");
                break;
            }
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void infiniteLoop_While() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - While Loop");
        System.out.println();

        int iVal = 1;
        while(iVal != 4) {
            System.out.println("iVal = " + iVal);
            iVal += 2;
            // Code to keep loop from running infinitely
            if(iVal > 10) {
                System.out.println("**** exiting loop because appears to be infinite***");
                break;
            }
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void infiniteLoop_While_ConditionFixed() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - While Loop - Condition Fixed");
        System.out.println();

        int iVal = 1;
        while(iVal <= 4) {
            System.out.println("iVal = " + iVal);
            iVal += 2;
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void infiniteLoop_For_Check() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - For Loop - Condition Checked Before Start");
        System.out.println();

        int stepVal = -1;
        if (stepVal > 0)
            for(int iVal = 1; iVal < 10; iVal += stepVal)
                System.out.println("iVal = " + iVal);
        else
            System.out.println("Invalid stepVal: " + stepVal);

        System.out.println("***************************");
        System.out.println();
    }

}
