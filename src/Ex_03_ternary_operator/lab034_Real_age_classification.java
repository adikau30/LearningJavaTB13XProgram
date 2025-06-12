package Ex_03_ternary_operator;

public class lab034_Real_age_classification {
    public static void main(String[] args) {
        // age<18- minor
        // 18<age>65- Adult
        // age>65- senior
        int age= 34;
        String result = (age<18) ? "Minor": (age>65 ? "Senior":"Adult");
        System.out.println(result);
    }
}
