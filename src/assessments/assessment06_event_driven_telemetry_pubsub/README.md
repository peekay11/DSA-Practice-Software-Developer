# Assessment 6: Metric Aggregator & Alerting PubSub

### Requirements
Implement `TelemetryAggregator`:
- `public void recordMetric(String serviceName, double latencyMs)`
- `public double getP95(String serviceName)`
- `public double getAverage(String serviceName)`
- Throws on invalid inputs.

### Examples (LeetCode Style)

**Example 1:**
```text
Input Events:
1. publish("latency", 100.0)
2. publish("latency", 200.0)
3. publish("error_count", 5.0)

Output Metrics:
- getAverage("latency") -> 150.0
- getMax("latency") -> 200.0
- getSum("error_count") -> 5.0
```
