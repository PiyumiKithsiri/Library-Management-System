import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Book class
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public Book(Scanner scanner) {

        System.out.print("Enter book title: ");
        this.title = scanner.nextLine();

        System.out.print("\nEnter author name: ");
        this.author = scanner.nextLine();

        System.out.print("Enter ISBN: ");
        this.isbn = scanner.nextLine();

        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nAvailable: " + available;
    }
}

class FictionBook extends Book {
    public FictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    public FictionBook(Scanner scanner) {
        super(scanner);
    }
}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    public NonFictionBook(Scanner scanner) {
        super(scanner);
    }
}

class HorrorBook extends Book {
    public HorrorBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    public HorrorBook(Scanner scanner) {
        super(scanner);
    }
}

class ScienceFictionBook extends Book {
    public ScienceFictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    public ScienceFictionBook(Scanner scanner) {
        super(scanner);
    }
}

class FantasyBook extends Book {
    public FantasyBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    public FantasyBook(Scanner scanner) {
        super(scanner);
    }
}

class Library {
    private List<Book> fictionBooks;
    private List<Book> nonFictionBooks;
    private List<Book> horrorBooks;
    private List<Book> scienceFictionBooks;
    private List<Book> fantasyBooks;

    public Library() {
        this.fictionBooks = new ArrayList<>();
        this.nonFictionBooks = new ArrayList<>();
        this.horrorBooks = new ArrayList<>();
        this.scienceFictionBooks = new ArrayList<>();
        this.fantasyBooks = new ArrayList<>();
    }

    public void addBook(Book book, int genre) {
        switch (genre) {
            case 1:
                fictionBooks.add(book);
                break;
            case 2:
                nonFictionBooks.add(book);
                break;
            case 3:
                horrorBooks.add(book);
                break;
            case 4:
                scienceFictionBooks.add(book);
                break;
            case 5:
                fantasyBooks.add(book);
                break;
            default:
                System.out.println("Not a valid choice.\nPlease choose a valid option.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");

        System.out.println("\n1. Fiction Books:");
        displayBooksByCategory(fictionBooks);

        System.out.println("\n2. Nonfiction Books:");
        displayBooksByCategory(nonFictionBooks);

        System.out.println("\n3. Horror Books:");
        displayBooksByCategory(horrorBooks);

        System.out.println("\n4. Science Fiction Books:");
        displayBooksByCategory(scienceFictionBooks);

        System.out.println("\n5. Fantasy Books:");
        displayBooksByCategory(fantasyBooks);
    }

    private void displayBooksByCategory(List<Book> bookList) {
        for (Book book : bookList) {
            if (book.isAvailable()) {
                System.out.println("....................................\n" + book);
            }
        }
    }

    public Book borrowBook(String isbn, int genre) {
        List<Book> bookList;
        switch (genre) {
            case 1:
                bookList = fictionBooks;
                break;
            case 2:
                bookList = nonFictionBooks;
                break;
            case 3:
                bookList = horrorBooks;
                break;
            case 4:
                bookList = scienceFictionBooks;
                break;
            case 5:
                bookList = fantasyBooks;
                break;
            default:
                return null;
        }

        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                return book;
            }
        }
        return null;
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
    }
}

class User {
    private static int userCount = 0;
    private int userId;
    private List<Book> borrowedBooks;

    public User() {
        this.userId = ++userCount;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("____________________WELCOME TO GREEN LIBRARY_________________________\n     Discover Your Optimal Selection!\n    Books are the keys to endless imagination");

        Book fictionBook1 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "1234");
        Book fictionBook2 = new FictionBook("The Handmaid's Tale", "Margaret Atwood", "1235");
        Book fictionBook3 = new FictionBook("The Hunger Games", "Suzanne Collins", "1236");
        Book fictionBook4 = new FictionBook("All the Light We Cannot See", "Anthony Doerr", "1237");
        Book fictionBook5 = new FictionBook("The Hobbit", "J. R. R. Tolkien", "1238");

        Book nonFictionBook1 = new NonFictionBook("The Immortal Life of Henrietta Lacks", "Rebecca Skloot", "4561");
        Book nonFictionBook2 = new NonFictionBook("In Cold Blood", "Truman Capote", "4562");
        Book nonFictionBook3 = new NonFictionBook("Freakonomics", "J. Dubner", "4563");
        Book nonFictionBook4 = new NonFictionBook("My Name Is Barbra", "Barbra Streisand", "4564");

        Book horrorBook1 = new HorrorBook("The Shining", "Stephen King", "7890");
        Book horrorBook2 = new HorrorBook("Dracula", "Bram Stoker", "7891");
        Book horrorBook3 = new HorrorBook("House of Leaves", "Mark Z. Danielewski", "7892");
        Book horrorBook4 = new HorrorBook("Ring", "Koji Suzuki", "7893");
        Book horrorBook5 = new HorrorBook("Frankenstein", "Mary Shelley", "7894");
        Book horrorBook6 = new HorrorBook("The Exorcist", "William Peter Blatty", "7895");
        Book horrorBook7 = new HorrorBook("The Rift", "Seth C. Adams", "7896");

