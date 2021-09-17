package septemberweekthree;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 9/17/2021
 * Time: 11:30 AM
 * Description: {Insert Description}
 */
public class Rot {

    public Rot() {}

    public String encrypt(String stringToEncrypt) {

        Character[] keyArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        List<Character> key = Arrays.asList(keyArray);

        String encoded = "";

        for (int i = 0; i < stringToEncrypt.length(); i++) {
            if (key.contains(Character.toUpperCase(stringToEncrypt.charAt(i)))) {
                if (key.indexOf(Character.toUpperCase(stringToEncrypt.charAt(i))) + 13 > 25) {
                    if (Character.isLowerCase(stringToEncrypt.charAt(i))) {
                        encoded += Character.toLowerCase(key.get(key.indexOf(Character.toUpperCase(stringToEncrypt.charAt(i))) - 13));
                    } else {
                        encoded += key.get(key.indexOf(Character.toUpperCase(stringToEncrypt.charAt(i))) - 13);
                    }
                } else {
                    if (Character.isLowerCase(stringToEncrypt.charAt(i))) {
                        encoded += Character.toLowerCase(key.get(key.indexOf(Character.toUpperCase(stringToEncrypt.charAt(i))) + 13));
                    } else {
                        encoded += key.get(key.indexOf(Character.toUpperCase(stringToEncrypt.charAt(i))) + 13);
                    }
                }
            }
        }

        return encoded;
    }

}
