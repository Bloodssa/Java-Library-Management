package LibraryManagement;  
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Library library = new Library();
        LibraryMethod libraryMethod = new LibraryMethod(library);

        int choice; 
        do {
            libraryMethod.showMenu();
            choice = libraryMethod.inputChoice();

            switch(choice) {
                case 1:
                libraryMethod.addBook();
                break;         
                case 2:
                libraryMethod.viewBooks();
                break;
                case 3:
                libraryMethod.updateBook();
                break;
                case 4:
                libraryMethod.deleteBook();
                break;
                case 5:
                libraryMethod.checkLibraryIsEmpty();
                break;
                case 6:
                libraryMethod.numberOfBook();
                break;
                case 7:
                libraryMethod.exit();
                break;
                default:
                System.out.println("\nCHOICE MUST BE (1 - 7)............");
            }

        }while(choice != 7);
        
    }
}
