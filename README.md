# Java-Library-Management

# Library Management System

This is a simple console-based Library Management System implemented in Java. It allows users to manage a collection of books, including adding new books, viewing existing ones, updating their details, and deleting them.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Flowchart](#flowchart)
- [Contributing](#contributing)
- [License](#license)

## Features

* **Add New Book:** Add a new book to the library by providing its title, author, and ISBN.
* **View All Books:** Display a list of all books currently in the library, along with their details.
* **Update Book Details:** Modify the title, author, or ISBN of an existing book.
* **Delete a Book:** Remove a book from the library using its index.
* **Check if Library is Empty:** Quickly determine if there are any books in the library.
* **Get Number of Books:** Get a count of how many books are currently stored.
* **Robust Input Handling:** Includes error handling for invalid user inputs (e.g., non-numeric input when a number is expected).

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You will need the following installed on your machine:

* **Java Development Kit (JDK) 8 or higher**
    * You can download it from [Oracle's website](https://www.oracle.com/java/technologies/downloads/) or use a package manager.
* A Java IDE (Integrated Development Environment) like **IntelliJ IDEA**, **Eclipse**, or **VS Code with Java extensions** is recommended.



## Usage

Once the program is running, you will see a main menu:

Coding partner
Sure, I can definitely help you create a README.md file for your Library Management System!

A README.md file is crucial for any project. It's the first thing people see and it explains what your project is, how to set it up, how to use it, and more.

Based on our discussions and the code you've developed, here's a comprehensive README.md file for your project. I'll use Markdown formatting for easy viewing.

Markdown

# Library Management System

This is a simple console-based Library Management System implemented in Java. It allows users to manage a collection of books, including adding new books, viewing existing ones, updating their details, and deleting them.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [How to Run](#how-to-run)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Flowchart](#flowchart)
- [Contributing](#contributing)
- [License](#license)

## Features

* **Add New Book:** Add a new book to the library by providing its title, author, and ISBN.
* **View All Books:** Display a list of all books currently in the library, along with their details.
* **Update Book Details:** Modify the title, author, or ISBN of an existing book.
* **Delete a Book:** Remove a book from the library using its index.
* **Check if Library is Empty:** Quickly determine if there are any books in the library.
* **Get Number of Books:** Get a count of how many books are currently stored.
* **Robust Input Handling:** Includes error handling for invalid user inputs (e.g., non-numeric input when a number is expected).

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You will need the following installed on your machine:

* **Java Development Kit (JDK) 8 or higher**
    * You can download it from [Oracle's website](https://www.oracle.com/java/technologies/downloads/) or use a package manager.
* A Java IDE (Integrated Development Environment) like **IntelliJ IDEA**, **Eclipse**, or **VS Code with Java extensions** is recommended.

### How to Run

1.  **Clone the Repository (or download the files):**
    If your project is in a Git repository, you would clone it:
    ```bash
    git clone <your-repository-url>
    cd LibraryManagementSystem
    ```
    Otherwise, ensure you have all the `.java` files (`Books.java`, `Library.java`, `LibraryMethods.java`, `LibraryMethod.java`, `Main.java`) in a directory named `LibraryManagement` (matching the package declaration).

2.  **Open in your IDE:**
    * Open your chosen IDE.
    * Import the `LibraryManagementSystem` folder as a new Java project. Ensure your IDE recognizes the `src/LibraryManagement` directory as a source folder.

3.  **Compile and Run:**
    * Navigate to the `Main.java` file.
    * Run the `main` method. Most IDEs have a "Run" button or context menu option for this.

    Alternatively, you can compile and run from the command line:
    ```bash
    # Navigate to the directory containing your package folder (e.g., if LibraryManagement is inside 'src')
    cd src

    # Compile the Java files
    javac LibraryManagement/*.java

    # Run the Main class
    java LibraryManagement.Main
    ```

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
