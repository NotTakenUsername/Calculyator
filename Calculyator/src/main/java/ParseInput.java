import java.util.ArrayList;
import java.util.List;

/**
 * Created by ykhodos on 6/29/2016.
 */
public class ParseInput {

   public List<Double> stringToDouble(String input){
       List<Double> result = new ArrayList<Double>();
       boolean isNegative=false;

      if (input.startsWith("-")) {
          input = input.substring(1,input.length());
          isNegative = true;

      }

       String[] parseString = input.split("[+,\\-,/,*]");

       //заполним список стринговыми значениями чисел
       for (int i=0;i<parseString.length; i++ ) {

           result.add(i,Double.parseDouble(parseString[i]));
       }
       if (isNegative){
           result.set(0, -1.0*result.get(0));

       }


        return result;

   }
}
