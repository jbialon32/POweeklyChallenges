package augustweekone;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/6/2021
 * Time: 10:54 AM
 * Description: {Insert Description}
 */
public class MissingNumber {

    public MissingNumber() {};

    public int findMissingNum(int[] intArr) {
        int retVal = -1;

        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] != (i + 1)) {
                retVal = i + 1;
                break;
            }
        }

        return retVal;
    }

}
