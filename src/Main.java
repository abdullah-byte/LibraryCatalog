import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book theBook = new Book();


        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the author of the book \n");
        String author = scanner.nextLine();
        theBook.setAuthor(author);

        System.out.println("Please enter the ISBN of the book \n");
        String ISBN = scanner.nextLine();
        theBook.setISBN(ISBN);

        System.out.println("Please enter the genre of the \n");
        String genre = scanner.nextLine();
        theBook.setGenre(genre);



        ArrayList<String> libraryBooks = new ArrayList<String>();
        libraryBooks.add("Science");
        libraryBooks.add("Maths");
        libraryBooks.add("English");
        libraryBooks.add("Comics");
        libraryBooks.add("Religious");


        libraryCata libraryAccess = new libraryCata();
        System.out.println(libraryBooks);

        System.out.println("To add a book - enter 1, to remove a book - enter 2, to find a book - enter 3, to list all books - enter 4");
        int toDo = scanner.nextInt();

        theBook.setToDo(toDo);

        switch (toDo){
            case 1:

                System.out.println("Please enter the Title of the book \n");
                String addBook = scanner.nextLine();

                libraryAccess.setAddBook(addBook);
                libraryBooks.add(addBook);

                System.out.println(libraryBooks);
                break;

            case 2:

                System.out.println("Please enter title of book to remove \n");
                String removeBook = scanner.nextLine();
                libraryAccess.setRemoveBook(removeBook);
                libraryBooks.remove(removeBook);

                System.out.println(libraryBooks);
                break;

            case 3:

                System.out.println("Please enter the index of the book to search \n");
                int findBook = scanner.nextInt();
                libraryAccess.setFindBook(findBook);

                System.out.println(libraryBooks.get(findBook));
                break;


            case 4:

                System.out.println(libraryBooks);
                break;

            case 5:

                System.out.println("Invalid input");
                break;


        }




    }
}