package refactoringjavastudy.chapter06.ch0605;

public class BeforeAfter {

    // before
    public double circum(double radius) {
        return 2 * Math.PI * radius;
    }

    // after
    public double circum(double radius) {
        return circumference(radius);
    }

    private double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // after 2
    // 매개변수 추가
    public void addReservation(Customer customer) {
        priorityAddReservation(customer, false);
    }

    private void priorityAddReservation(Customer customer, boolean isPriority) {
        this.reservations.add(customer);
    }

}
