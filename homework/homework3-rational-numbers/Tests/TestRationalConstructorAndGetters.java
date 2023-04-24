import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestRationalConstructorAndGetters

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestRationalConstructorAndGetters {
   @Test
   public void test() {
       Rational r = new Rational(2, 3);
       assertEquals(2, r.getNumerator());
       assertEquals(3, r.getDenominator());
       assertTrue(r.toString().equals("2/3"));
   }

   @Test
   public void testDefaultCtor() {
       Rational r = new Rational();
       assertEquals(0, r.getNumerator());
       assertEquals(1, r.getDenominator());      
   }
}
