# Java-Library-Management

# Library Management System

This is a simple console-based Library Management System implemented in Java. It allows users to manage a collection of books, including adding new books, viewing existing ones, updating their details, and deleting them.

## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Flowchart](#flowchart)

## Features

* **Add New Book:** Add a new book to the library by providing its title, author, and ISBN.
* **View All Books:** Display a list of all books currently in the library, along with their details.
* **Update Book Details:** Modify the title, author, or ISBN of an existing book.
* **Delete a Book:** Remove a book from the library using its index.
* **Check if Library is Empty:** Quickly determine if there are any books in the library.
* **Get Number of Books:** Get a count of how many books are currently stored.
* **Robust Input Handling:** Includes error handling for invalid user inputs (e.g., non-numeric input when a number is expected).

## Usage

Once the program is running, you will see a main menu:

--- Book Management System ---
1. Add a New Book
2. View All Books
3. Update Book Details
4. Delete a Book
5. Check if Library is Empty
6. Get Number of Books
7. Exit

Enter your choice:

Follow the on-screen prompts to interact with the system:

* Enter `1` to add a book (you'll be prompted for title, author, and ISBN).
* Enter `2` to view all books.
* Enter `3` to update a book (you'll need to provide the book's index).
* Enter `4` to delete a book (you'll need to provide the book's index).
* Enter `5` to check if the library is empty.
* Enter `6` to get the total number of books.
* Enter `7` to exit the application.

## Project Structure

The project is organized into the following Java classes within the `LibraryManagement` package:

* `Main.java`: The entry point of the application. It initializes the `Library` and `LibraryMethod` objects and manages the main menu loop.
* `Books.java`: Represents a single book entity with properties like title, author, and ISBN. Includes getters, setters, and an overridden `toString()` method for a clear string representation.
* `Library.java`: Manages the collection of `Books` objects using an `ArrayList`. Provides methods for adding, retrieving, deleting, checking emptiness, and getting the count of books.
* `LibraryMethods.java`: An interface that defines the contract for operations related to the user interface and interactions (e.g., `showMenu`, `addBook`, `viewBooks`).
* `LibraryMethod.java`: Implements the `LibraryMethods` interface. It handles user input, displays the menu, and orchestrates calls to the `Library` class to perform actions based on user choices. It also contains robust input validation.

## Flowchart

A detailed flowchart outlining the application's logic and user flow is available in `LibraryFolowChart.graphml`. This chart visualizes the decision points and processes within the system.

*(Note: `.graphml` files can be opened and viewed using graph visualization software like yEd Graph Ed
