import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestRationalAdd

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestRationalAdd {
   @Test
   public void test() {
       Rational r = new Rational(1, 7);
       Rational s = new Rational(4, 21);
       Rational t = r.add(s);

       assertEquals(1, r.getNumerator());
       assertEquals(7, r.getDenominator());

       assertEquals(4, s.getNumerator());
       assertEquals(21, s.getDenominator());

       assertEquals(1, t.getNumerator());
       assertEquals(3, t.getDenominator());
   }
}
