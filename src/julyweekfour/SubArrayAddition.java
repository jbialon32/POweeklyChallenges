package julyweekfour;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 7/30/2021
 * Time: 8:51 AM
 * Description: {Insert Description}
 */
public class SubArrayAddition {

    public SubArrayAddition() {

    }

    public String findSum(int target, int[] arr) {
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == target) {
                return retFmt(retPkg(i, i, arr));
            }

            for (int j = i + 1; j < arr.length; j++) {
                currSum += arr[j];

                if (currSum > target) {
                    break;
                }

                if (currSum == target) {
                    return retFmt(retPkg(i, j, arr));
                }
            }

            currSum = 0;
        }

        return "No solution could be found...";

    }

    private int[] retPkg(int a, int b, int[] arr) {

        int[] retVal = new int[b+2];

        retVal[0] = a;
        retVal[1] = b;

        for (int i = 0; i < b; i++) {
            retVal[i+2] = arr[a+i];
        }

        return retVal;

    }

    private String retFmt(int[] arrToFormat) {
        String retVal = String.format("Sum found between index %d to %d.\nThe elements are ", arrToFormat[0], arrToFormat[1]);

        for (int i = 2; i < arrToFormat.length; i++) {
            if (i == arrToFormat.length - 1) {
                retVal = retVal.concat(String.format("%d.", arrToFormat[i]));
                break;
            }

            retVal = retVal.concat(String.format("%d, ", arrToFormat[i]));
        }

        return retVal;
    }
}
