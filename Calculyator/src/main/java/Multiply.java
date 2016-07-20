import java.util.List;

/**
 * Created by ykhodos on 7/19/2016.
 */
public class Multiply extends Operation {
    @Override
    public double calculate(List<Double> listOfDoubles) {
        double result = listOfDoubles.get(0);
        for (int i=1; i<listOfDoubles.size(); i++) {
          result = result*listOfDoubles.get(i);
        }

        return result;
    }
}
