package example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().getBooks();
//        books.sort(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });

//        books.sort((b1, b2) -> b1.getName().compareTo(b2.getName()));


        books.sort(Comparator.comparing(Book::getName));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }

}

class MyComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
