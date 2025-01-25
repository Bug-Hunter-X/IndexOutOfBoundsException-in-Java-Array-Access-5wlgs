# Java IndexOutOfBoundsException Example

This repository demonstrates a common Java error: the `IndexOutOfBoundsException`. This exception occurs when you try to access an array element using an index that is outside the valid range of indices for that array.

## The Bug

The file `bug.java` contains code that attempts to access an array element at index 5 of an array with length 5.  Since valid indices are 0-4, this results in an `IndexOutOfBoundsException`.

## The Solution

The file `bugSolution.java` provides a corrected version.  It checks the index before accessing the array element to avoid the exception.  It also demonstrates how to handle potential exceptions using a `try-catch` block. 