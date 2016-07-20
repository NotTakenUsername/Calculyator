import java.util.List;

/**
 * Created by ykhodos on 7/19/2016.
 */
public class Divide extends Operation {
    @Override
    public double calculate(List<Double> listOfDoubles) {
        double result = listOfDoubles.get(0);
        if (listOfDoubles.get(1) == 0 || listOfDoubles.get(1)==null) {
            System.out.println("Impossible to divide on zero");
            Validator.setIsValid(false);
        } else {
            for (int i = 1; i < listOfDoubles.size(); i++) {
                result = result / listOfDoubles.get(i);

            }
        }
        return result;
    }
}
