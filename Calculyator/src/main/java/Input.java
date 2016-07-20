import java.util.Scanner;

/**
 * Created by ykhodos on 6/29/2016.
 */
public class Input {
    private String input = "Nothing was entered. Or input is incorrect. Input pattern is number-operator-number";
    public void setInput(){
         Scanner in = new Scanner(System.in);
         String input = in.nextLine();

        if(input.matches("[-]*[0-9]*[.]*[0-9][/,*,+,-][0-9]*[.]*[0-9]")){
            this.input = input;
        }
        else {
            System.out.println(input);
        }
    }

    public String getInput(){
        return input;
    }


}
