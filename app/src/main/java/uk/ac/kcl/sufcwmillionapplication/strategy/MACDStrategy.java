package uk.ac.kcl.sufcwmillionapplication.strategy;

import java.util.ArrayList;
import java.util.List;

import uk.ac.kcl.sufcwmillionapplication.bean.CalculateResult;
import uk.ac.kcl.sufcwmillionapplication.bean.DailyQuote;
import uk.ac.kcl.sufcwmillionapplication.strategy.EMAStrategy;

public class MACDStrategy implements FinanceStrategy{
    //short_term and long_term can get from the result of EMA(for example, MACD = EMA(26)-EMA(12))
    public static List<CalculateResult> calculate(List<DailyQuote> dailyQuoteList) {
        ArrayList short_term = EMAStrategy.calculate(dailyQuoteList, 12);
        ArrayList long_term = EMAStrategy.calculate(dailyQuoteList, 26);
        ArrayList result = new ArrayList();
        for(int i = 0; i < short_term.size(); i++) {
            result.add((Double)short_term.get(i) - (Double)long_term.get(i));
        }
        return result;
    }
}
