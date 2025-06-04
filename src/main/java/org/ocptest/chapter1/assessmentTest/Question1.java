package org.ocptest.chapter1.assessmentTest;

public class Question1 {
    public static void main(String[] args) {

        final int score1 = 8, score2 = 3;
        Integer myScore = 9;
        var goal = switch (myScore){
            case score1, score2, 7 -> "good";
            case Integer i when i < 10 -> {
                System.out.println(i);
                yield "better";
            }
            case Integer i when i >= 10 -> "best";
            default -> { yield "unknown";}
        };
        System.out.println(goal);


    }
}