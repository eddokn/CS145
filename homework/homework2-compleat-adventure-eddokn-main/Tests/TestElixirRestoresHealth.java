import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestElixirRestoresHealth

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestElixirRestoresHealth {
   @Test
   public void testElixir() {
       Player frodo = new Player("Frodo");
       Player sauron = new Player("Sauron");

       Sword s = new Sword();
       for (int i = 0; i < 5; i++) {
           sauron.attack(frodo, s, false);
       }
       assertEquals(75, frodo.getHealth());

       Potion e = new Potion("Catswort");
       frodo.drink(e);
       assertEquals(85, frodo.getHealth());
   }
}
