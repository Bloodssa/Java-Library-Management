package LibraryManagement;

public class Books {
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;

    // NON-PARAMITERIZED CONSTRUCTOR
    public Books(){}

    public Books(String bookTitle, String bookAuthor, String bookISBN) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
    }

    // GETTERS
    public String getBookTitle() {
        return bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public String getBookISBN() {
        return bookISBN;
    }

    @Override
    public String toString() {
        return bookTitle + ", Author: " + bookAuthor + ", ISBN: " + bookISBN;
    }

    // TO SHOW THE TITLE, AUTHOR, ISBN EVERY ITERATION IN THE OTHER METHOD
    // public void showBookValue(int number) {
    //     System.out.println(number + ". " + bookTitle + ", Author: " + bookAuthor + ", ISBN: " + bookISBN);
    // }

    // SETTERS FOR THE NEW TITLE, AUTHOR, AND ISBN
    public void setTitle(String newTitle) {
        this.bookTitle = newTitle;
    }  
    public void setAuthor(String newAuthor) {
        this.bookAuthor = newAuthor;
    }   
    public void setISBN(String newISBN) {
        this.bookISBN = newISBN;
    }     
}
