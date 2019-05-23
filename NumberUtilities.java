


public class NumberUtilities {

    public static String getRange(int stop) {
        String result = "";
        for(int i = 0; i < stop; i++){
            result = result + i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            result = result + i;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        int increment = start;
        while(increment < stop){
            result = result + increment;
            increment += step;
        }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 0) result += i;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i < stop; i++){
            if(i % 2 != 0) result += i;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        int num = 0;
        int finalNum = 0;
        for(int i = start; i <= stop; i++){
            num = i;
            finalNum = i;
            for(int j = 1; j < exponent; j++){
                finalNum *= num;
            }
            result += finalNum;
        }
        return result;
    }
}
