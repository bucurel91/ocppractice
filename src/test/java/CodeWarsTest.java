import codewars.Greed;
import codewars.RangeExtraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CodeWarsTest {

    @Test
    public void testExample() {
        assertEquals("Score for [5,1,3,4,1] must be 250:", 250, Greed.greedy(new int[]{5,1,3,4,1}));
        assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, Greed.greedy(new int[]{1,1,1,3,1}));
        assertEquals("Score for [2,4,4,5,4] must be 450:", 450, Greed.greedy(new int[]{2,4,4,5,4}));
        assertEquals("Score for [6,6,6,6,1] must be 700:", 700, Greed.greedy(new int[]{6,6,6,6,1}));
        assertEquals("Score for [6,6,6,6,1] must be 700:", 300, Greed.greedy(new int[]{2,2,2,1,4}));
        assertEquals("Score for [6,6,6,6,1] must be 700:", 550, Greed.greedy(new int[]{3,4,3,3,2,4,4,4,4,4,1,2,6,1,1,1,1,1,4,1,4,3,4,1,4,5,4,5,5,5}));
    }

    @Test
    public void test_BasicTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-21,-19--16,-14,-12--10,-8,-5,-2,-1,2,4-6,8,11,14,15,18-20,23,26,29", RangeExtraction.rangeExtraction(new int[] {-21,-19,-18,-17,-16,-14,-12,-11,-10,-8,-5,-2,-1,2,4,5,6,8,11,14,15,18,19,20,23,26,29}));
    }

}
