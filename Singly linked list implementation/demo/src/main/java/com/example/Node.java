package com.example;

public class Node {
    private String value; // Data stored in the node
    private Node nextElement; // Reference to the next node

    // Constructor
    public Node(String value) {
        this.value = value;
        this.nextElement = null; // Default to null
    }

    // Getter for the next node
    public Node getNextElement() {
        return nextElement;
    }

    // Setter for the next node
    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }

    // Getter for node data
    public String getValue() {
        return value;
    }
}
