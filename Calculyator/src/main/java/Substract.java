import java.util.List;

/**
 * Created by ykhodos on 7/19/2016.
 */
public class Substract extends Operation {
    @Override
    public double calculate(List<Double> listOfDoubles) {
        double result=0;
        for (Double d : listOfDoubles
                ) {
            result = result-d;
        }
        return result;
    }

}
