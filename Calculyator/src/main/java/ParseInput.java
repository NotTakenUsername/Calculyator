import java.util.ArrayList;
import java.util.List;

/**
 * Created by ykhodos on 6/29/2016.
 */
public class ParseInput {

   public List<Double> getDouble(String input){
       Double[] numbers = null;
       List<Double> doubleArrayList = new ArrayList<Double>();

       //разделим ввод. оператор выступит разделителем
       String[] parseString = input.split("[+,-,/,*]");

       //заполним список стринговыми значениями чисел
       for (int i=0;i<parseString.length; i++ ) {
           doubleArrayList.add(i,Double.parseDouble(parseString[i]));
       }

        return doubleArrayList;

   }
}
