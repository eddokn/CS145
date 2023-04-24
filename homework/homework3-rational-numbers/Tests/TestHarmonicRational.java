import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestHarmonicRational

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestHarmonicRational {
   @Test
   public void test1() {
       Rational h = Harmonic.harmonicRational(1);
       assertEquals(1, h.getNumerator());
       assertEquals(1, h.getDenominator());
   }

   @Test
   public void test5() {
       Rational h = Harmonic.harmonicRational(5);
       assertEquals(137, h.getNumerator());
       assertEquals(60, h.getDenominator());
   }
}
