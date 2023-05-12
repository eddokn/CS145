import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestWeapon

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestWeapon {
   @Test
   public void test() {
       Weapon w = new Weapon("Mace");
       assertEquals("Mace", w.getName() );
       assertEquals(0, w.getDamage());
       assertEquals(0, w.getCost());
       assertEquals(0, w.ultimateDamage());
   }
}
