package augustweekthree;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/18/2021
 * Time: 10:23 AM
 * Description: {Insert Description}
 */
public class Driver {

    public static void main(String[] args) {

        WordBucket sut = new WordBucket();

        String[] arr = sut.bucketize("fairy dust coated the air", 20);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
