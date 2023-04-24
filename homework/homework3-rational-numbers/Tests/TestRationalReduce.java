import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestRationalReduce

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestRationalReduce {
   @Test
   public void test() {
       Rational r = new Rational(7, 42);
       Rational s = r.reduce();

       assertEquals(7, r.getNumerator());
       assertEquals(42, r.getDenominator());

       assertEquals(1, s.getNumerator());
       assertEquals(6, s.getDenominator());
   }
}
