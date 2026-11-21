/**
 * EquationReverser.java
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

public class EquationReverse {

    public static String reverseEquation(String equation) { // static so it can be called directly as EquationReverser.reverseEquation(...) without creating an EquationReverser object
        // create the object of the TokenStack class
        TokenStack stack = new TokenStack();

        int i = 0;

        // TODO 1: Traverse the equation from left to right.
        // Push numbers and operators onto the stack.
        while (i < equation.length()) {
            char current = equation.charAt(i);

            // TODO 2: If the current character is a digit,
            //         Remember the beginning of the number and Move forward until the number ends.
            // Push the whole number as one item.
            if (Character.isDigit(current)) {
                int start = i;
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                stack.push(equation.substring(start, i));
            }
            // TODO 3: Otherwise, push the operator.
            else {
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // TODO 4: Pop all items from the stack and append
        //         them to a StringBuilder. (Pop items to construct the reversed equation.)
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.toString();
    }
}