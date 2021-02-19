package uk.ac.kcl.sufcwmillionapplication.strategy;

import java.util.List;

import uk.ac.kcl.sufcwmillionapplication.bean.CalculateResult;
import uk.ac.kcl.sufcwmillionapplication.bean.DailyQuote;

public class MACDStrategy implements FinanceStrategy{
    //short_term and long_term can get from the result of EMA(for example, MACD = EMA(26)-EMA(12))
    public static List<CalculateResult> calculate(ArrayList short_term, ArrayList long_term) {
        ArrayList result = new ArrayList();
        for(int i = 0; i < short_term.size(); i++) {
            result.add((Double)short_term.get(i) - (Double)long_term.get(i));
        }
        return result;
    }
}
