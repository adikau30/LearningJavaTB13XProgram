package EX_10_For_Loop;

public class Lab14_for_Loop_Continue_Even_Number {
    public static void main(String[] args) {
        for (int i = 0; i <50; i++) {
            if (i%2 == 0) {
                System.out.println("Even->" + i);
                continue;
            }else
                System.out.println("Odd->" +i);

        }
    }
}
