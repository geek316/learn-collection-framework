# Java Map Types — DSA Interview Guide

---

## 🧠 1. HashMap

### 🔍 Core Theory

- **Data structure:** Array + LinkedList → Tree (Java 8+)
- **Time Complexity:**
  - `put` / `get` → O(1) avg, O(log n) worst (after treeify)
- **Allows:** 1 null key, multiple null values
- **Collision Handling:**
  - Before Java 8 → LinkedList
  - After Java 8 → Tree when bucket size > 8
- **Resize Trigger:** Load factor (default 0.75)

### ⚠️ Critical Concepts

- `equals()` + `hashCode()` contract
- Hash collision → performance degradation
- Not thread-safe

### 🧪 Problems

**Problem 1: Subarray Sum Equals K**
> Tests prefix sum + map usage. Edge: negative numbers.

**Problem 2: Longest Substring Without Repeating Characters**
> Sliding window + map.

**Problem 3: Group Anagrams**
> Key design problem (sorted string vs freq array).

**Problem 4: Custom Object as Key**
> Write class with broken `hashCode()` → observe failure.

**Problem 5: Frequency Map with Large Data**
> Optimize memory + resizing.

### 💣 Edge Case Traps

- Mutable keys → disaster
- Poor `hashCode` → O(n)
- Rehashing cost spike

---

## 🔗 2. LinkedHashMap

### 🔍 Core Theory

- Extends `HashMap`
- Maintains order:
  - Insertion order (default)
  - Access order (LRU mode)
- Internally: HashMap + Doubly Linked List

### ⚠️ Critical Concepts

- `accessOrder=true` → LRU behavior
- `removeEldestEntry()` → eviction logic

### 🧪 Problems

**Problem 6: LRU Cache ⭐ MUST DO**
> Most asked system design-lite problem.

**Problem 7: First Unique Character in Stream**
> Order preservation.

**Problem 8: Deduplicate While Preserving Order**

### 💣 Edge Case Traps

- Access vs insertion order confusion
- Iteration order assumptions

---

## 🌲 3. TreeMap

### 🔍 Core Theory

- Based on Red-Black Tree
- Always sorted
- **Time:** `put` / `get` / `remove` → O(log n)

### ⚠️ Critical Concepts

- No null keys
- Uses `Comparable` OR `Comparator`
- Key navigation methods:

```java
floorKey()    // greatest key ≤ given key
ceilingKey()  // smallest key ≥ given key
higherKey()   // strictly greater
lowerKey()    // strictly less
```

### 🧪 Problems

**Problem 9: Calendar Booking (Interval Conflict)**

**Problem 10: Top K Frequent Elements (Sorted)**

**Problem 11: Range Queries**
> Find all keys between X and Y.

### 💣 Edge Case Traps

- Inconsistent comparator → data loss
- Comparator not matching `equals()`

---

## ⚡ 4. ConcurrentHashMap

### 🔍 Core Theory

- Thread-safe without full locking
- **Evolution:**
  - Java 7 → Segment locking
  - Java 8 → CAS + synchronized blocks

### ⚠️ Critical Concepts

- No null keys or values
- Weakly consistent iterator
- Atomic methods:

```java
computeIfAbsent()
putIfAbsent()
```

### 🧪 Problems

**Problem 12: Multi-threaded Word Count**

**Problem 13: Cache with `computeIfAbsent`**

**Problem 14: Rate Limiter**

### 💣 Edge Case Traps

- Race condition if using `HashMap` in multi-threaded context
- Double computation without `computeIfAbsent`

---

## 🧪 5. WeakHashMap

### 🔍 Core Theory

- Keys are **weakly referenced**
- GC removes entries when key is no longer strongly referenced elsewhere

### ⚠️ Critical Concepts

- Good for: caches, avoiding memory leaks

### 🧪 Problems

**Problem 15: Memory Leak Simulation**

**Problem 16: Cache with Auto Cleanup**

### 💣 Edge Case Traps

- Unpredictable removal timing
- Debugging is tricky

---

## 🧬 6. IdentityHashMap

### 🔍 Core Theory

- Uses **reference equality** (`==`) instead of `.equals()`

### ⚠️ Critical Concepts

```java
new String("a") != "a"  // These are different keys in IdentityHashMap
```

### 🧪 Problems

**Problem 17: Compare Behavior with HashMap**

**Problem 18: Object Graph Traversal**

### 💣 Edge Case Traps

- Breaks logical equality expectations
- Rarely used → but a common interview trap

---

## 🔥 Mixed Advanced Problems

**Problem 19: LFU Cache**
> Combine `HashMap` + `LinkedHashMap`.

**Problem 20: Sliding Window Maximum**
> Map + Deque combo.

**Problem 21: Distributed Cache Design**
> Use `ConcurrentHashMap` with eviction logic.

---

## Quick Reference

| Map Type | Ordering | Null Keys | Thread-Safe | Time Complexity |
|---|---|---|---|---|
| `HashMap` | None | 1 allowed | ❌ | O(1) avg |
| `LinkedHashMap` | Insertion / Access | 1 allowed | ❌ | O(1) avg |
| `TreeMap` | Sorted | ❌ | ❌ | O(log n) |
| `ConcurrentHashMap` | None | ❌ | ✅ | O(1) avg |
| `WeakHashMap` | None | 1 allowed | ❌ | O(1) avg |
| `IdentityHashMap` | None | 1 allowed | ❌ | O(1) avg |
