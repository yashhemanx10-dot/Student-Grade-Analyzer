# Student Grade Analyser

A console-based Java application that collects grades for 5 students and performs various statistical analyses on them.

---

## Features

- Accepts grades for 5 students via console input
- Calculates the **average** grade
- Finds the **highest** and **lowest** grade
- Counts how many students **passed** (grade ≥ 60)
- Returns a **deduplicated** list of grades (removes duplicates)

---

## How to Run

```
javac Task2.java
java Task2
```

**Example interaction:**
```
Enter grade for student 1: 85
Enter grade for student 2: 72
Enter grade for student 3: 60
Enter grade for student 4: 85
Enter grade for student 5: 45

Average grade: 69.4
Highest grade: 85
Lowest grade: 45
Number of students who passed: 4
Deduplicated list of grades: [85, 72, 60, 45]
```

---

## Methods

| Method | Description |
|---|---|
| `calculateAverage(int[] grades)` | Returns the average of all grades as a double |
| `findHighest(int[] grades)` | Returns the highest grade in the array |
| `findLowest(int[] grades)` | Returns the lowest grade in the array |
| `countPassing(int[] grades)` | Counts students with a grade of 60 or above |
| `deduplicatedGrades(int[] grades)` | Returns a new array with duplicate grades removed |

---

## Technologies Used

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Concepts:** Arrays, ArrayList, static methods, for-each loops, type casting

---

## Author
**Hemant Bheekarry**

Developed as part of university programming assignments.
