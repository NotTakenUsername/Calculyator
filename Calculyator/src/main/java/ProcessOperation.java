import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ykhodos on 7/19/2016.
 */
public class ProcessOperation {


    public Double calculate(String input){
        Double result=0.0;
        ParseInput parseInput = new ParseInput();
        List<Double> numbers = parseInput.getDouble(input);



        Map<Character,Operation> operators = new HashMap<Character,Operation>();
        operators.put('+', new Add());
        operators.put('-', new Substract());
        operators.put('*', new Multiply());
        operators.put('/', new Divide());

        for (int i=0;i<input.length();i++){
            if (input.startsWith("-")){
                input = input.substring(1,input.length());
            }
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/' || input.charAt(i) == '*') {
                    result = operators.get(input.charAt(i)).calculate(numbers);
            }
        }
        return result;
    }
}
