import org.junit.*;
import static org.junit.Assert.*;

public class TestMyMain{
    @Test
    public void myTest_BringUp_HelloWorld(){
        myMain testMain = new myMain();
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, testMain.runMain("Hello World"));
    }
}