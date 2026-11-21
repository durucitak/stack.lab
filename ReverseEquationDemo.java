/**
 * ReverseEquationDemo.java
 */

public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };

        // Print the input and output like in the expected output
        for (String eq : equations) {
            String reversed = EquationReverse.reverseEquation(eq);
            System.out.println("Input:  " + eq);
            System.out.println("Output: " + reversed);
            System.out.println();
        }
    }
}