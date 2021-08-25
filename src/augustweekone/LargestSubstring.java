package augustweekone;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/6/2021
 * Time: 10:18 AM
 * Description: {Insert Description}
 */
public class LargestSubstring {

    public LargestSubstring(){}

    public String findLargestSubstring(String sOne, String sTwo) {
        int currIndexOne = -1;
        int currIndexTwo = -1;
        int longestIndexOne = -1;
        int longestIndexTwo = -1;
        int currLength = 0;
        int longestLength = 0;
        String shortestString = "";
        String longestString = "";

        if (sOne.length() < sTwo.length()) {
            shortestString = sOne;
            longestString = sTwo;
        } else {
            shortestString = sTwo;
            longestString = sOne;
        }

        for (int i = 0; i < shortestString.length(); i++) {
            if (shortestString.charAt(i) == longestString.charAt(i)) {
                currLength++;
                if (currIndexOne == -1) {
                    currIndexOne = i;
                } else {
                    currIndexTwo = i;
                }
                if (currLength > longestLength) {
                    longestLength = currLength;
                    longestIndexOne = currIndexOne;
                    longestIndexTwo = currIndexTwo;
                }
            } else {
                currLength = 0;
                currIndexOne = -1;
                currIndexTwo = -1;
            }
        }

        return sOne.substring(longestIndexOne, longestIndexTwo + 1);
    }

}
