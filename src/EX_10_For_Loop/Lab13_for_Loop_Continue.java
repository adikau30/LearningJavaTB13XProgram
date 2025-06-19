package EX_10_For_Loop;

import java.sql.SQLOutput;

public class Lab13_for_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i==5)
            {
                continue; //Skip the Line
            }else
            {
                System.out.println(i);
            }

        }
    }
}
