# Assessment 6: Metric Aggregator & Alerting PubSub

### Requirements
Implement `TelemetryAggregator`:
- `public void recordMetric(String serviceName, double latencyMs)`
- `public double getP95(String serviceName)`
- `public double getAverage(String serviceName)`
- Throws on invalid inputs.
