package Ex_03_ternary_operator;

import org.w3c.dom.ls.LSOutput;

public class lab031_ternary_operator {
    public static void main(String[] args) {
        int number = 5;
        // is number: positive or negative
        String result = number > 0 ? "positive" : "negative";
        System.out.println(result);
    }
}
