package augustweekfour;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/25/2021
 * Time: 9:18 AM
 * Description: {Insert Description}
 */
public class Driver {
    public static void main(String[] args) {
        CreditCardValidation sut = new CreditCardValidation();

        System.out.println(sut.validateCard(123456789012345L));
        System.out.println(sut.validateCard(1234567890123452L));
    }
}
