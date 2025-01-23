package refactoringjavastudy.chapter01.factory;

import refactoringjavastudy.chapter01.Performance;
import refactoringjavastudy.chapter01.Play;

public class ComedyCalculator extends PerformanceCalculator {
    public ComedyCalculator(Performance performance, Play play) {
        super(performance, play);
    }

    @Override
    public int amountFor() {
        int result = 30000;
        if (performance.getAudience() > 20) {
            result += 10000 + 500 * (performance.getAudience() - 20);
        }
        result += 300 * performance.getAudience();
        return result;
    }

    @Override
    public int volumeCreditFor(Performance performance) {
        int result = 0;

        // 포인트를 적립한다.
        result += Math.max(performance.getAudience() - 30, 0);
        result += Math.floor(performance.getAudience() / 5);

        return result;
    }
}
