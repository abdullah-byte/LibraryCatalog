import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        while (true){
            System.out.println("Library Catalog Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book");
            System.out.println("4. List Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice){
                case 1:
                    Book book = new Book();
                    System.out.println("Please enter the Title of the book \n");
                    String title = scanner.nextLine();
                    book.setTitle(title);

                    System.out.println("Please enter the Author of the book \n");
                    String author = scanner.nextLine();
                    book.setAuthor(author);

                    System.out.println("Please enter the ISBN of the book \n");
                    String isbn = scanner.nextLine();
                    book.setISBN(isbn);

                    System.out.println("Please enter the Genre of the book \n");
                    String genre = scanner.nextLine();
                    book.setGenre(genre);

                    libraryCatalog.addBook(book);
                    break;

                case 2:
                    System.out.println("Please enter title of book to remove \n");
                    String bookTitle = scanner.nextLine();
                    libraryCatalog.removeBook(bookTitle);
                    break;

                case 3:
                    System.out.println("Please enter the title of the book you want to find \n");
                    String bookName = scanner.nextLine();
                    Book bookInfo = libraryCatalog.findBook(bookName);

                    System.out.println("Title: " + bookInfo.getTitle());
                    System.out.println("Author: " + bookInfo.getAuthor());
                    System.out.println("ISBN: " + bookInfo.getISBN());
                    System.out.println("Genre: " + bookInfo.getGenre());
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    libraryCatalog.listBooks();
                    break;

                case 5:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;

            }

        }



    }
}