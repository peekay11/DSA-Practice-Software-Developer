# Assessment 2: Brownfield Banking Account Audit

### Scenario
A legacy banking ledger is suffering from race conditions, missing input sanitization, and rounding discrepancies.
You are given the legacy class `BankAccount` with buggy behavior.

### Refactoring Tasks
1. Prevent thread-safety issues during concurrent deposit, withdraw, and transfer operations.
2. Defensively reject negative or NaN amounts.
3. Fix transaction fee double-charging bug.
4. Provide comprehensive unit tests verifying concurrent integrity.

### Examples (LeetCode Style)

**Example 1:**
```text
Input Operations:
1. new BankAccount("ACC-101", 100.0) -> Balance = 100.0
2. deposit(50.0) -> Balance = 150.0
3. withdraw(30.0) with fee rate 0.05 (fee = 5.0) -> Withdraws 30.0, fee 5.0 -> Balance = 115.0
4. withdraw(200.0) -> throws InsufficientFundsException (balance unchanged)
```
