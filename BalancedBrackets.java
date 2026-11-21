/**
 * Your Name:        ____Duru Çıtak_____________
 * Your Student ID:  _____250444015____________
 * Your Date:        _____21.11.2026____________
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        // 1. Traverse the string character by character.
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 2. If the character is an opening bracket, push it onto the stack.
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            }
            // 3. If it is a closing bracket:
            else if (current == ')' || current == ']' || current == '}') {
                // Check whether the stack is empty.
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top opening bracket.
                char topChar = stack.pop();

                // Check whether the brackets match.
                if (!isMatchingPair(topChar, current)) {
                    return false;
                }
            }
        }

        // 4. At the end, check whether the stack is empty.
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        // Check: ( matches )
        if (opening == '(' && closing == ')') {
            return true;
        }
        // Check: [ matches ]
        if (opening == '[' && closing == ']') {
            return true;
        }
        // Check: { matches }
        if (opening == '{' && closing == '}') {
            return true;
        }

        // If check doesn't match, return false
        return false;
    }
}