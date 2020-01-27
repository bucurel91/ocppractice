import codewars.Greed;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class CodeWarsTest {

    @Test
    public void testExample() {
//        assertEquals("Score for [5,1,3,4,1] must be 250:", 250, Greed.greedy(new int[]{5,1,3,4,1}));
//        assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, Greed.greedy(new int[]{1,1,1,3,1}));
//        assertEquals("Score for [2,4,4,5,4] must be 450:", 450, Greed.greedy(new int[]{2,4,4,5,4}));
//        assertEquals("Score for [6,6,6,6,1] must be 700:", 700, Greed.greedy(new int[]{6,6,6,6,1}));
        assertEquals("Score for [6,6,6,6,1] must be 700:", 300, Greed.greedy(new int[]{2,2,2,1,4}));
       // assertEquals("Score for [6,6,6,6,1] must be 700:", 550, Greed.greedy(new int[]{3,4,3,3,2,4,4,4,4,4,1,2,6,1,1,1,1,1,4,1,4,3,4,1,4,5,4,5,5,5}));
    }

}
