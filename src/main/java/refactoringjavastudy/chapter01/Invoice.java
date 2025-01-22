package refactoringjavastudy.chapter01;

import java.util.List;

public class Invoice {
    private final String customer;
    private final List<Performance> performanceList;

    public Invoice(String customer, List<Performance> performanceList) {
        this.customer = customer;
        this.performanceList = performanceList;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Performance> getPerformances() {
        return performanceList;
    }

}
