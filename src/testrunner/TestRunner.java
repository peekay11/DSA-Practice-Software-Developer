package testrunner;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestRunner {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java testrunner.TestRunner <FullyQualifiedTestClassName> [...]");
            System.exit(1);
        }

        System.out.println("=================================================");
        System.out.println("      OFFLINE TDD TEST RUNNER - SUITE EXECUTION   ");
        System.out.println("=================================================");

        for (String className : args) {
            runTestClass(className);
        }

        System.out.println("=================================================");
        System.out.printf("TOTAL RESULTS: %d PASSED, %d FAILED\n", passed, failed);
        System.out.println("=================================================");

        if (failed > 0) {
            System.exit(1);
        }
    }

    private static void runTestClass(String className) {
        System.out.println("\n>>> Running Suite: " + className);
        try {
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method[] methods = clazz.getDeclaredMethods();

            for (Method m : methods) {
                if (m.getName().startsWith("test") && Modifier.isPublic(m.getModifiers()) && m.getParameterCount() == 0) {
                    try {
                        m.invoke(instance);
                        System.out.println("  [PASS] " + m.getName());
                        passed++;
                    } catch (Throwable t) {
                        Throwable cause = t.getCause() != null ? t.getCause() : t;
                        System.err.println("  [FAIL] " + m.getName() + " -> " + cause.getMessage());
                        cause.printStackTrace(System.err);
                        failed++;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Could not instantiate or run test class: " + className + " (" + e.getMessage() + ")");
            failed++;
        }
    }

    public static void assertEquals(Object expected, Object actual, String message) {
        if (expected == null && actual == null) return;
        if (expected != null && expected.equals(actual)) return;
        throw new AssertionError((message != null ? message + ": " : "") + "Expected [" + expected + "] but got [" + actual + "]");
    }

    public static void assertEquals(Object expected, Object actual) {
        assertEquals(expected, actual, "Values not equal");
    }

    public static void assertEquals(long expected, long actual, String message) {
        if (expected != actual) {
            throw new AssertionError((message != null ? message + ": " : "") + "Expected [" + expected + "] but got [" + actual + "]");
        }
    }

    public static void assertEquals(double expected, double actual, double epsilon, String message) {
        if (Math.abs(expected - actual) > epsilon) {
            throw new AssertionError((message != null ? message + ": " : "") + "Expected [" + expected + "] but got [" + actual + "] within epsilon " + epsilon);
        }
    }

    public static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message != null ? message : "Expected condition to be true");
        }
    }

    public static void assertTrue(boolean condition) {
        assertTrue(condition, "Expected true");
    }

    public static void assertFalse(boolean condition, String message) {
        if (condition) {
            throw new AssertionError(message != null ? message : "Expected condition to be false");
        }
    }

    public static void assertFalse(boolean condition) {
        assertFalse(condition, "Expected false");
    }

    public static void assertNotNull(Object obj, String message) {
        if (obj == null) {
            throw new AssertionError(message != null ? message : "Expected object not to be null");
        }
    }

    public static void assertNull(Object obj, String message) {
        if (obj != null) {
            throw new AssertionError(message != null ? message : "Expected object to be null, got: " + obj);
        }
    }

    public static void assertNull(Object obj) {
        assertNull(obj, "Expected null");
    }

    public static void assertNotNull(Object obj) {
        assertNotNull(obj, "Expected not null");
    }

    public static void fail(String message) {
        throw new AssertionError(message);
    }
}
