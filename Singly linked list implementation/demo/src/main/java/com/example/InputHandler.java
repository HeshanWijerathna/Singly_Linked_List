package com.example;

import java.util.Scanner;

public class InputHandler {
    private SinglyLinkedList linkedList = new SinglyLinkedList();
    private Scanner scanner = new Scanner(System.in);

    public void manageInput() {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Insert at Start");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Specific Position");
            System.out.println("4. Display List");
            System.out.println("5. Search for Element");
            System.out.println("6. Remove Element by Value");
            System.out.println("7. Reverse List");
            System.out.println("8. Size of the list");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("Enter value to insert at start:");
                String startData = scanner.nextLine();
                linkedList.insertAtStart(startData);

            } else if (choice == 2) {
                System.out.println("Enter value to insert at end:");
                String endData = scanner.nextLine();
                linkedList.insertAtEnd(endData);

            } else if (choice == 3) {
                System.out.println("Enter value to insert at specific position");
                String posData = scanner.nextLine();
                int position = scanner.nextInt();
                linkedList.insertAtPosition(posData, position);   

            } else if (choice == 4) {
                linkedList.displayList();

            } else if (choice == 5) {
                System.out.println("Enter value to search:");
                String searchData = scanner.nextLine();
                int pos = linkedList.searchElement(searchData);
                if (pos == -1) {
                    System.out.println("Element not found.");
                } else {
                    System.out.println("Element found at position: " + pos);
                }

            } else if (choice == 6) {
                System.out.println("Enter value to remove:");
                String removeData = scanner.nextLine();
                linkedList.removeNodeByValue(removeData);

            } else if (choice == 7) {
                System.out.println("Reversing the list...");
                linkedList.reverseList();
                linkedList.displayList();

            } else if (choice == 8){
                int size = linkedList.getListSize(); 
                System.out.println("Size of the list: "+ size);   

            } else if (choice == 9) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
