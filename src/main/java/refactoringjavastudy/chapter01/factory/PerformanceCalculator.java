package refactoringjavastudy.chapter01.factory;

import refactoringjavastudy.chapter01.Performance;
import refactoringjavastudy.chapter01.Play;
import refactoringjavastudy.chapter01.PlayType;

public class PerformanceCalculator {

    private Performance performance;
    private Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    public int amountFor() throws Exception {
        int result;
        switch (play.getType()) {
            case TRAGEDY:
                result = 40000;
                if (performance.getAudience() > 30) {
                    result += 1000 * (performance.getAudience() - 30);
                }
                break;
            case COMEDY:
                result = 30000;
                if (performance.getAudience() > 20) {
                    result += 10000 + 500 * (performance.getAudience() - 20);
                }
                result += 300 * performance.getAudience();
                break;
            default:
                throw new Exception("알 수 없는 장르");
        }
        return result;
    }

    public int volumeCreditFor(Performance performance) {
        int result = 0;

        // 포인트를 적립한다.
        result += Math.max(performance.getAudience() - 30, 0);

        // 희극 관객 5명마다 추가 포인트를 제공핟나.
        if (play.getType().equals(PlayType.COMEDY)) {
            result += Math.floor(performance.getAudience() / 5);
        }
        return result;
    }

}
