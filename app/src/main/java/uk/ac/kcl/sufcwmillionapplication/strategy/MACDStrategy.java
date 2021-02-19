package uk.ac.kcl.sufcwmillionapplication.strategy;

import java.util.List;

import uk.ac.kcl.sufcwmillionapplication.bean.CalculateResult;
import uk.ac.kcl.sufcwmillionapplication.bean.DailyQuote;

public class MACDStrategy implements FinanceStrategy{
    //short_term and long_term can get from the result of EMA(for example, MACD = EMA(26)-EMA(12))
    public static double[]<CalculateResult> calculate(double[] short_term, double[] long_term) {
        double[] result = new double[short_term.length];
        for(int i = 0; i < short_term.length; i++) {
            result[i] = short_term[i] - long_term[i];
        }
        return result;
    }
}
