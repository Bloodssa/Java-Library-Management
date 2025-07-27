package LibraryManagement;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LibraryMethod implements LibraryMethods{
    private Library library;
    private Scanner sc = new Scanner(System.in);

    // SET THE LIBRARY AND GET THE LIBRARY FROM THE SAME LIBRARY OBJECT IN THE MAIN METHOD/CLASS
    public LibraryMethod(Library library) {
        this.library = library;
    }

    // MENU
    public void showMenu() {
        System.out.println("\n--- Book Management System ---");
        System.out.println("1. Add a New Book");
        System.out.println("2. View All Books");
        System.out.println("3. Update Book Details");
        System.out.println("4. Delete a Book");
        System.out.println("5. Check if Library is Empty");
        System.out.println("6. Get Number of Books");
        System.out.println("7. Exit");
    }

    // input method to accept num only with try and catch
    public int inputInteger() {
        int num;
        while(true) {
            try {
                if(!sc.hasNextInt()) {
                    sc.nextLine();  //this nextLine will consume the input mismatch
                    throw new InputMismatchException("You must input a number");
                }
                num = sc.nextInt();
                break;
            }catch(InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            } 
        }
        return num;
    }

    // INPUT CHOICE WITH TRY AND CATCH METHOD FROM THE INPUT INTEGER METHOD
    public int inputChoice() {
        System.out.println("\nEnter your choice: ");
        int choice = inputInteger();
        
        return choice;
    }

    // CHOICE 1 TO ADD BOOK/S
    public void addBook() {
        System.out.println("--- Add New Book ---");
        sc.nextLine();   //to clear the nextline
        System.out.println("Enter Book Title: ");
        String bookTitle = sc.nextLine();
        System.out.println("Enter Book Author: ");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter Book ISBN: ");
        String bookISBN = sc.nextLine();
        
        library.addBook(bookTitle, bookAuthor, bookISBN);
    }

    // SHOW ALL BOOK/S EvERY ITERATION CALLS THE CHECKBOOKLIST METHOD IN LIBRARY CLASS AND GET EVERY TITLE,AUTHOR, AND ISBN EVERY ITERATION
    public void viewBooks() {
        System.out.println("--- Current Books in Library ---");
        if(library.isBookListEmpty()) {
            System.out.println("The Library is empty");
        }else {
            library.showAllBooks();
        }
    }
    
    // INDEX VALUE METHOD
    public int indexValue() {
        int indexOfUpdateBook = inputInteger();
        return indexOfUpdateBook - 1;
    }

    // CHOICE 3 
    public void updateBook() {
        System.out.println("--- Update Book ---");
        try {
            if(!library.isBookListEmpty()) {
            System.out.println("Enter the index of the book to update (starting from 1): ");
            int index = indexValue();
            if (index < 0|| index >= library.getBookCount()) {
                throw new IndexOutOfBoundsException("Invalid book index. Please enter a valid index.");
            }
            Books book = library.getBook(index);

            System.out.println("(User wants to update " + book.getBookTitle() + ")");

            System.out.println("\nEnter NEW Title (press Enter to keep current): ");
            sc.nextLine(); //to clean nextLine
            String newTitle = sc.nextLine();
            if(!newTitle.isEmpty()) {
                book.setTitle(newTitle);
            }
            System.out.println("Enter NEW Author (press Enter to keep current): ");
            String newAuthor = sc.nextLine();
            if(!newAuthor.isEmpty()) {
                book.setAuthor(newAuthor);
            }
            System.out.println("Enter NEW ISBN (press Enter to keep current): ");
            String newISBN = sc.nextLine();
            if(!newISBN.isEmpty()) {
                book.setISBN(newISBN);
            }
            }else {
                System.out.println("The library is currently empty. There are no books to update.");
            }
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    }
    // CHOICE 4
    public void deleteBook() {
        System.out.println("--- Delete Book ---");
        try {
            if(!library.isBookListEmpty()) {
            System.out.println("Enter the index of the book to delete (starting from 1): ");
            int index = indexValue();
            if (index < 0|| index >= library.getBookCount()) {
                throw new IndexOutOfBoundsException("Invalid book index. Please enter a valid index. There are only " + library.getBookCount());
            }
            Books book = library.getBook(index);
            // sc.nextInt(); //to clean nextLine
            
            System.out.println("(User wants to delete " + book.getBookTitle() + ")");
            library.deleteBook(index);

            System.out.println("\nBook at index " + (index + 1) + "(" + book.getBookTitle() + ") deleted successfully!");
            }else {
                System.out.println("The library is currently empty. There are no books to delete.");
            }
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    } 
    
    // CHOICE 5
    public void checkLibraryIsEmpty() {
        if(library.isBookListEmpty()) {
            System.out.println("The library is currently empty.");
        }else {
            System.out.println("The library is NOT empty. There is " + library.getBookCount() + " book.");
        }
    }

    // CHOICE 6
    public void numberOfBook() {
        System.out.println("There are " + library.getBookCount() + " book(s) in the library.");
    }

    // CHOICE 7
    public void exit() {
        System.out.println("Exiting Book Management System. Goodbye!");
        sc.close();
    }

}
