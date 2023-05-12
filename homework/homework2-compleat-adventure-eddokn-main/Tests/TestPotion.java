import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestPotion

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestPotion {
   @Test
   public void testPotion() {
       Potion p = new Potion("Mugwort");
       assertEquals("Mugwort", p.getName());
       assertEquals(10, p.getBenefit());
   }

   @Test
   public void testElixir() {
       MagicElixir e = new MagicElixir();
       assertEquals("MagicElixir", e.getName());
       assertEquals(20, e.getBenefit());
   }
}
