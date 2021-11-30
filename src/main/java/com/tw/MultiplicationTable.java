package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if (isValid(start, end)) {
            return generateTable(start, end);
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(generateLine(start, i));
            if (i != end) {
                result.append("\r\n");
            }
        }
        return result.toString();
    }

    public String generateLine(int start, int row) {
        StringBuilder result = new StringBuilder();
        for(int i = start; i <= row; i++) {
            result.append(generateSingleExpression(i, row));
            if (i != row) {
                result.append("  ");
            }
        }
        return result.toString();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + (multiplicand*multiplier);
    }
}
