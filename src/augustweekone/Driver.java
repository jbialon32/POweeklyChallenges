package augustweekone;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/6/2021
 * Time: 10:46 AM
 * Description: {Insert Description}
 */

public class Driver {
    public static void main(String[] args) {
        LargestSubstring lss = new LargestSubstring();
        System.out.println(lss.findLargestSubstring("Minneapolis", "Minnesota"));
        System.out.println(lss.findLargestSubstring("onetwothreefour", "twoonethreeten"));

        MissingNumber mnf = new MissingNumber();
        int[] arrOne = {7,5,6,1,4,2};
        int[] arrTwo={5,3,1,2};
        System.out.println(mnf.findMissingNum(arrOne));
        System.out.println(mnf.findMissingNum(arrTwo));
    }
}