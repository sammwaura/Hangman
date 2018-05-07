import org.junit.*;
import static org.junit.Assert.*;

public class TestHangman{
    @Test public void 
        TestHangmanAppInstantiatesCorrectly() {
            Hangman game = new Hangman("Apple");
            assertNotNull(hangman);
        }

        @Test(expected = IllegalArgumentException.class)
            public void testDoesNotInstantiateWithEmptyString() {
                Hangman game = new Hangman("");

            }

            @Test(expected = IllegalArgumentException.class)
            public void testDoesNotInstantiateWithNUmbers() {
                Hangman game = new Hangman("apple-6");

            }

            @Test public void testCanGetWord() {
                Hangman game = new Hangman("apple");
                String expected = "";
                assertEquals(expected,hangman.getWord());
            }

            @Test public void testCanSetWord() {
                Hangman game = new Hangman();
                hangman.setWord("");
                String expected = "";
                assertEquals(expected,hangman.getWord());
            }
}