package com.pluralsight.slidesconditionallogic;

public class Main {

    public static void main(String[] args) {
	    ifElse_ConditionTrue();
        ifElse_ConditionFalse();

        ifElse_MultipleStatements_NoBlock_ConditionFalse();
        ifElse_MultipleStatements_NoBlock_ConditionTrue();

        ifElse_MultipleStatements_WithBlock_ConditionTrue();
        ifElse_MultipleStatements_WithBlock_ConditionFalse();

        chainingIfElse();
        chainingIfElse_Age_ConditionOrderIncorrect();
        chainingIfElse_Age_ConditionOrderCorrect();

        nestedIf_NoRoomsCheck();
        nestedIf_WithRoomsCheck_NoBlock();
        nestedIf_WithRoomsCheck_WithBlock();

        logicalOperators();

        validConditions();
    }

    private static void ifElse_ConditionTrue() {
        System.out.println("***************************");
        System.out.println("if-else - Condition True");
        System.out.println();

        int value1 = 10;
        int value2 = 4;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println();

        if (value1 > value2)
            System.out.println("value 1 is bigger");
        else
            System.out.println("value 1 is not bigger");
        System.out.println("Keep working...");

        System.out.println("***************************");
        System.out.println();
    }

    private static void ifElse_ConditionFalse() {
        System.out.println("***************************");
        System.out.println("if-else - Condition False");
        System.out.println();

        int value1 = 1;
        int value2 = 4;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println();

        if (value1 > value2)
            System.out.println("value 1 is bigger");
        else
            System.out.println("value 1 is NOT bigger");
        System.out.println("Keep working...");

        System.out.println("***************************");
        System.out.println();
    }

    private static void ifElse_MultipleStatements_NoBlock_ConditionFalse() {
        System.out.println("***************************");
        System.out.println("if-else - Multiple Statements - No Block Statements - Condition False");
        System.out.println();

        int value1 = 1, value2 = 4;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println();

        int diff = 0;
        if (value1 > value2)
            diff = value1 - value2;
        else
            diff = value2 - value1;
            System.out.println("value 1 is NOT bigger than value 2, diff = " + diff);

        System.out.println("***************************");
        System.out.println();
    }

    private static void ifElse_MultipleStatements_NoBlock_ConditionTrue() {
        System.out.println("***************************");
        System.out.println("if-else - Multiple Statements - No Block Statements - Condition True");
        System.out.println();

        int value1 = 10, value2 = 4;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println();

        int diff = 0;
        if (value1 > value2)
            diff = value1 - value2;
        else
            diff = value2 - value1;
        System.out.println("value 1 is NOT bigger than value 2, diff = " + diff);

        System.out.println("***************************");
        System.out.println();
    }

    private static void ifElse_MultipleStatements_WithBlock_ConditionTrue() {
        System.out.println("***************************");
        System.out.println("if-else - Multiple Statements - With Block Statements - Condition True");
        System.out.println();

        int value1 = 10, value2 = 4;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println();

        int diff = 0;
        if (value1 > value2) {
            diff = value1 - value2;
            System.out.println("value 1 is bigger than value 2, diff = " + diff);

        }
        else {
            diff = value2 - value1;
            System.out.println("value 1 is NOT bigger than value 2, diff = " + diff);
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void ifElse_MultipleStatements_WithBlock_ConditionFalse() {
        System.out.println("***************************");
        System.out.println("if-else - Multiple Statements - With Block Statements - Condition False");
        System.out.println();

        int value1 = 1, value2 = 4;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println();

        int diff = 0;
        if (value1 > value2) {
            diff = value1 - value2;
            System.out.println("value 1 is bigger than value 2, diff = " + diff);

        }
        else {
            diff = value2 - value1;
            System.out.println("value 1 is NOT bigger than value 2, diff = " + diff);
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void chainingIfElse() {
        System.out.println("***************************");
        System.out.println("Chaining if-else");
        System.out.println();

        int value1 = 10, value2 = 40, diff = 0;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println();

        if (value1 > value2) {
            diff = value1 - value2;
            System.out.println("value 1 is bigger, diff = " + diff);
        }
        else if (value1 < value2) {
            diff = value2 - value1;
            System.out.println("value 2 is bigger, diff = " + diff);
        }
        else {
            System.out.println("value 1 and value 2 are equal");
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void chainingIfElse_Age_ConditionOrderIncorrect() {
        System.out.println("***************************");
        System.out.println("Chaining if-else - Age - Condition Order Incorrect");
        System.out.println();

        int age = 70;

        System.out.println("age = " + age);
        System.out.println();

        if (age > 17) {
            System.out.println("Adult");
        }
        else if (age > 64) {
            System.out.println("Senior adult");
        }
        else {
            System.out.println("Minor");
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void chainingIfElse_Age_ConditionOrderCorrect() {
        System.out.println("***************************");
        System.out.println("Chaining if-else - Age - Condition Order Correct");
        System.out.println();

        int age = 70;

        System.out.println("age = " + age);
        System.out.println();

        if (age > 64) {
            System.out.println("Senior adult");
        }
        else if (age > 17) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Minor");
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void nestedIf_NoRoomsCheck() {
        System.out.println("***************************");
        System.out.println("Nested If - No Rooms Check");
        System.out.println();

        int students = 0;
        int rooms = 4;

        System.out.println("students = " + students);
        System.out.println("rooms = " + rooms);
        System.out.println();

        if(students > 0) {
            System.out.println("Students per room: " + students / rooms);
        }
        else
            System.out.println("NO students");

        System.out.println("***************************");
        System.out.println();
    }

    private static void nestedIf_WithRoomsCheck_NoBlock() {
        System.out.println("***************************");
        System.out.println("Nested If - With Rooms Check - No Block Statement");
        System.out.println();

        int students = 0;
        int rooms = 4;

        System.out.println("students = " + students);
        System.out.println("rooms = " + rooms);
        System.out.println();

        if(students > 0)
            if(rooms > 0)
                System.out.println("Students per room: " + students / rooms);
        else
            System.out.println("NO students");

        System.out.println("***************************");
        System.out.println();
    }

    private static void nestedIf_WithRoomsCheck_WithBlock() {
        System.out.println("***************************");
        System.out.println("Nested If - With Rooms Check - With Block Statement");
        System.out.println();

        int students = 0;
        int rooms = 4;

        System.out.println("students = " + students);
        System.out.println("rooms = " + rooms);
        System.out.println();

        if(students > 0) {
            if(rooms > 0)
                System.out.println("Students per room: " + students / rooms);
        }
        else
            System.out.println("NO students");

        System.out.println("***************************");
        System.out.println();
    }

    private static void logicalOperators() {
        System.out.println("***************************");
        System.out.println("Logical Operators");
        System.out.println();

        int a = 20, b = 14, c = 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        if ( a > b && b > c )
            System.out.println("a is greater than c");

        System.out.println("***************************");
        System.out.println();
    }

    private static void validConditions() {
        System.out.println("***************************");
        System.out.println("Valid Conditions");
        System.out.println();

        int iVal = 1;

//        if (iVal) // won't compile
//            System.out.println("Won't compile");

//        if (iVal = 1) // won't compile
//            System.out.println("Still won't compile");

        if (iVal == 1)
            System.out.println("This works!");

        System.out.println("***************************");
        System.out.println();
    }

}
