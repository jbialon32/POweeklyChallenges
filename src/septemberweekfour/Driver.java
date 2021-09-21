package septemberweekfour;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 9/21/2021
 * Time: 1:29 PM
 * Description: {Insert Description}
 */
public class Driver {

    public static void main(String[] args) {
        MemCalc sut = new MemCalc();

        System.out.println(sut.calculateMemory("1GB"));
        System.out.println(sut.calculateMemory("1.12GB"));
        System.out.println(sut.calculateMemory("1700gB"));
        System.out.println(sut.calculateMemory("100gb"));
        System.out.println(sut.calculateMemory("1Bits"));
        System.out.println(sut.calculateMemory("1120BITS"));
        System.out.println(sut.calculateMemory("1EB"));
        System.out.println(sut.calculateMemory("1120EB"));
    }

}
