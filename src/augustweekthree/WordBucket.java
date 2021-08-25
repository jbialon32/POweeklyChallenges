package augustweekthree;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 8/18/2021
 * Time: 10:24 AM
 * Description: {Insert Description}
 */
public class WordBucket {

    public WordBucket() {}

    public String[] bucketize(String phrase, int bucketSize) {
        String[] splitArr = phrase.trim().split(" ");
        ArrayList<String> convertRet = new ArrayList<>();

        for (int i = 0; i < splitArr.length; i++) {
            if (splitArr[i].length() > bucketSize) {
                continue;
            }

            if (splitArr[i].length() == bucketSize) {
                convertRet.add(splitArr[i]);
                continue;
            }

            String stringToAdd = splitArr[i];

            for (int j = i + 1; j < splitArr.length; j++) {
                String oldStringToAdd = stringToAdd;
                stringToAdd = String.join(" ", stringToAdd, splitArr[j]);

                if (stringToAdd.length() > bucketSize) {
                    convertRet.add(oldStringToAdd);
                    i = j - 1;
                    break;
                }

                if (stringToAdd.length() == bucketSize) {
                    convertRet.add(stringToAdd);
                    i = j;
                    break;
                }

                if (stringToAdd.length() < bucketSize && j == splitArr.length - 1) {
                    convertRet.add(stringToAdd);
                    i = j;
                    break;
                }
            }
        }

        String[] retVal = new String[convertRet.size()];
        retVal = convertRet.toArray(retVal);

        return retVal;
    }

}
