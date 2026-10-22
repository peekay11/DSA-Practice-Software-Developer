package assessments.assessment06_event_driven_telemetry_pubsub;

import testrunner.TestRunner;

public class TelemetryAggregatorTest {
    public void testMetrics() {
        TelemetryAggregator agg = new TelemetryAggregator();
        for (int i = 1; i <= 100; i++) {
            agg.recordMetric("auth-service", i);
        }

        TestRunner.assertEquals(50.5, agg.getAverage("auth-service"), 1e-4, "Avg latency");
        TestRunner.assertEquals(95.0, agg.getP95("auth-service"), 1.0, "P95 latency");
    }

    public void testEmptyServiceThrows() {
        TelemetryAggregator agg = new TelemetryAggregator();
        try {
            agg.getAverage("unknown-service");
            TestRunner.fail("Should throw on unknown service");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }
}
