import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book b1;
    Book b2;

    // this tests first
    @BeforeEach
    void setUp() {
        b1 = new Book("harry potter", "rowling", 1996, 700);
        b2 = new Book("it", "king", 1987, 1400);
    }

    // this tests third
    //This gets tested fifth
    @AfterEach
    void tearDown() {
        b1 = null;
        b2 = null;
    }
    // these tests below do not go in any particular order
    // This tests second
    @Test
    void testConstructor() {
        assertEquals("HARRY POTTER", b1.getTitle());
        assertEquals("IT", b2.getTitle());

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            b1 = new Book(null, "rowling", 1996, 700);
        });
        assertEquals("a book needs a title!!!", ex.getMessage());
    }

    // The next constructor/method is tested fourth
}