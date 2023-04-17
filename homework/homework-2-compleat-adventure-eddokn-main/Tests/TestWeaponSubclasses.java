import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestWeaponSubclasses

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestWeaponSubclasses {
   @Test
   public void testSword() {
       Sword s = new Sword();
       assertEquals("Sword", s.getName());
       assertEquals(5, s.getDamage());
       assertEquals(5, s.getCost());
       assertEquals(50, s.ultimateDamage());
   }

   @Test
   public void testBlaster() {
       Blaster b = new Blaster();
       assertEquals("Blaster", b.getName());
       assertEquals(10, b.getDamage());
       assertEquals(2, b.getCost());
       assertEquals(15, b.ultimateDamage());
   }
}
