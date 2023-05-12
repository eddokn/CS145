import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestHealthAndManna

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestHealthAndManna {
   @Test
   public void testHealth() {
       Player frodo = new Player("Frodo");
       frodo.sufferDamage(200);
       assertEquals(0, frodo.getHealth());
   }

   @Test
   public void testManna() {
       Player frodo = new Player("Frodo");
       Player sauron = new Player("Sauron");
       Sword s = new Sword();

       for (int i = 0; i < 25; i++) {
           frodo.attack(sauron, s, false);
       }

       assertEquals(0, sauron.getHealth());
       assertEquals(0, frodo.getManna());
   }
}
