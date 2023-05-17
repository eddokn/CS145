import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;


public class CollectionTest {
    private void testQ(Queue q) {
        assertEquals(null, q.getHead());
        assertEquals(null, q.getTail());

        q.put(42);
        q.put(13);
        q.put(7);
        assertEquals(3, q.size());

        // Check that the queue is well formed
        assertTrue(q.getHead().value == 42 || q.getHead().value == 7);
        assertEquals(13, q.getHead().next.value);
        assertEquals(13, q.getTail().previous.value);

        assertEquals(42, q.get());
        assertEquals(13, q.get());
        assertEquals(7, q.get());
        assertEquals(0, q.size());

        assertEquals(null, q.getHead());
        assertEquals(null, q.getTail());
    }

    @Test
    public void testQueue() {
        Queue q = new Queue();
        testQ(q);
    }

    @Test
    public void testLimitedQueue() {
        // limited queue should work like a regular queue
        LimitedQueue lq = new LimitedQueue(3);
        testQ(lq);

        lq.put(42);
        lq.put(13);
        lq.put(7);
        lq.put(55);
        assertEquals(3, lq.size());

        assertEquals(42, lq.get());
        assertEquals(13, lq.get());
        assertEquals(7, lq.get());
    }

    @Test
    public void testStack() {
        Stack s = new Stack();
        assertEquals(null,s.getHead());
        assertEquals(null, s.getTail());

        s.put(42);
        s.put(13);
        s.put(7);
        assertEquals(3, s.size());

        // Check that the queue is well formed
        assertTrue(s.getHead().value == 42 || s.getHead().value == 7);
        assertEquals(13, s.getHead().next.value);
        assertEquals(13, s.getTail().previous.value);

        assertEquals(7, s.get());
        assertEquals(13, s.get());
        assertEquals(42, s.get());
        assertEquals(0, s.size());

        assertEquals(null, s.getHead());
        assertEquals(null, s.getTail());
    }

    @Test
    public void testSet() {
        Set s = new Set();
        s.put(42);
        s.put(13);
        s.put(7);
        assertEquals(3, s.size());

        s.put(42);
        assertEquals(3, s.size());

        Integer value1 = s.get();
        assertTrue(value1 == 42 || value1 == 13 || value1 == 7);

        Integer value2 = s.get();
        assertTrue(value1 == 42 || value1 == 13 || value1 == 7);

        Integer value3 = s.get();
        assertTrue(value1 == 42 || value1 == 13 || value1 == 7);

        assertTrue(value1 != value2 && value1 != value3 && value2 != value3);

        assertEquals(0, s.size());
    }

    @Test
    public void testSetUnion() {
        Set s1 = new Set();
        s1.put(42);
        s1.put(13);
        s1.put(7);
        assertEquals(3, s1.size());

        Set s2 = new Set();
        s2.put(42);
        s2.put(55);
        s2.put(77);

        Set s3 = s1.union(s2);
        assertEquals(5, s3.size());

        assertTrue(s3.contains(42));
        assertTrue(s3.contains(13));
        assertTrue(s3.contains(7));
        assertTrue(s3.contains(55));
        assertTrue(s3.contains(77));
    }

    @Test
    public void testSetIntersect() {
        Set s1 = new Set();
        s1.put(420);
        s1.put(13);
        s1.put(7);
        assertEquals(3, s1.size());

        Set s2 = new Set();
        s2.put(42);
        s2.put(13);
        s2.put(77);

        Set s3 = s1.intersect(s2);
        assertEquals(1, s3.size());

        assertTrue(s3.contains(13));
    }
}
