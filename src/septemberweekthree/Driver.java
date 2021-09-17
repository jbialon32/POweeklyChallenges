package septemberweekthree;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 9/17/2021
 * Time: 11:54 AM
 * Description: {Insert Description}
 */
public class Driver {
    public static void main(String[] args) {
        DecToOct sut1 = new DecToOct();
        Rot sut2 = new Rot();

        System.out.println(sut1.convert(8));
        System.out.println(sut2.encrypt("aNz"));
    }
}
