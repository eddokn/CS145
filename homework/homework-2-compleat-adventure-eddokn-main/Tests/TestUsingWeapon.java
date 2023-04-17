import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestUsingWeapon

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestUsingWeapon {
   @Test
   public void test() {
       Player frodo = new Player("Frodo");
       Player sauron = new Player("Sauron");
       Sword s = new Sword();
       sauron.attack(frodo, s, false);
       assertEquals(100, sauron.getHealth());
       assertEquals(95, sauron.getManna());
       assertEquals(95, frodo.getHealth());
       assertEquals(100, frodo.getManna());
   }
}
