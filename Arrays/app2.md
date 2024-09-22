
```markdown
# Java Arrays: 2D and 3D Arrays

## 1D Array
```java
int[] arr = {2, 3, 4, 5};
```

## 2D Arrays

### Declaration and Initialization
```java
// Direct initialization
int[][] arr2d = {
    {2, 3, 4},
    {10, 5, 16}
};

// Array with default size
int[][] arrwithsize = new int[3][3];
```

### Accessing and Modifying Elements
```java
// Modifying an element
arr2d[0][0] = 10;
```

### Printing 2D Arrays

#### Using Enhanced For Loop
```java
System.out.print("[ ");
for (int[] arr23 : arr2d) {
    for (int j : arr23) {
        System.out.print(j + " ");
    }
    System.out.println();
}
System.out.print(" ] ");
System.out.println();
```

#### Using Nested For Loops
```java
for (int i = 0; i < arr2d.length; i++) {
    for (int j = 0; j < arr2d[i].length; j++) {
        System.out.print(arr2d[i][j] + " ");
    }
    System.out.println();
}
```

## 3D Arrays

### Declaration and Initialization
```java
int[][][] arr3d = {
    {
        {10, 20, 30},
        {20, 20, 30}
    },
    {
        {10, 20, 30},
        {20, 20, 30}
    }
};
```

### Accessing and Modifying Elements
```java
// Modifying an element
arr3d[0][0][1] = 40;
System.out.print(arr3d[0][0][1]);
```

### Printing 3D Arrays
```java
System.out.print("[ ");
for (int[][] arr23 : arr3d) {
    for (int[] j : arr23) {
        for (int k : j) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
    System.out.println();
}
System.out.print(" ] ");
System.out.println();
```

## 4D Arrays

### Declaration
```java
byte[][][] arr4d = new byte[2][3][4];
```

## Summary
- **1D Arrays**: Simple linear arrays.
- **2D Arrays**: Arrays of arrays (matrices).
- **3D Arrays**: Arrays of arrays of arrays (3D matrices).
- **4D Arrays**: Arrays of arrays of arrays of arrays.

## Example of Summing Elements
```java
int[] arrsid = {2, 3, 4, 5};
int sum = 0;
for (int i : arrsid) {
    sum += i;
}
System.out.println(sum);
```

*Note: The above code snippets are for understanding and practicing array manipulation in Java.*
```

You can save this content in a Markdown file for your notes. If you need any more details or adjustments, let me know!