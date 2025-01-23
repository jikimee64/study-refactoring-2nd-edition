package refactoringjavastudy.chapter01.factory;

import refactoringjavastudy.chapter01.Performance;
import refactoringjavastudy.chapter01.Play;

public class TragedyCalculator extends PerformanceCalculator {

    public TragedyCalculator(Performance performance, Play play) {
        super(performance, play);
    }
}