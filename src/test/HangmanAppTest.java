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
            public void testDoesNotInstantiateWithNumbers() {
                Hangman game = new Hangman("apple-6");

            }

            @Test public void testCanGetInputCharacter() {
                Hangman game = new Hangman("a");
                String expected = "a";
                assertEquals(expected,hangman.testCanGetInputCharacter());
            }

            @Test public void testCanGetIndexes() {
                Hangman game = new Hangman();
                hangman.setWord("_");
                String expected = "_";
                assertEquals(expected,hangman.getIndexes());
            }
             
    
}