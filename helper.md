# Custom Java Helper Methods

This README contains custom helper methods for string manipulation in Java, implemented without using the built-in methods directly. These methods offer a hands-on approach to understanding fundamental string operations.

---

## 🚀 Methods Included

### 1. Custom `toCharArray` Method
Converts a given string to a character array manually.

**Code:**
```java
public static char[] customToCharArray(String str) {
    char[] arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
        arr[i] = str.charAt(i);
    }
    return arr;
}

### 1. Custom `contains` method
Checks if a character exists within a given character array.

**Code:**
```java
private static boolean contains(char[] arr, char target) {
    for (char c : arr) {
        if (c == target) {
            return true;
        }
    }
    return false;
}


### 1. Custom `charAt` method
Checks if a character exists within a given character array.

**Code:**
```java

public static char customCharAt(String str, int index) {
    if (index < 0 || index >= str.length()) {
        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + str.length());
    }
    char[] charArray = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
        charArray[i] = str.getBytes()[i];
    }
    return charArray[index];
}





