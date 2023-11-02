package lesson04.book;
// import lesson04.book.Book;
// import lesson04.book.BookRepository;
// import lesson04.book.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        String bookId = "book1";
        Book expectedBook = new Book(bookId, "Ромео и Джульетта", "Шекспир");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        Book actualBook = bookService.findBookById(bookId);

        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book("book1", "Ромео и Джульетта", "Шекспир"),
                new Book("book2", "Преступление и наказание", "Достоевский")
        );
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.findAllBooks();

        assertEquals(expectedBooks, actualBooks);
    }
}