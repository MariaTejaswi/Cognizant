# Exercise 1: Inventory Management System

## 1. Why are Data Structures and Algorithms important?

- They help store and retrieve large amounts of data efficiently.
- They improve application performance.
- They reduce execution time.
- They optimize memory usage.

## 2. Suitable Data Structures

- ArrayList: Suitable for sequential storage but searching, updating, and deleting products require linear search (O(n)).
- HashMap: Suitable for storing products using productId as the key. It provides faster access and modification.

## 3. Time Complexity

Operation - Time Complexity 
----------------------------
Add - O(1) 
Update - O(1) 
Delete - O(1) 
Search - O(1) 

## 4. Optimization

- Use HashMap instead of ArrayList for faster lookup.
- Use productId as the key to achieve constant-time average performance.