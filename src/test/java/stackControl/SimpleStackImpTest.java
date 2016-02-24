package stackControl;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by 21207071 on 24/02/2016.
 */
public class SimpleStackImpTest {
    @Test
    public void test_isEmptyTrue () {
        SimpleStack stack = new SimpleStackImp();
        assertTrue(stack.isEmpty());
    }
}
