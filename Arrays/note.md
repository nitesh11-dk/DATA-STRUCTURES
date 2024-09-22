# Array Notes

## 1. Declaring Arrays
### Valid Ways:
- `int arr[] = {2, 3, 4, 5};`
- `int[] arr = {2, 3, 4, 5, 677, 78};`
- `int arr[] = new int[20];`
- `int[] arr = new int[20];`
- `int arr[] = new int[20];`

### Invalid Ways:
- `int arr[];`
- `int arr[20]; = new int[]`
- `int arr[] = /int{2, 3, 4, 5};`
- `int arr[] = new int{2, 3, 4, 5};`

## 2. Accessing and Updating Array Elements
```java
arr[0] = 23;
arr[10] = 99;
System.out.print(arr[0]);
```

## 3. Array as Parameter
Passing an array to a function:
```java
public static void PrintArray(int arr[]) {
    arr[0] = 23;
    System.out.print("[ ");
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.print(" ] ");
    System.out.println();
}
```

## 4. Sending Array as Argument in Methods
Arrays are passed by **reference**, not by value:
```java
int arr234[] = {2, 3, 4, 5};
PrintArray(arr234);
PrintArray(new int[20]);
PrintArray(new int[]{2,3,4,5});
```

Invalid syntax for passing arrays:
- `PrintArray(new []int{2, 3, 43});`
- `PrintArray(int[20]);`
- `PrintArray(int[20] {2, 3, 4});`
- `PrintArray(new int[4]{2, 3, 4, 5});`

## 5. Arrays Are Passed by Reference
- Arrays in Java are always passed by reference, meaning changes made to the array inside the method affect the original array.

## 6. Loops on Arrays

### For Loop:
```java
int arr12[] = {2, 3, 4, 5};
for (int i = 0; i < arr12.length; i++) {
    System.out.print(arr12[i]);
}
```

### Enhanced For Loop:
```java
for (int i : arr12) { // i in array name
    System.out.print(i);
}
```
