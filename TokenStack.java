/**
 * TokenStack.java
 *
 * Your Name:        _____Duru Çıtak_____________
 * Your Student ID:  _____250444015_____________
 * Your Date:        ______21.11.2026____________
 */

public class TokenStack {

    private class Node {
        // create the instant named data as a String type
        String data;

        // create the next pointer that will be used for the Stack implementation as a Node type
        Node next;

        // complete the constructor accordingly
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // create the top pointer that will be used for the Stack implementation as private
    private Node top;

    public TokenStack() {
        // create the constructor of the TokenStack class that will assign the top pointer to null
        this.top = null;
    }

    public void push(String value) {
        // TODO: Create a new node.
        Node newNode = new Node(value);
        //       Connect it to the current top.
        newNode.next = top;
        //       Update top.
        top = newNode;
    }

    public String pop() {
        // TODO: Check whether the stack is empty.
        if (isEmpty()) {
            return null;
        }
        //       Store the top value.
        String storedValue = top.data;
        //       Move top to the next node.
        top = top.next;
        //       Return the stored value.
        return storedValue;
    }

    public boolean isEmpty() {
        // TODO: Return whether the stack is empty.
        return top == null;
    }
}