package septemberweekfour;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 9/21/2021
 * Time: 1:32 PM
 * Description: {Insert Description}
 */
public class MemCalc {

    public MemCalc() {}

    public String calculateMemory(String memSize) {
        String splitChar = getDelim(memSize);
        String sizeUnit = "";
        BigDecimal sizeAmt;

        String[] memSizeSplit = memSize.split(splitChar);
        sizeAmt = getActualSize(memSizeSplit[0]);
        sizeUnit = (splitChar + memSizeSplit[1]).toUpperCase();

        return calcBiggestDataSize(sizeAmt, sizeUnit);
    }

    private String getDelim(String strToSplit) {
        String retVal = "";

        for (int i = 0; i < strToSplit.length(); i++) {
            if (Character.isAlphabetic(strToSplit.charAt(i))) {
                retVal = retVal + strToSplit.charAt(i);
                break;
            }
        }

        return retVal;
    }

    private BigDecimal getActualSize(String numToCalc) {
        BigDecimal newNum = new BigDecimal(Double.toString(Double.parseDouble(numToCalc) - (Double.parseDouble(numToCalc) * 0.07)));

        return newNum.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    private String calcBiggestDataSize(BigDecimal currSize, String currDataUnit) {
        String[] dataSizesArr = {"BITS", "BYTES", "KB", "MB", "GB", "TB", "PB", "EB"};
        List<String> dataSizes = Arrays.asList(dataSizesArr);

        String retStr = "";

        if ((currSize.doubleValue() > 1 && currSize.doubleValue() < 1000) || (currDataUnit.equals("BITS") && currSize.doubleValue() < 1000) || (currDataUnit.equals("EB") && currSize.doubleValue() > 1)) {
            retStr = Double.toString(currSize.doubleValue()) + currDataUnit;
        }

        if (currSize.doubleValue() < 1 && !currDataUnit.equals("BITS")) {
            currDataUnit = dataSizes.get(dataSizes.indexOf(currDataUnit) - 1);
            retStr = Double.toString((currSize.doubleValue() * 1000)) + currDataUnit;
        }

        if (currSize.doubleValue() >= 1000 && !currDataUnit.equals("EB")) {
            currDataUnit = dataSizes.get(dataSizes.indexOf(currDataUnit) + 1);
            currSize = new BigDecimal(Double.toString(currSize.doubleValue() / 1000));
            currSize = currSize.setScale(2, BigDecimal.ROUND_HALF_UP);
            retStr = Double.toString(currSize.doubleValue()) + currDataUnit;
        }

        return retStr;
    }
}
