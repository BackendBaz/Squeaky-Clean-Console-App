**Squeaky Clean Console App**

- **Reference: [Exercism's Java Track](https://exercism.org/tracks/java)**
- **`Learning Exercise`**

# Instructions

In this exercise you will implement a partial set of utility routines to help a developer
clean up SqueakyClean names.

In the 4 tasks you will gradually build up the `clean` method.
A valid SqueakyClean name comprises zero or more letters and underscores.

In all cases the input string is guaranteed to be **non-null**. 
Note that the `clean` method should treat an **empty string as valid**.

1. Replace any spaces (` `) encountered with underscores (`_`)
   - This also applies to **leading** and **trailing spaces**.
2. Convert **kebab-case** to **camelCase**
3. Convert leetspeak to normal text
   - For simplicity, we will only be replacing `4`, `3`, `0`, `1` and `7` with `a`, `e`, `o`, `l`, and `t`, respectively.
4. **Omit characters** that **are not letters**
