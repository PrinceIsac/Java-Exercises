import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class JavaExercises {
    public static void main(String[] args) {
        System.out.println(sumDigPow(1, 100));
    }


    public static List<Long> sumDigPow(long a, long b) {
        List<Long> results = new ArrayList<>();
        //Loop for all the numbers in the range
        for(long x = a; x <= b; x++){
            //Convert the number in our current index to a string to loop over
            String numStr = Long.toString(x);
            // sum to be compared with the original number
            double sum = 0;
            //Loop through the string number to access each digit
            for(int y = 0; y < numStr.length(); y++){
                //Raise the current number to the power of its position number in the string
                sum += Math.pow(Double.parseDouble(String.valueOf(numStr.charAt(y))), (double) (y+ 1));
            }
            //Cast the sum back to a Long
            long longSum = (long) sum;

            //Check if the sum is equal the original number
            if(x == sum){
                results.add(longSum);
            }

        }

        return results;
    }
}
