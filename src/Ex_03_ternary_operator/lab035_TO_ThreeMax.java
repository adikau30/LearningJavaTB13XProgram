package Ex_03_ternary_operator;

public class lab035_TO_ThreeMax {
    public static void main(String[] args) {
        // find the maximum between three numbers
        int n1= 2;
        int n2= 9;
        int n3= -11;

        // step 1: Find inputs/outputs
        // input= n1, n2, n3- integers
        // output= String- max number

        // step 2- rough logic
        // (n1>n2) and (n1>n3) - n1
        // (n2>n3) and (n2>n1) - n2
        // n3

        //Step 3
        //int max= (n1>n2)? A:B
        // A- (n1>n3) ? n1:n3
        // B- (n2>n3) ? n2:n3

        int max= (n1>n2)? (n1>n3) ? n1:n3 : (n2>n3) ? n2:n3;
        System.out.println(max);

    }
}
