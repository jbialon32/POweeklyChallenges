package julyweekfour;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 7/30/2021
 * Time: 8:51 AM
 * Description: {Insert Description}
 */

public class Driver {
    public static void main(String[] args) {
        int[] arr={14, 12, 70, 15, 99, 65, 21, 90};
        SubArrayAddition saa = new SubArrayAddition();

        System.out.println(saa.findSum(97, arr));
    }
}