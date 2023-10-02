public class RomanNumeralConverter {
    public static String convertToRoman(int i) {
        // check for illegal argument
        if (i < 1 || i > 3999) { // roman numerals only go up to 3999
            throw new IllegalArgumentException("Number must be between 1 and 3999.");
        }
        // convert to roman numeral
        String s = "";
        while (i != 0) {
            if (i == 1000) {
                s += "M";
                i -= 1000;
            } else if (i >= 900) {
                s += "CM";
                i -= 900;
            } else if (i >= 500) {
                s += "D";
                i -= 500;
            } else if (i >= 400) {
                s += "CD";
                i -= 400;
            } else if (i >= 100) {
                s += "C";
                i -= 100;
            } else if (i >= 90) {
                s += "XC";
                i -= 90;
            } else if (i >= 80) {
                s += "LXXX";
                i -= 80;
            } else if (i >= 70) {
                s += "LXX";
                i -= 70;
            } else if (i >= 60) {
                s += "LX";
                i -= 60;
            } else if (i >= 50) {
                s += "L";
                i -= 50;
            } else if (i >= 40) {
                s += "XL";
                i -= 40;
            } else if (i >= 10) {
                s += "X";
                i -= 10;
            } else if (i == 9) {
                s += "IX";
                i -= 9;
            } else if (i >= 5) {
                s += "V";
                i -= 5;
            } else if (i == 4) {
                s += "IV";
                i -= 4;
            } else if (i >= 1) {
                s += "I";
                i -= 1;
            }
        }
        return s;
    }
}
