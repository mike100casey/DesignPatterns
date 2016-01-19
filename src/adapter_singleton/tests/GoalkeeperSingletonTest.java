package adapter_singleton.tests;

import adapter_singleton.Goalkeeper;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by Michael on 1/14/2016.
 */
public class GoalkeeperSingletonTest {

    /**
     * Test the singleton in a non-concurrent setting
     */
    @Test
    public void testReturnTheSameObject() {

        // Create several instances
        Goalkeeper instance1 = Goalkeeper.getUniqueGoalkeeper();
        Goalkeeper instance2 = Goalkeeper.getUniqueGoalkeeper();
        Goalkeeper instance3 = Goalkeeper.getUniqueGoalkeeper();

        // check they are equal
        assertSame(instance1, instance2);
        assertSame(instance1, instance3);
        assertSame(instance2, instance3);
    }

}