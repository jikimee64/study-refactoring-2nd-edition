//package refactoringjavastudy.chapter06.chapter0601;
//
//import java.time.LocalDateTime;
//import refactoringjavastudy.chapter01.Invoice;
//
//public class After {
//    public void printOwing(Invoice invoice) {
//        int outstanding = 0;
//
//        printBanner();
//
//        // 미해결 채무 (outstanding) 을 계산한다.
//        outstanding = calculateOutstanding(invoice);
//
//        // 마감일(dueDate) 을 기록한다.
//        recordDueDate(invoice);
//
//        // 세부 사항을 출력한다.
//        printDetails(invoice, outstanding);
//
//    }
//
//    private void printDetails(Invoice invoice, int outstanding) {
//        System.out.println(String.format("고객명: %s", invoice.customer));
//        System.out.println(String.format("채무액: %d", outstanding));
//        System.out.println(String.format("마감일: %s", invoice.dueDate));
//    }
//
//    private void recordDueDate(Invoice invoice) {
//        LocalDateTime today = Clock.today();
//        invoice.dueDate = today.plusDays(30);
//    }
//
//    private int calculateOutstanding(Invoice invoice) {
//        int result = 0;
//        for (Order o : invoice.getOrders()) {
//            result += o.amount;
//        }
//        return result;
//    }
//
//    private void printBanner() {
//        System.out.println("*****************");
//        System.out.println("**** 고객 채무 ****");
//        System.out.println("*****************");
//    }
//}
