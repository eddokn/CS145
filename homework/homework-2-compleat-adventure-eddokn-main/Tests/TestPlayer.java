import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestPlayer

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestPlayer {
   @Test
   public void test() {
       Player p = new Player("Samwise");
       assertEquals("Samwise", p.getName());
       assertEquals(100, p.getHealth());
       assertEquals(100, p.getManna());
   }
}
