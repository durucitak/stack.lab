/**
 * BracketStack.java
 *
 * Your Name:        _____Duru Çıtak_____________
 * Your Student ID:  ______250444015____________
 * Your Date:        _______21.11.2026___________
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top; // connect newNode to the current top
        top = newNode;      // update top
    }

    // TODO 2: Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            return '\0'; // Or throw new java.util.EmptyStackException();
        }
        char poppedData = top.data;
        top = top.next; // the new top is the node after current top
        return poppedData;
    }

    // TODO 3: Return the top element without removing it
    public char peek() {
        if (isEmpty()) {
            return '\0'; // Or throw new java.util.EmptyStackException();
        }
        return top.data;
    }

    // TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}