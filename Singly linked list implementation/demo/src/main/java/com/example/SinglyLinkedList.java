package com.example;

public class SinglyLinkedList {
    private Node head;
    private int count;

    public SinglyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    // Insert node at the start
    public void insertAtStart(String data) {
        Node newNode = new Node(data);
        newNode.setNextElement(head);
        head = newNode;
        count++;
    }

    // Insert node at the end
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNextElement() != null) {
                temp = temp.getNextElement();
            }
            temp.setNextElement(newNode);
        }
        count++;
    }

    // Add node at a specific position
    public void insertAtPosition(String data, int position) {
        if (position < 1 || position > count + 1) {
            System.out.println("Error: Invalid position.");
            return;
        }
        if (position == 1) {
            insertAtStart(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.getNextElement();
            }
            newNode.setNextElement(current.getNextElement());
            current.setNextElement(newNode);
            count++;
        }
    }

    // Display the list
    public void displayList() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Linked List Elements:");
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNextElement();
        }
    }

    // Search for a node and return its position
    public int searchElement(String data) {
        Node current = head;
        int index = 1;
        while (current != null) {
            if (current.getValue().equals(data)) {
                return index;
            }
            current = current.getNextElement();
            index++;
        }
        return -1; // Element not found
    }

    // Remove a node by its value 
    public void removeNodeByValue(String value) {
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }

        // Create a temporary list to hold elements except the one to remove
        SinglyLinkedList tempList = new SinglyLinkedList();
        Node current = head;

        while (current != null) {
            // Add to the new list if it's not the node to remove
            if (!current.getValue().equals(value)) {
                tempList.insertAtEnd(current.getValue());
            }
            current = current.getNextElement();
        }

        // Rebuild the current list with the temporary list
        this.head = tempList.head;
        this.count = tempList.count;

        System.out.println("Node with value '" + value + "' has been removed.");
    }

    // Get the size of the list
    public int getListSize() {
        return count;
    }

    // Reverse the list
    public void reverseList() {
        Node previous = null;
        Node current = head;
        Node nextNode;
        while (current != null) {
            nextNode = current.getNextElement();
            current.setNextElement(previous);
            previous = current;
            current = nextNode;
        }
        head = previous;
    }
}
