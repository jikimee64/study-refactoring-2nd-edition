package refactoringjavastudy.chapter01.factory;

import refactoringjavastudy.chapter01.Performance;
import refactoringjavastudy.chapter01.PerformanceCalculator;
import refactoringjavastudy.chapter01.Play;

public class ComedyCalculator extends PerformanceCalculator {
    public ComedyCalculator(Performance performance, Play play) {
        super(performance, play);
    }
}