package org.ocptest.chapter1.assessmentTest;

public class Question05 {

    public class MathFunctions {
        public static int addToInt(int x, int amountToAdd){
            x = x + amountToAdd % -5;
            System.out.println( amountToAdd % -5);
            return x + amountToAdd % -5;
        }
    }

    public static void main(String[] args) {
        var a = 15;
        var b = 10;

        System.out.println(MathFunctions.addToInt(a, b));
        System.out.println(a);
    }

}
