package EX_07_Increment_Decrement_OP;

public class Lab_In_De_OP_Task13th_2 {
    public static void main(String[] args) {
        int i = 1;
        i = i++ +  ++i;
        System.out.println(i);
        //i++= 1
        //now i = 2
        // ++i= 3
        //1+3= 4
    }
}
