package assessments.assessment05_dag_payment_routing_settlement;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;
import java.util.Arrays;
import java.util.List;

public class PaymentDependencyResolverTest {
    @Test
    public void testValidDAG() {
        List<String> transfers = Arrays.asList("TX1", "TX2", "TX3");
        List<String[]> deps = Arrays.asList(
            new String[]{"TX2", "TX1"}, // TX2 depends on TX1
            new String[]{"TX3", "TX2"}  // TX3 depends on TX2
        );
        List<String> order = PaymentDependencyResolver.resolveExecutionOrder(transfers, deps);
        TestRunner.assertEquals(3, order.size());
        TestRunner.assertEquals("TX1", order.get(0));
        TestRunner.assertEquals("TX2", order.get(1));
        TestRunner.assertEquals("TX3", order.get(2));
    }

    @Test
    public void testCyclicDeadlock() {
        List<String> transfers = Arrays.asList("TXA", "TXB");
        List<String[]> deps = Arrays.asList(
            new String[]{"TXA", "TXB"},
            new String[]{"TXB", "TXA"}
        );
        List<String> order = PaymentDependencyResolver.resolveExecutionOrder(transfers, deps);
        TestRunner.assertEquals(0, order.size(), "Cycle must return empty list");
    }
}
