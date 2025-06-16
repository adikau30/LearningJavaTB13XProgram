package EX_07_Increment_Decrement_OP;

public class Lab_In_De_OP_Task13th_5 {
    public static void main(String[] args) {
        int x=5;
        int y= x++ + ++x + x++ + ++x;
        System.out.println("x=" +x+ ",y=" +y);
        //x++= 5
        // now x= 6
        // ++x= 1+6= 7
        // x++= 7
        // now x= 8
        // ++x= 1+8= 9
        //y= 5+7+7+9= 28
        //x= +x+= 9= 10
        //y= 28
    }
}
