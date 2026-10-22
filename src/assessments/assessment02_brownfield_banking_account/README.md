# Assessment 2: Brownfield Banking Account Audit

### Scenario
A legacy banking ledger is suffering from race conditions, missing input sanitization, and rounding discrepancies.
You are given the legacy class `BankAccount` with buggy behavior.

### Refactoring Tasks
1. Prevent thread-safety issues during concurrent deposit, withdraw, and transfer operations.
2. Defensively reject negative or NaN amounts.
3. Fix transaction fee double-charging bug.
4. Provide comprehensive unit tests verifying concurrent integrity.
