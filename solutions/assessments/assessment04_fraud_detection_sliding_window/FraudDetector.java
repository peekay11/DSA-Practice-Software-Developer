package assessments.assessment04_fraud_detection_sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class FraudDetector {
    private final int maxAllowedEvents;
    private final long windowMillis;
    private final Map<String, Deque<Long>> cardHistory = new HashMap<>();

    public FraudDetector(int maxAllowedEvents, long windowMillis) {
        if (maxAllowedEvents <= 0 || windowMillis <= 0) {
            throw new IllegalArgumentException("Parameters must be positive");
        }
        this.maxAllowedEvents = maxAllowedEvents;
        this.windowMillis = windowMillis;
    }

    public synchronized boolean recordTransaction(String cardId, long timestampMillis, double amount) {
        if (cardId == null || amount < 0) {
            throw new IllegalArgumentException("Invalid card or amount");
        }
        Deque<Long> queue = cardHistory.computeIfAbsent(cardId, k -> new ArrayDeque<>());

        while (!queue.isEmpty() && (timestampMillis - queue.peekFirst()) > windowMillis) {
            queue.pollFirst();
        }

        queue.offerLast(timestampMillis);
        return queue.size() > maxAllowedEvents;
    }
}
