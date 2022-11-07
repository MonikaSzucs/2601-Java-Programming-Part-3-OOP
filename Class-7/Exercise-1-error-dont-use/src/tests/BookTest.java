import jdk.jfr.StackTrace;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book b1;
    Book b2;

    // first this gets executed
    // then after the third this will happen again
    @BeforeEach
    void setUp() {
        b1 = new Book("harry potter", "rowling", 1996, 700);
        b1 = new Book("IT", "king", 1997, 600);

    }

    // third this will happen
    @AfterEach
    void tearDown() {
        b1 = null;
        b2 = null;
    }

    // second this gets executed
    @Test
    void testConstructor() {
        assertEquals("HARRY POTTER", b1.getTitle());
        assertEquals("IT", b2.getTitle());

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            b1 = new Book(null, "rowling", 1996, 700);
        });
        assertEquals("a book needs a title!!!", ex.getMessage());
    }
}