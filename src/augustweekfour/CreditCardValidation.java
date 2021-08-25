package augustweekfour;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/25/2021
 * Time: 9:18 AM
 * Description: {Insert Description}
 */
public class CreditCardValidation {

    public CreditCardValidation() {}

    public boolean validateCard(Long cardNum) {
        String cardStr = cardNum.toString();
        int lastDigitChar = cardStr.charAt(cardStr.length() - 1) - '0';
        cardStr = cardStr.substring(0, cardStr.length() - 1);
        int cardSum = 0;

        for (int i = cardStr.length() - 1; i >= 0; i--) {
            if (i % 3 == 0 || i == 1) {
                String doubled = String.valueOf(cardStr.charAt(i) - '0' * 2);

                if (doubled.length() == 2) {
                    cardSum += (doubled.charAt(0) - '0') + (doubled.charAt(1) - '0');
                } else {
                    cardSum += Integer.parseInt(doubled);
                }
            } else {
                cardSum += (cardStr.charAt(i) - '0');
            }
        }

        String lastDigitStr = String.valueOf(cardSum);
        int lastDigitSum = 10 - (lastDigitStr.charAt(lastDigitStr.length() - 1) - '0');

        if (lastDigitChar == lastDigitSum) {
            return true;
        } else {
            return false;
        }
    }

}
