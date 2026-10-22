package assessments.assessment04_fraud_detection_sliding_window;

import testrunner.TestRunner;

public class FraudDetectorTest {
    public void testDetectionWindow() {
        FraudDetector detector = new FraudDetector(3, 1000L); // Max 3 per 1000ms

        TestRunner.assertFalse(detector.recordTransaction("CARD-1", 100, 10.0));
        TestRunner.assertFalse(detector.recordTransaction("CARD-1", 200, 15.0));
        TestRunner.assertFalse(detector.recordTransaction("CARD-1", 500, 20.0));
        // 4th transaction within 1000ms window -> Suspicious!
        TestRunner.assertTrue(detector.recordTransaction("CARD-1", 800, 5.0));

        // After window expires:
        TestRunner.assertFalse(detector.recordTransaction("CARD-1", 1500, 20.0));
    }
}
