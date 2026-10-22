package assessments.assessment06_event_driven_telemetry_pubsub;

public class TelemetryAggregator {
    public synchronized void recordMetric(String serviceName, double latencyMs) {
        // TODO: Record metric
        throw new UnsupportedOperationException("Not implemented");
    }

    public synchronized double getAverage(String serviceName) {
        // TODO: Average latency
        throw new UnsupportedOperationException("Not implemented");
    }

    public synchronized double getP95(String serviceName) {
        // TODO: P95 latency percentile
        throw new UnsupportedOperationException("Not implemented");
    }
}
