# UC12 – Strategy Pattern for Palindrome Algorithms

## Goal

Use the Strategy Pattern to dynamically choose different palindrome checking algorithms.

## Flow

1. Define a `PalindromeStrategy` interface.
2. Implement different strategies such as `StackStrategy` and `DequeStrategy`.
3. Inject the desired strategy into `PalindromeService`.
4. The service executes the chosen algorithm.

## Concepts Used

* Interface
* Polymorphism
* Strategy Pattern
* Stack / Deque Data Structures
* Object-Oriented Design

## Sample Output

```
Input text: madam
Is it a palindrome? : true
```
