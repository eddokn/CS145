import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.Math;
import java.util.ArrayList;

// javac -cp .:Tests/junit-4.10.jar:Tests/ *.java Tests/*.java
// java -cp .:Tests/junit-4.10.jar:Tests/ TestRunner TestHarmonicDouble

/**
 * These are tests that are run against your code. You can examine
 * the tests to see what they are checking for.
 */
public class TestHarmonicDouble {
   @Test
   public void test1() {
       double h = Harmonic.harmonicDouble(1);
       assertEquals(1, h, 0.01);
   }

   @Test
   public void test3() {
       double h = Harmonic.harmonicDouble(3);
       assertEquals(1.0 + 1.0/2.0 + 1.0/3.0, h, 0.0001);
   }
}
