package LibraryManagement;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Books> books = new ArrayList<>();

    // to add a new object of book
    public void addBook(String bookTitle, String bookAuthor, String bookISBN) {
        books.add(new Books(bookTitle, bookAuthor, bookISBN));
    }

    // to check if the if the list of book is empty
    public boolean isBookListEmpty() {
        return books.isEmpty();
    }
    
    // TO SHOW ALL OF THE BOOKS OBJECTS
    public void showAllBooks() {
        for(int i = 0; i < books.size(); i++) {
           System.out.println((i + 1) + ". "+ books.get(i).toString());
        }   
        System.out.println("(End of the List)");
    }

    // TO REMOVE/DELETE BOOK OBJECT
    public void deleteBook(int index) {
        books.remove(index);
    }

    // RETURN THE SIZE OF THE BOOKS
    protected int getBookCount() {
        return books.size();
    }
    
    // FOR THE ENCAPSULATION OF THE OBJECT OF BOOKS GETTERS OF THE PRIVATE ARRAYLIST OF OBJECT BOOKS
    public Books getBook(int index) {
        return books.get(index);
    }
}
