#!/usr/bin/env bash
set -e

# Offline Java Test Runner Script
# Works completely without Maven, Gradle, or Internet!
PROJECT_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
BIN_DIR="$PROJECT_ROOT/bin"
LIB_DIR="$PROJECT_ROOT/lib"
mkdir -p "$BIN_DIR"

CP="$BIN_DIR:$LIB_DIR/*"

echo "Compiling sources in $PROJECT_ROOT..."
find "$PROJECT_ROOT/src" -name "*.java" > "$PROJECT_ROOT/sources.txt" 2>/dev/null || true

if [ ! -s "$PROJECT_ROOT/sources.txt" ]; then
    echo "No Java source files found in src!"
    exit 1
fi

javac -cp "$CP" -d "$BIN_DIR" @"$PROJECT_ROOT/sources.txt"
rm "$PROJECT_ROOT/sources.txt"

if [ $# -gt 0 ]; then
    echo "Running specified tests: $@"
    java -cp "$CP" testrunner.TestRunner "$@"
else
    # Find all test classes ending in Test or Tests
    TEST_CLASSES=$(find "$PROJECT_ROOT/src" -name "*Test.java" -o -name "*Tests.java" | sed "s|.*src/||" | sed 's|/|.|g' | sed 's|\.java$||')
    if [ -z "$TEST_CLASSES" ]; then
        echo "No test files matching *Test.java found!"
        exit 1
    fi
    echo "Discovered Test Classes:"
    echo "$TEST_CLASSES"
    java -cp "$CP" testrunner.TestRunner $TEST_CLASSES
fi
