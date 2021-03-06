package library.dao;

import library.dto.Book;

import java.util.List;


public interface BookDao {
    boolean updateBookInAllBooks(Book book, String isbn);

    boolean updateBookInAvailableBooks(Book book, String isbn);

    boolean createForRented(Book book);

    boolean createForAllBooks(Book book);

    boolean createForAvailable(Book book);

    List<Book> getAll();
    List<Book> getAllAvaiable();

    List<Book> getUserRentedBooks();

    Book getBookFromAvailable(String isbn);
    Book getBookFromRented(String isbn);

    void removeBookFromAvailable(String isbn);

    void removeBookFromAllBooks(String isbn);

    void removeBookFromRented(String isbn);

    boolean exist(String isbn);
}
