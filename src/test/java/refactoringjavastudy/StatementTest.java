package refactoringjavastudy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import refactoringjavastudy.chapter01.Invoice;
import refactoringjavastudy.chapter01.Performance;
import refactoringjavastudy.chapter01.Play;
import refactoringjavastudy.chapter01.PlayType;
import refactoringjavastudy.chapter01.Plays;
import refactoringjavastudy.chapter01.Statement;

public class StatementTest {

    @Test
    void statementRenderPlainText() throws Exception {
        Statement statement = new Statement();

        List<Performance> performances = getPerformancesForTest();

        // Invoice 데이터 생성
        Invoice invoice = new Invoice("손님1", performances);

        HashMap<String, Play> playMap = getStringPlayHashMapForTest();

        //playMap 데이터 생성
        Plays plays = new Plays(playMap);

        String statementResult = statement.statement(invoice, plays);

        String expectedAnswer = """
                청구내역 (고객명: 손님1)
                hamelet: $600 50석
                young: $1100 100석
                hyun: $2100 200석
                총액: $3800
                적립 포인트: 280점""";
        Assertions.assertEquals(statementResult, expectedAnswer);
    }

    private static HashMap<String, Play> getStringPlayHashMapForTest() {
        // playMap 데이터 작성
        HashMap<String, Play> playMap = new HashMap<>();
        playMap.put("hamlet", new Play("hamelet", PlayType.TRAGEDY));
        playMap.put("young", new Play("young", PlayType.COMEDY));
        playMap.put("hyun", new Play("hyun", PlayType.TRAGEDY));
        return playMap;
    }

    private static List<Performance> getPerformancesForTest() {
        // performances 데이터 작성
        List<Performance> performances = new ArrayList<>();
        performances.add(new Performance("hamlet", 50));
        performances.add(new Performance("young", 100));
        performances.add(new Performance("hyun", 200));
        return performances;
    }

}
