import java.util.List;

/**
 * Created by ykhodos on 6/27/2016.
 */
public class Facade {
    public static void main(String[] args) {

        Input input = new Input();
        ParseInput parseInput = new ParseInput();

        System.out.println("Welcome to calculyator.\nPlease enter desired operation");
        input.setInput();

        ProcessOperation processOperation = new ProcessOperation();
        Double result = processOperation.calculate(input.getInput());
        System.out.println(result);
    }
}
