# Java List Implementations – Core Understanding + Edge Cases

---

## 🔹 1. ArrayList

### 🧠 Concept Focus

- Dynamic resizing
- Random access (O(1))
- Insert/delete cost (O(n))

### ✅ Practice Questions

1. **Basic CRUD**
   - Create an `ArrayList` of integers.
   - Add 10 elements.
   - Remove all even numbers.

2. **Index-based trap**

   ```java
   for (int i = 0; i < list.size(); i++) {
       if (list.get(i) % 2 == 0) {
           list.remove(i);
       }
   }
   ```

   👉 Why does this skip elements? Fix it.

3. **Duplicate removal**
   - Remove duplicates without using `Set`

4. **Reverse list**
   - Without using `Collections.reverse()`

5. **Resize understanding** *(important)*
   - Add 1 million elements → measure time
   - Then initialize with capacity → compare performance

6. **Find second largest element**

---

## 🔹 2. LinkedList – Where it actually matters

### 🧠 Concept Focus

- Fast insert/delete
- Slow random access
- Node-based structure

### ✅ Practice Questions

1. **Insert at head/tail**
   - Simulate queue behavior using `LinkedList`

2. **Middle element**
   - Find middle using:
     - Iteration
     - Two-pointer (fast/slow)

3. **Reverse LinkedList**
   - Iterative approach

4. **Remove nth element from end**

5. **Detect cycle** *(important DSA)*
   - Floyd's cycle detection

6. **Compare performance**
   - Insert at index 0: `ArrayList` vs `LinkedList`

👉 This builds real intuition (very important for interviews)

---

## 🔹 3. Vector – Legacy but interview trap

### 🧠 Concept Focus

- Thread-safe (synchronized)
- Performance overhead

### ✅ Practice Questions

1. **Difference demo**
   - Create `Vector` and `ArrayList`
   - Add elements in multi-thread → observe behavior

2. **Why slow?**
   - Benchmark `add()` vs `ArrayList`

3. **Legacy question**
   - Why is `Vector` rarely used now?

👉 You should be able to explain:
> *"Vector is synchronized, hence thread-safe but slower than ArrayList"*

---

## 🔹 4. Stack – LIFO understanding

### 🧠 Concept Focus

- Push, Pop, Peek
- Real-world usage

### ✅ Practice Questions

1. **Valid Parentheses** *(VERY IMPORTANT)*

   ```
   Input: "({[]})" → true
   Input: "({[})" → false
   ```

2. **Min Stack**
   - Design stack with `getMin()` in O(1)

3. **Reverse string using stack**

4. **Evaluate postfix expression**

5. **Next greater element**

---

## 🔹 5. CopyOnWriteArrayList – Advanced *(very important for backend)*

### 🧠 Concept Focus

- Thread-safe without locking reads
- Copy-on-write behavior

### ✅ Practice Questions

1. **Concurrent read/write demo**
   - One thread reading
   - One thread writing
   - Compare with `ArrayList` (`ConcurrentModificationException`)

2. **Fail-safe vs Fail-fast**
   - Show difference:
     - `ArrayList` → fails
     - `CopyOnWriteArrayList` → works

3. **When NOT to use it**
   - Simulate heavy write scenario → observe performance

👉 Key takeaway:
> *Good for read-heavy, write-light systems*

---

## 🔥 Bonus: Real Interview-Level Mixed Questions

These combine everything 👇

1. **Design a Browser History**
   - Back/forward functionality
   - Use: `List` OR `Stack`

2. **LRU Cache** *(VERY IMPORTANT)*
   - Use: `LinkedList` + `HashMap`
   - Or: `LinkedHashMap` (bonus)

3. **Remove duplicates while preserving order**
   - Using: `List` + `Set`

4. **Fail-fast behavior**
   - Modify list while iterating → exception
   - Fix using: `Iterator` or `CopyOnWriteArrayList`

---

## 🔥 How to Practice

Instead of solving randomly, do it like this:

| Day | Topic |
|-----|-------|
| Day 1 | ArrayList (all questions) |
| Day 2 | LinkedList |
| Day 3 | Stack |
| Day 4 | Concurrency (`CopyOnWriteArrayList`) |

👉 Then revise by explaining differences **out loud**

---

## 🔥 What You'll Achieve

After solving these, you will:

- Understand when to use which `List`
- Handle interview edge cases
- Write clean, bug-free code
