import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import java.util.Iterator;
import java.util.HashSet;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ChickenShackTest {
    @Test
    public void testLessThan4() {
        assertFalse(ChickenShack.canBuy(0));
        assertFalse(ChickenShack.canBuy(3));
    }

    @Test
    public void testBase() {
        assertTrue(ChickenShack.canBuy(4));
        assertTrue(ChickenShack.canBuy(13));
    }

    @Test
    public void testPossible() {
        assertTrue(ChickenShack.canBuy(8));
        assertTrue(ChickenShack.canBuy(12));
        assertTrue(ChickenShack.canBuy(17));
        assertTrue(ChickenShack.canBuy(26));
    }

    @Test
    public void testImpossible() {
        assertFalse(ChickenShack.canBuy(7));
        assertFalse(ChickenShack.canBuy(14));
        assertFalse(ChickenShack.canBuy(27));
        assertFalse(ChickenShack.canBuy(35));      
    }
}
