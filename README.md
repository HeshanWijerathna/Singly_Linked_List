# Singly_Linked_List
# Singly Linked List Implementation in Java

## Overview

This project implements a **Singly Linked List** from scratch using Java. The list supports operations such as insertion, deletion, search, traversal, and reversal. The program offers a menu-driven console interface for user interaction.

## Features

- **Insert at Start**: Add a new node to the beginning of the list.
- **Insert at End**: Add a new node to the end of the list.
- **Insert at Specific Position**: Add a new node to a specific position.
- **Display List**: Traverse and print the entire list.
- **Search for Element**: Search for a node by value and return its position.
- **Remove Element by Value**: Remove a node from the list based on its value.
- **Reverse List**: Reverse the linked list in place.
- **Size of the List**: Return the size of the list as an integer.
- **Exit**: Quit the program.

## Prerequisites

Ensure the following are installed:

- **Java Development Kit (JDK)**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version 8 or above).
- **Apache Maven**: [Download Maven](https://maven.apache.org/download.cgi).
- **Visual Studio Code**: [Download VS Code](https://code.visualstudio.com/).

## Files

The project contains the following Java files:

1. `Main.java`: The main entry point of the program.
2. `InputHandler.java`: Manages user input and provides a menu for interacting with the linked list.
3. `Node.java`: Defines the structure of a node in the singly linked list.
4. `SinglyLinkedList.java`: Implements the core functionality of the linked list (insertion, deletion, search, and reversal).

## How to Run the Project in VS Code

### Step 1: Download the Project Files from GitHub

1. Download the project as a ZIP from the repository.
2. Extract the files to a folder on your computer.

### Step 2: Set Up VS Code

Before starting, install the following extensions in VS Code:

- Java Extension Pack (for Java development)
- Maven for Java (for managing Maven projects)

### Step 3: Create a New Maven Project in VS Code

1. Open VS Code and open the command palette (`Ctrl + Shift + P` or `Cmd + Shift + P` on Mac).
2. Type `> Maven: New Module` and select it.
3. Choose `<None>`.
4. Enter a groupId (e.g., `com.example`) and an artifactId (e.g., `singly-linked-list`).
5. Select a location to save the project. VS Code will create the Maven project structure.

### Step 4: Add Project Files

1. In your Maven project structure, navigate to `src/main/java/com/example`.
2. Replace the `App.java` file with the following files:
   - `Main.java`
   - `InputHandler.java`
   - `Node.java`
   - `SinglyLinkedList.java`
3. Ensure all Java classes are placed in the `com.example` package.

### Step 5: Running the Program

1. Open `Main.java` in VS Code.
2. You will see a "Run" button near the main method. Click it to compile and execute the program.

### Step 6: Using the Program

Once the program runs, a menu will appear in the terminal:

```bash
Select an option:
1. Insert at Start
2. Insert at End
3. Insert at Specific Position
4. Display List
5. Search for Element
6. Remove Element by Value
7. Reverse List
8. Size of the List
9. Exit

Select an option:
1. Insert at Start
2. Insert at End
3. Insert at Specific Position
4. Display List
5. Search for Element
6. Remove Element by Value
7. Reverse List
8. Size of the list.
9. Exit

1 Enter value to insert at start:
Heshan

2 Enter value to insert at end:
Shehara

3 Enter value to insert at Specific Position:
Sathsarani
2

4 Linked List Elements:
Heshan
Sathsarani
Shehara

5 Enter value to search:
Sathsarani
Element found at position: 2

7 Reversing the list... 
Linked List Elements:
Shehara
Sathsarani
Heshan
```
You can select any option by entering the corresponding number and following the prompts.

### Step 7: Exiting the Program
To exit the program, choose option 8 from the menu.

## Troubleshooting
Java Not Detected: Ensure Java is installed and added to your system's PATH environment variable.
Run Button Not Visible: Ensure the Java Extension Pack is installed in VS Code. If the Run button doesn't appear, press Ctrl + F5 to run the program.
No Output in Terminal: Ensure the terminal is open in VS Code by selecting Terminal > New Terminal.
