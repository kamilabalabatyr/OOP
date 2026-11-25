package pr5.io.app;

import pr5.io.model.Book;
import java.io.*;
import java.util.*;

public class BookManager {
    private static final String DATA_FILE = "library.dat";
    private List<Book> library;
    private Scanner scanner;
    
    public BookManager() {
        scanner = new Scanner(System.in);
        loadLibrary();
    }
    
    @SuppressWarnings("unchecked")
    private void loadLibrary() {
        File file = new File(DATA_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
                library = (ArrayList<Book>) ois.readObject();
                System.out.println("Library loaded successfully. " + library.size() + " books found.");
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error loading library: " + e.getMessage());
                library = new ArrayList<>();
            }
        } else {
            library = new ArrayList<>();
            System.out.println("New library created.");
        }
    }
    
    private void saveLibrary() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(library);
            System.out.println("Library saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving library: " + e.getMessage());
        }
    }
    
    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        
        library.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }
    
    private void listBooks() {
        if (library.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        
        System.out.println("\nLibrary Contents:");

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.incrementVisitCount(); 
            System.out.println((i + 1) + ". " + book);
        }
    }
    
    public void run() {
        boolean running = true;
        
        while (running) {
            System.out.println("\n Book Library Manager");
            System.out.println("(A) Add a book");
            System.out.println("(L) List books");
            System.out.println("(Q) Quit");
            System.out.print("Choose an option: ");
            
            String choice = scanner.nextLine().toUpperCase();
            
            switch (choice) {
                case "A":
                    addBook();
                    break;
                case "L":
                    listBooks();
                    break;
                case "Q":
                    running = false;
                    saveLibrary();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.run();
    }
}