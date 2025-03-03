package refactoringjavastudy.chapter06.ch0610;

/**
 * reading = {
 *   "customer": "ivan",
 *   "quantity": 10,
 *   "month": 5,
 *   "year": 2017
 * }
 */
public class BeforeAfter {

    public static void main(String[] args) {
        // 클라이언트1
        Reading reading = acquireReading();
        double baseCharge = baseRate(reading.month, reading.year) * reading.quantity;

        // 클라이언트2
        Reading reading = acquireReading();
        double base = (baseRate(reading.month, reading.year) * reading.quantity);
        double taxableCharge = Math.max(0, base - taxThreshold(reading.year));

        Reading reading = acquireReading();
        double base = calculateBaseCharge(reading)
    }


    public static double calculateBaseCharge(Reading reading) {
        return (baseRate(reading.month, reading.year) * reading.quantity);
    }

    // after
    public Reading enrichReading(Reading reading) throws Exception {
        Reading result = reading.clone();
        result.baseCharge = calculateBaseCharge(result);
        return result;
    }

}
