package assessments.assessment06_event_driven_telemetry_pubsub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelemetryAggregator {
    private final Map<String, List<Double>> metrics = new HashMap<>();

    public synchronized void recordMetric(String serviceName, double latencyMs) {
        if (serviceName == null || latencyMs < 0) {
            throw new IllegalArgumentException("Invalid service name or latency");
        }
        metrics.computeIfAbsent(serviceName, k -> new ArrayList<>()).add(latencyMs);
    }

    public synchronized double getAverage(String serviceName) {
        List<Double> list = metrics.get(serviceName);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No metrics for service: " + serviceName);
        }
        double sum = 0;
        for (double v : list) sum += v;
        return sum / list.size();
    }

    public synchronized double getP95(String serviceName) {
        List<Double> list = metrics.get(serviceName);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No metrics for service: " + serviceName);
        }
        List<Double> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        int index = (int) Math.ceil(0.95 * sorted.size()) - 1;
        return sorted.get(Math.max(0, index));
    }
}
