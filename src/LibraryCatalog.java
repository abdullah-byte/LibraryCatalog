import java.util.ArrayList;

public class LibraryCatalog {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book ){
        books.add(book);
    }

    public void removeBook(String title){
        Book book = findBook(title);
        if (book == null){
            System.out.println("The book with "+ title +" does not exist");
            return;
        }
        books.remove(book);
    }


    public Book findBook(String title){
        for (Book book: books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void listBooks (){
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Genre: " + book.getGenre());
            System.out.println();
        }

    }



}
