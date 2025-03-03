//package refactoringjavastudy.chapter06.ch0602;
//
//import java.sql.Driver;
//
//public class Before {
//    public int rating(Driver driver) {
//        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
//    }
//
//    private boolean moreThanFiveLateDeliveries(Driver driver) {
//        return driver.numberOfLateDeliveries > 5;
//    }
//}
