package refactoringjavastudy.chapter06.ch0608;

import java.util.stream.Collectors;

public class Before {

    public static void main(String[] args) {
        List<Reading> alerts = readingsOutsideRange(station,
            operationPlan.temperatureFloor, // 최저 온도
            operationPlan.temperatureCeiling) //최고 온도
    }

    // before
    public List<Reading> readingsOutsideRange(Station station, int min, int max) {
        return station.readings
            .stream()
            .filter(r -> r.temp < min || r.temp > max)
            .collect(Collectors.toList());
    }

    // after
    // 처음에는 컴파일 에러가 나지 않도록 매개변수를 뒤에 추가한다.
    // 그다음 내부 구현을 변경하면서 기존 매개변수를 지우고 새로운 매개변수를 사용하도록 변경한다.
    public List<Reading> readingsOutsideRange(Station station, int min, int max, NumberRange numberRange) {
        return station.readings
            .stream()
            .filter(r -> r.temp < numberRange.getMax() || r.temp > numberRange.getMax())
            .collect(Collectors.toList());
    }

    public static class NumberRange {
        protected int min;
        protected int max;

        public NumberRange(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }
}
