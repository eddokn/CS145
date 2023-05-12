import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestDrinkingElixir

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestDrinkingElixir {
   @Test
   public void testElixir() {
       MagicElixir e = new MagicElixir();
       assertEquals(e.getBenefit(), 20);

       int benefit = e.drink();
       assertEquals(20, benefit);
       assertEquals(0, e.getBenefit());
   }
}
