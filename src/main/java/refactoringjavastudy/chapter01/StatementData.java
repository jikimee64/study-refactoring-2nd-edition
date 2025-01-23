package refactoringjavastudy.chapter01;

import java.util.List;

public class StatementData {

    private Invoice invoice;
    private Plays plays;

    public StatementData(Invoice invoice, Plays plays) {
        this.invoice = invoice;
        this.plays = plays;
    }

    public String getCustomer() {
        return invoice.getCustomer();
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public List<Performance> getPerformances() {
        return invoice.getPerformances();
    }

    public Play playFor(Performance performance) {
        return plays.get(performance);
    }

    public int amountFor(Performance performance) throws Exception {
        return new PerformanceCalculator(performance, playFor(performance)).amountFor(performance);
    }

    public int totalAmount() throws Exception {
        int totalAmount = 0;
        for (Performance performance : invoice.getPerformances()) {
            totalAmount += amountFor(performance);
        }
        return totalAmount / 100;
    }

    public int totalVolumeCredits() {
        int volumeCredit = 0;
        for (Performance performance : invoice.getPerformances()) {
            volumeCredit += volumeCreditFor(performance);
        }
        return volumeCredit;
    }

    private int volumeCreditFor(Performance performance) {
        return new PerformanceCalculator(performance, playFor(performance)).volumeCreditFor(performance);
    }
}
