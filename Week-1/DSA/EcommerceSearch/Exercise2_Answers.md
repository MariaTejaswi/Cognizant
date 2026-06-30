# Exercise 2: E-commerce Platform Search Function

## 1. What is Big O Notation?

Big O notation is used to measure the efficiency of an algorithm by describing how its running time grows as the input size increases.

It helps compare different algorithms and choose the most efficient one.

---

## 2. Best, Average, and Worst Cases

### Linear Search

Best Case:
- Element found at the first position.
- Time Complexity: O(1)

Average Case:
- Element found somewhere in the middle.
- Time Complexity: O(n)

Worst Case:
- Element is at the last position or not present.
- Time Complexity: O(n)

---

### Binary Search

Best Case:
- Element found at the middle.
- Time Complexity: O(1)

Average Case:
- Time Complexity: O(log n)

Worst Case:
- Time Complexity: O(log n)

Note: Binary Search requires the array to be sorted.

---

## 3. Time Complexity Comparison

| Algorithm | Best | Average | Worst |
|-----------|------|---------|-------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## 4. Which Algorithm is Better?

Binary Search is more suitable for an e-commerce platform because it is much faster for large datasets.

However, the products must be sorted before using Binary Search.

If the data is unsorted or changes frequently, Linear Search may be used.