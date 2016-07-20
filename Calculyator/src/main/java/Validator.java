/**
 * Created by ykhodos on 7/20/2016.
 */
public class Validator {
    private static boolean result = true;
    public static void setIsValid(boolean isValid) {
        result = isValid;
    }
    public static boolean getValidation(){
        return result;
    }
}