        Book scienceFictionBook1 = new ScienceFictionBook("Dune", "Frank Herbert", "1470");
        Book scienceFictionBook2 = new ScienceFictionBook("The Three-Body Problem", "Liu Cixin", "1471");
        Book scienceFictionBook3 = new ScienceFictionBook("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "1472");
        Book scienceFictionBook4 = new ScienceFictionBook("Brave New World", "Aldous Huxley", "1473");
        Book scienceFictionBook5 = new ScienceFictionBook("Neuromancer", "William Gibson", "1474");
        Book scienceFictionBook6 = new ScienceFictionBook("Brave New World", "Aldous Huxley", "1475");

        Book fantasyBook1 = new FantasyBook("The Fifth Season", "N. K. Jemisin", "1590");
        Book fantasyBook2 = new FantasyBook("A Game of Thrones", "George R. R. Martin", "1591");
        Book fantasyBook3 = new FantasyBook("American Gods", "Neil Gaiman", "1592");

        library.addBook(fictionBook1, 1);
        library.addBook(fictionBook2, 1);
        library.addBook(fictionBook3, 1);
        library.addBook(fictionBook4, 1);
        library.addBook(fictionBook5, 1);
        library.addBook(nonFictionBook1, 2);
        library.addBook(nonFictionBook2, 2);
        library.addBook(nonFictionBook3, 2);
        library.addBook(nonFictionBook4, 2);
        library.addBook(horrorBook1, 3);
        library.addBook(horrorBook2, 3);
        library.addBook(horrorBook3, 3);
        library.addBook(horrorBook4, 3);
        library.addBook(horrorBook5, 3);
        library.addBook(horrorBook6, 3);
        library.addBook(horrorBook7, 3);
        library.addBook(scienceFictionBook1, 4);
        library.addBook(scienceFictionBook2, 4);
        library.addBook(scienceFictionBook3, 4);
        library.addBook(scienceFictionBook4, 4);
        library.addBook(scienceFictionBook5, 4);
        library.addBook(scienceFictionBook6, 4);
        library.addBook(fantasyBook1, 5);
        library.addBook(fantasyBook2, 5);
        library.addBook(fantasyBook3, 5);

        User user = new User();

        while (true) {
            System.out.println("\n1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Add a New Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String isbnToBorrow = scanner.nextLine();
                    System.out.print("Available Types of Books -:\n1.Fiction Book\n2.Nonfiction Book\n3.Horror Book\n4.Science Fiction Book\n5.FantasyBook\nEnter What you want Book Category-:");
                    int genreToBorrow = scanner.nextInt();
                    Book borrowedBook = library.borrowBook(isbnToBorrow, genreToBorrow);

                    if (borrowedBook != null) {
                        user.borrowBook(borrowedBook);
                        System.out.println("Congratulations!\nYou have successfully borrowed the selected book from our library collection.\nHappy reading!!!");
                    } else {
                        System.out.println("Unfortunately, the requested book is currently unavailable!!!");
                    }
                    break;
                case 3:

                    System.out.print("Enter ISBN of the book to return: ");
                    String isbnToReturn = scanner.nextLine();
                    Book bookToReturn = null;

                    for (Book borrowed : user.getBorrowedBooks()) {
                        if (borrowed.getIsbn().equals(isbnToReturn)) {
                            bookToReturn = borrowed;
                            break;
                        }
                    }

                    if (bookToReturn != null) {
                        library.returnBook(bookToReturn);
                        user.returnBook(bookToReturn);
                        System.out.println("The book has been successfully returned to the library's collection.");
                    } else {
                        System.out.println("Unfortunately, the book was not located in your list of borrowed items. \nPlease double-check the ISBN and try again.");
                    }
                    break;
                case 4:
                    System.out.print("Available Types of Books -:\n1.Fiction Book\n2.Nonfiction Book\n3.Horror Book\n4.Science Fiction Books\n5.Fantasy Book\nEnter Type of Book-:");
                    int genreToAdd = scanner.nextInt();
                    Book newBook;

                    switch (genreToAdd) {
                        case 1:
                            newBook = new FictionBook(scanner);
                            break;
                        case 2:
                            newBook = new NonFictionBook(scanner);
                            break;
                        case 3:
                            newBook = new HorrorBook(scanner);
                            break;
                        case 4:
                            newBook = new ScienceFictionBook(scanner);
                            break;
                        case 5:
                            newBook = new FantasyBook(scanner);
                            break;
                        default:
                            System.out.println("Not a valid choice.\nPlease choose a valid option.");
                            continue;  // Skip the rest of the loop and start over
                    }

                    library.addBook(newBook, genreToAdd);
                    System.out.println("A new addition to our library catalog has been successfully registered.");
                    break;
                case 5:
                    System.out.println("Concluding the program.\n Thank you for your participation and happy reading!!!");
                    System.exit(0);
                default:
                    System.out.println("Apologies, the selected option is not valid. Kindly enter a valid choice from the provided options.");
            }
        }
    }
}
