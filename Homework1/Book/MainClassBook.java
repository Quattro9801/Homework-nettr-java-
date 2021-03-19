package Book;
import java.util.*;
import java.util.Arrays;
import java.util.Collection;

public class MainClassBook {
    public static void main(String[] args) {

       List<Author> authors = (List<Author>) Arrays.asList(
                new Author("Tolstoy", "Tolstoy@mail.ru", 'm'),
                new Author("Pushkin", "Push@mail.ru", 'm'),
                new Author(" Lermontow", "Lermontow@.com", 'm')
        );


       Book book=new Book("War And World",authors,55);
        System.out.println(book);
        System.out.println(book.getAuthorsNames());
        System.out.println("//////////////////////////////////////");
        List<Author> authors1 = (List<Author>) Arrays.asList(
                new Author("Dostoevsky", "Dostoevsky@mail.ru", 'm')

        );
        Book book1=new Book("Crime and punishment",authors1,90,2);
        System.out.println(book1);
        System.out.println(book1.getAuthorsNames());
    }
}
